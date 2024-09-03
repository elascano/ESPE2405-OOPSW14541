const express = require('express');
const bodyParser = require('body-parser');
const mongoose = require('mongoose');
const app = express();
const port = 3000;

// Middleware to parse JSON bodies
app.use(bodyParser.json());

// Serve static files from the "public" directory
app.use(express.static('public'));

// Connect to MongoDB
mongoose.connect('mongodb+srv://bpgualotuna1:bpgualotuna1@cluster0.elvwlgc.mongodb.net/', {
    useNewUrlParser: true,
    useUnifiedTopology: true
})
.then(() => console.log('MongoDB connected...'))
.catch(err => console.error('MongoDB connection error:', err));

// Define the schema and model
const buildingSchema = new mongoose.Schema({
    name: String,
    address: String,
    floors: Number,
    departmentName: String,
    creationDate: Date
}, { collection: 'apartments' });

const Building = mongoose.model('Building', buildingSchema);

// Handle POST requests to /api/buildings
app.post('/api/buildings', async (req, res) => {
    const building = new Building(req.body);
    try {
        await building.save();
        res.status(201).send(building);
    } catch (error) {
        res.status(400).send(error);
    }
});

// Start the server
app.listen(port, () => {
    console.log(`Server running at http://localhost:${port}`);
});
