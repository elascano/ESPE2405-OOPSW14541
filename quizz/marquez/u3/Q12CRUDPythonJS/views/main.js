const { ipcRenderer } = require('electron');

document.getElementById('createStudentBtn').addEventListener('click', () => {
    ipcRenderer.send('navigate', 'CreateStudent.html');
});

document.getElementById('searchStudentBtn').addEventListener('click', () => {
    ipcRenderer.send('navigate', 'SearchStudent.html');
});