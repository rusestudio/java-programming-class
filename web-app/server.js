const express = require('express');
const cors = require('cors');
const fs = require('fs');
const path = require('path');
const { exec } = require('child_process');

const app = express();
const PORT = 3000;

// Middleware
app.use(cors());
app.use(express.json());
app.use(express.static(path.join(__dirname, 'public')));

// Root directory for Java files (parent of web-app)
const javaRoot = path.join(__dirname, '..');

// API to list Java files recursively
app.get('/api/files', (req, res) => {
  const files = [];
  function scanDir(dir, relativePath = '') {
    const items = fs.readdirSync(dir);
    items.forEach(item => {
      const fullPath = path.join(dir, item);
      const relPath = path.join(relativePath, item);
      if (fs.statSync(fullPath).isDirectory()) {
        scanDir(fullPath, relPath);
      } else if (item.endsWith('.java')) {
        files.push(relPath);
      }
    });
  }
  scanDir(javaRoot);
  res.json(files);
});

// API to get file content
app.get('/api/file', (req, res) => {
  const filePath = req.query.path;
  if (!filePath) return res.status(400).send('Path required');
  const fullPath = path.join(javaRoot, filePath);
  if (!fs.existsSync(fullPath) || !fullPath.endsWith('.java')) {
    return res.status(404).send('File not found');
  }
  const content = fs.readFileSync(fullPath, 'utf8');
  res.send(content);
});

// API to run Java code
app.post('/api/run', (req, res) => {
  const { code, className } = req.body;
  if (!code || !className) return res.status(400).send('Code and className required');

  // Write code to temp file
  const tempDir = path.join(__dirname, 'temp');
  if (!fs.existsSync(tempDir)) fs.mkdirSync(tempDir);
  const javaFile = path.join(tempDir, `${className}.java`);
  fs.writeFileSync(javaFile, code);

  // Compile
  exec(`javac "${javaFile}"`, (err, stdout, stderr) => {
    if (err) {
      fs.unlinkSync(javaFile);
      return res.json({ output: stderr, error: true });
    }

    // Run
    const classFile = path.join(tempDir, className);
    exec(`java -cp "${tempDir}" ${className}`, (err, stdout, stderr) => {
      fs.unlinkSync(javaFile);
      const classFilePath = `${classFile}.class`;
      if (fs.existsSync(classFilePath)) fs.unlinkSync(classFilePath);
      res.json({ output: stdout || stderr, error: !!err });
    });
  });
});

app.listen(PORT, () => {
  console.log(`Server running on http://localhost:${PORT}`);
});