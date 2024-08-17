const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const Vehicle = require('./vehicle');
const PriceCalculator = require('./priceCalculator');

const app = express();
const priceCalculator = new PriceCalculator();


mongoose.connect('mongodb+srv://acuna:acuna@cluster0.znfrgif.mongodb.net/exam2')
  .then(() => {
    console.log('Connected to MongoDB');
  })
  .catch((err) => {
    console.error('Failed to connect to MongoDB', err);
  });


app.use(bodyParser.urlencoded({ extended: true }));
app.set('view engine', 'ejs');
app.use(express.static('public'));


app.get('/', (req, res) => {
    res.render('index', { price: null, message: null });
});

app.post('/add-vehicle', async (req, res) => {
    try {
        const { id, brand, year } = req.body;
        const vehicle = new Vehicle({ id, brand, year });
        await vehicle.save();
        console.log('Vehicle saved:', vehicle);
        const price = priceCalculator.calculatePrice(year);
        res.render('index', { price, message: 'Vehicle added successfully!' });
    } catch (error) {
        console.error('Failed to save vehicle:', error);
        res.status(500).send('Internal Server Error');
    }
});

const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});
