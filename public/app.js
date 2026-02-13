// Load file list on page load
document.addEventListener('DOMContentLoaded', loadFiles);

async function loadFiles() {
  try {
    const response = await fetch('/api/files');
    const files = await response.json();
    const fileList = document.getElementById('fileList');
    files.forEach(file => {
      const li = document.createElement('li');
      li.textContent = file;
      li.addEventListener('click', () => loadFile(file));
      fileList.appendChild(li);
    });
  } catch (error) {
    console.error('Error loading files:', error);
  }
}

async function loadFile(filePath) {
  try {
    const response = await fetch(`/api/file?path=${encodeURIComponent(filePath)}`);
    const code = await response.text();
    document.getElementById('codeDisplay').textContent = code;
    // Extract class name (simple: first public class)
    const classMatch = code.match(/public class (\w+)/);
    window.currentClass = classMatch ? classMatch[1] : 'Main';
    window.currentCode = code;
  } catch (error) {
    console.error('Error loading file:', error);
  }
}

document.getElementById('runBtn').addEventListener('click', async () => {
  if (!window.currentCode || !window.currentClass) {
    alert('Please select a Java file first.');
    return;
  }
  try {
    const response = await fetch('/api/run', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ code: window.currentCode, className: window.currentClass })
    });
    const result = await response.json();
    document.getElementById('outputDisplay').textContent = result.output;
  } catch (error) {
    console.error('Error running code:', error);
  }
});

document.getElementById('copyBtn').addEventListener('click', () => {
  if (!window.currentCode) {
    alert('Please select a Java file first.');
    return;
  }
  navigator.clipboard.writeText(window.currentCode).then(() => {
    alert('Code copied to clipboard!');
  }).catch(err => {
    console.error('Failed to copy: ', err);
  });
});