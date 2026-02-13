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

// Root directory for Java files
const javaRoot = path.join(__dirname);

// API to list Java files recursively
app.get('/api/files', (req, res) => {
  console.log('API /api/files called');
  try {
    const files = JSON.parse(fs.readFileSync(path.join(__dirname, 'files.json'), 'utf8'));
    console.log('Files loaded from files.json:', files.length);
    res.json(files);
  } catch (error) {
    console.error('Error loading files.json:', error);
    res.status(500).json({ error: error.message });
  }
});

// API to get file content
app.get('/api/file', (req, res) => {
  const filePath = req.query.path.replace(/\\/g, '/'); // Normalize path separators
  console.log('API /api/file called with path:', filePath);
  if (!filePath) return res.status(400).send('Path required');
  const fullPath = path.join(javaRoot, filePath);
  console.log('Full path:', fullPath);
  try {
    if (!fs.existsSync(fullPath) || !fullPath.endsWith('.java')) {
      console.log('File not found or not .java');
      return res.status(404).send('File not found');
    }
    const content = fs.readFileSync(fullPath, 'utf8');
    console.log('File content length:', content.length);
    res.send(content);
  } catch (error) {
    console.error('Error in /api/file:', error);
    res.status(500).json({ error: error.message });
  }
});

// API to run Java code
app.post('/api/run', (req, res) => {
  // Note: Running Java code requires JDK, which isn't available on Vercel.
  // This will fail in production. For demo, return a message.
  res.json({ output: "Java execution not supported on Vercel. Please run locally.", error: true });
});

app.listen(PORT, () => {
  console.log(`Server running on http://localhost:${PORT}`);
});