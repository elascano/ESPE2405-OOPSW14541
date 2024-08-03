const { MongoClient } = require('mongodb');

const uri = 'mongodb+srv://villagomez:<villagomez>@cluster0.hdylr9r.mongodb.net/?retryWrites=true&w=majority';
const client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });

let db;

async function connectDB() {
    try {
        await client.connect();
        db = client.db('opp');
        console.log('Conectado a MongoDB');
    } catch (error) {
        console.error('Error al conectar a MongoDB:', error);
    }
}

function getDB() {
    return db;
}

module.exports = { connectDB, getDB };