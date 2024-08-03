// controller/MongoDBConnection.js
const { MongoClient } = require('mongodb');
const uri = "mongodb+srv://vaca:vaca@cluster0.42hdahs.mongodb.net/"; 

let client;

async function connectToDB() {
    if (!client) {
        client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });
        await client.connect();
    }
    return client.db('clinic').collection('doctors');
}

module.exports = connectToDB;
