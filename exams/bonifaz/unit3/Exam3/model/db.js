import { MongoClient } from 'mongodb';

const uri = 'mongodb+srv://bonifaz:bonifaz@cluster0.vleslwo.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0';
const dbName = 'strategyBonifaz';

let client;

export async function connectDB() {
    if (!client) {
        client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });
        await client.connect();
    }
    return client.db(dbName);
}

export async function closeDB() {
    if (client) {
        await client.close();
        client = null;
    }
}
