import { MongoClient } from 'mongodb';

const uri = 'mongodb+srv://segarra:segarra@cluster0.b2q6ac3.mongodb.net/';
const client = new MongoClient(uri);

export async function saveStoreToDatabase(store) {
    try {
        await client.connect();
        const database = client.db('Q6170');
        const stores = database.collection('Stores');
        await stores.insertOne(store);
    } finally {
        await client.close();
    }
}

