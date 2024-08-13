const mongoose = require('mongoose');


const cellphoneSchema = new mongoose.Schema({
    id: { type: String, required: true, unique: true },
    model: { type: String, required: true },
    year: { type: Number, required: true }
}, { collection: 'Cellphone' });  


const Cellphone = mongoose.model('Cellphone', cellphoneSchema);

module.exports = Cellphone;
