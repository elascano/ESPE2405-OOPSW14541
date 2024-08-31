const { ipcMain } = require('electron');
const MongoDbManager = require('../utils/MongoDbManager');
const Student = require('../models/Student');

class StudentsController {
    constructor(dbUri, dbName) {
        this.mongoDbManager = new MongoDbManager(dbUri, dbName);

        ipcMain.on('create-student', async (event, studentData) => {
            const student = new Student(studentData.id, studentData.name, studentData.lastName, studentData.age);
            await this.mongoDbManager.connect();
            await this.mongoDbManager.addStudent(student);
            await this.mongoDbManager.close();
        });

        ipcMain.on('search-student', async (event, studentId) => {
            await this.mongoDbManager.connect();
            const results = await this.mongoDbManager.findStudentById(studentId);
            event.reply('search-results', results);
            await this.mongoDbManager.close();
        });

        ipcMain.on('navigate', (event, view) => {
            event.sender.send('navigate', view);
        });
    }
}

module.exports = StudentsController;