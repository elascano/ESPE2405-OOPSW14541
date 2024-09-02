const { MongoClient } = require('mongodb');

class MongoDBController {
    static async saveSortedArray(sortType, sortedArray) {
        const uri = "mongodb+srv://vaca:vaca@cluster0.42hdahs.mongodb.net/"; 
        const client = new MongoClient(uri);

        try {
            await client.connect();
            const database = client.db('OOPEXAM3');
            const collection = database.collection('Array');
            const doc = {
                sortType: sortType,
                sortedArray: sortedArray,
                timestamp: new Date()
            };
            await collection.insertOne(doc);
            console.log("Document inserted successfully");
        } finally {
            await client.close();
        }
    }
}

module.exports = MongoDBController;
