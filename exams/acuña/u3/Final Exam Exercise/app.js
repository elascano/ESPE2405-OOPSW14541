const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const Cellphone = require('./cellphone');
const PriceCalculator = require('./priceCalculator');

const app = express();
const priceCalculator = new PriceCalculator();


mongoose.connect('mongodb+srv://acuna:acuna@cluster0.znfrgif.mongodb.net/exam3')
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
    res.render('index', { price: null, message: null, cellphone: null });
});

app.post('/add-cellphone', async (req, res) => {
    try {
        const { id, model, year } = req.body;
        const cellphone = new Cellphone({ id, model, year });
        await cellphone.save();
        console.log('Cellphone saved:', cellphone);
        const price = priceCalculator.calculatePrice(year).toFixed(2); 
        res.render('index', { price, message: 'Cellphone added successfully!', cellphone: null });
    } catch (error) {
        console.error('Failed to save cellphone:', error);
        res.status(500).send('Internal Server Error');
    }
});

app.post('/search-cellphone', async (req, res) => {
    try {
        const { id } = req.body;
        const cellphone = await Cellphone.findOne({ id });
        if (cellphone) {
            const price = priceCalculator.calculatePrice(cellphone.year).toFixed(2); // Limita a 2 decimales
            res.render('index', { cellphone, price, message: null });
        } else {
            res.render('index', { cellphone: null, price: null, message: 'Cellphone not found' });
        }
    } catch (error) {
        console.error('Failed to fetch cellphone:', error);
        res.status(500).send('Internal Server Error');
    }
});

const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});