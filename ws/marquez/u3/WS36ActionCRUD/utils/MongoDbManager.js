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

    async addShoe(shoe) {
        const collection = this.db.collection('shoes');
        const result = await collection.insertOne(shoe);
        console.log(`Shoe inserted with _id: ${result.insertedId}`);
    }

    async close() {
        await this.client.close();
        console.log("Connection closed");
    }
}

module.exports = MongoDbManager;