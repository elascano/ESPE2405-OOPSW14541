const { app, BrowserWindow, ipcMain } = require('electron');
const path = require('path');
const StudentsController = require('./controllers/StudentsController');

const dbUri = "your_mongodb_connection_string"; // Reemplaza con tu cadena de conexión MongoDB
const dbName = "your_database_name"; // Reemplaza con el nombre de tu base de datos

let mainWindow;

function createWindow() {
    mainWindow = new BrowserWindow({
        width: 800,
        height: 600,
        webPreferences: {
            preload: path.join(__dirname, 'views', 'Main.js'),
            nodeIntegration: true,
            contextIsolation: false
        }
    });

    mainWindow.loadFile(path.join(__dirname, 'views', 'Main.html'));

    mainWindow.on('closed', () => {
        mainWindow = null;
    });
}

app.on('ready', () => {
    new StudentsController(dbUri, dbName);
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

// Handle navigation
ipcMain.on('navigate', (event, view) => {
    if (mainWindow) {
        mainWindow.loadFile(path.join(__dirname, 'views', view));
    }
});