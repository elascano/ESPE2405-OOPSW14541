const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();
app.use(bodyParser.json());
app.use(cors());

mongoose.set('strictQuery', true);

mongoose.connect('mongodb+srv://bonifaz:bonifaz@cluster0.vleslwo.mongodb.net/opp?retryWrites=true&w=majority&appName=Cluster0')
    .then(() => {
        console.log('Connected to MongoDB');
    })
    .catch(err => {
        console.error('Error connecting to MongoDB', err);
    });

const contributorSchema = new mongoose.Schema({
    id: String,
    email: String,
    name: String,
    password: String,
    documentation: Boolean,
    startDate: Date,
    endDate: Date,
    remainingDays: Number
});

const Contributor = mongoose.model('CyberPlanetaDataTaxpayer', contributorSchema);

app.post('/add-contributor', async (req, res) => {
    const { id, email, name, password, documentation, startDate, endDate, remainingDays } = req.body;
    const newContributor = new Contributor({
        id, email, name, password, documentation, startDate, endDate, remainingDays
    });

    try {
        await newContributor.save();
        res.status(200).json({ message: 'Contributor added successfully' });
    } catch (error) {
        res.status(500).json({ message: 'Error adding contributor', error });
    }
});

const PORT = 3000;
app.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`);
});
