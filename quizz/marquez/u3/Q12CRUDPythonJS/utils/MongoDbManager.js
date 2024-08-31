const { MongoClient } = require('mongodb');

class MongoDbManager {
    constructor(uri, dbName) {
        this.client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });
        this.dbName = dbName;
    }

    async connect() {
        await this.client.connect();
        console.log("Connected successfully to server");
        this.db = this.client.db(this.dbName);
    }

    async addStudent(student) {
        const collection = this.db.collection('studentsQ');
        const result = await collection.insertOne(student);
        console.log(`Student inserted with _id: ${result.insertedId}`);
    }

    async findStudentById(studentId) {
        const collection = this.db.collection('studentsQ');
        const student = await collection.find({ id: parseInt(studentId) }).toArray();
        return student;
    }

    async close() {
        await this.client.close();
        console.log("Connection closed");
    }
}

module.exports = MongoDbManager;