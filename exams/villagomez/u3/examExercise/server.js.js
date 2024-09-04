import express from 'express';
import mongoose from 'mongoose';
import dotenv from 'dotenv'; 

dotenv.config(); // Load environment variables

const app = express();
const port = 4000;

const mongoDBUri = process.env.MONGODB_URI;

mongoose.connect(mongoDBUri)
  .then(() => console.log('Connected to MongoDB'))
  .catch(err => console.error('MongoDB connection error:', err));



const dataSchema = new mongoose.Schema({
    unsortedArray: [Number],
    size: Number,
    algorithm: String,
    sortedArray: [Number]
});

// Define the model for the collection
const Data = mongoose.model('Data', dataSchema, 'sortingResults'); // 'sortingResults' is the collection name

app.use(express.json());
app.use(express.static('view'));

app.post('/save', async (req, res) => {
    try {
        const data = new Data(req.body);
        await data.save();
        res.status(200).send('Data saved successfully');
    } catch (error) {
        res.status(500).send('Error saving data');
    }
});

app.listen(port, () => {
    console.log(`Server running at http://localhost:${port}`);
});
