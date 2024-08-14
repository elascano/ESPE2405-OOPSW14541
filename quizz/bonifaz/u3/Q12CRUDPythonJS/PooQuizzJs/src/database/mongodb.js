const { MongoClient } = require('mongodb');
const Player = require('../models/player');

const URI = "mongodb+srv://cedeno:cedeno@cluster0.s2nvcgm.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
const DATABASE_NAME = "POO";

async function getDatabase() {
    const client = new MongoClient(URI, { useNewUrlParser: true, useUnifiedTopology: true });
    await client.connect();
    return client.db(DATABASE_NAME);
}

async function savePlayer(player) {
    const db = await getDatabase();
    const collection = db.collection('Player');

    const document = {
        id: player.getId(),
        name: player.getName(),
        description: player.getDescription(),
        goal: player.getGoal(),
        asist: player.getAsist(),
        GA: player.getGA()
    };

    await collection.insertOne(document);
}

module.exports = { savePlayer };
