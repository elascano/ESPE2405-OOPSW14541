import express from 'express';
import { MongoClient } from 'mongodb';

const uri = 'mongodb+srv://bonifaz:bonifaz@cluster0.vleslwo.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0';
const dbName = 'strategyBonifaz';
const client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });

const app = express();
app.use(express.json());

async function connectDB() {
    if (!client.isConnected()) {
        await client.connect();
    }
    return client.db(dbName);
}

app.post('/api/sort', async (req, res) => {
    const { unsorted, size, sortAlgorithm, sorted } = req.body;

    try {
        const db = await connectDB();
        const collection = db.collection('arrayChristian');
        const document = { unsorted, size, sortAlgorithm, sorted };

        await collection.insertOne(document);
        res.status(201).send('Document inserted successfully');
    } catch (error) {
        console.error('Error inserting document:', error);
        res.status(500).send('Error inserting document');
    }
});

const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});
