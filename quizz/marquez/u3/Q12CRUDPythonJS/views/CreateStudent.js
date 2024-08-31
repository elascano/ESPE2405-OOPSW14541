const { ipcRenderer } = require('electron');

document.getElementById('studentForm').addEventListener('submit', (event) => {
    event.preventDefault();

    const id = document.getElementById('id').value;
    const name = document.getElementById('name').value;
    const lastName = document.getElementById('lastName').value;
    const age = document.getElementById('age').value;

    const student = { id: parseInt(id), name, lastName, age };

    ipcRenderer.send('create-student', student);
    ipcRenderer.send('navigate', 'Main.html'); // Navigate back to main menu after creation
});