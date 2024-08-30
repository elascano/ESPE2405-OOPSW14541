const { ipcRenderer } = require('electron');

document.getElementById('shoesForm').addEventListener('submit', (event) => {
    event.preventDefault();

    const id = document.getElementById('id').value;
    const price = document.getElementById('price').value;
    const size = document.getElementById('size').value;
    const brand = document.getElementById('brand').value;

    const shoe = { id: parseInt(id), price: parseFloat(price), size: parseInt(size), brand };

    ipcRenderer.send('create-shoe', shoe);
});