const { app, BrowserWindow } = require('electron');
const path = require('path');
const ShoesController = require('./controllers/ShoesController');


const dbUri = "mongodb+srv://Jenni:Jenni@cluster0.tjpvdfr.mongodb.net/"; 
const dbName = "OOP"; 

let mainWindow;

function createWindow() {
    mainWindow = new BrowserWindow({
        width: 500,
        height: 400,
        webPreferences: {
            preload: path.join(__dirname, 'views', 'CreateShoes.js'),
            nodeIntegration: true,
            contextIsolation: false
        }
    });

    mainWindow.loadFile(path.join(__dirname, 'views', 'CreateShoes.html'));

    mainWindow.on('closed', () => {
        mainWindow = null;
    });
}

app.on('ready', () => {
    new ShoesController(dbUri, dbName);
    createWindow();
});

app.on('window-all-closed', () => {
    if (process.platform !== 'darwin') {
        app.quit();
    }
});

app.on('activate', () => {
    if (mainWindow === null) {
        createWindow();
    }
});