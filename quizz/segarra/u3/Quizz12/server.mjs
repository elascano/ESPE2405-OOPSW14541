import express from 'express';
import bodyParser from 'body-parser';
import { saveStoreToDatabase } from './utils/mongoDB.mjs'; 
import StoreController from './controller/storeController.mjs';

const app = express();
const port = 3000;

app.use(bodyParser.json());
app.use(express.static('view'));


app.post('/api/store', async (req, res) => {
    console.log('Received store data:', req.body); 
    try {
        const store = req.body;
        await saveStoreToDatabase(store);
        res.status(200).send('Store saved successfully!');
    } catch (error) {
        console.error('Error saving store:', error);
        res.status(500).send('Failed to save store.');
    }
});

app.listen(port, () => {
    console.log(`Server running at http://localhost:${port}/`);
});
