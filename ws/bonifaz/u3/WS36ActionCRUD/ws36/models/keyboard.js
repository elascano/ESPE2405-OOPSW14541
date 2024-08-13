// models/keyboard.js
const mongoose = require('mongoose');

const keyboardSchema = new mongoose.Schema({
    id: String,
    model: String,
    brand: String,
    price: Number,
});

const Keyboard = mongoose.model('Keyboard', keyboardSchema);
module.exports = Keyboard;

