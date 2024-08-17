const mongoose = require('mongoose');


const vehicleSchema = new mongoose.Schema({
    id: { type: String, required: true, unique: true },
    brand: { type: String, required: true },
    year: { type: Number, required: true }
}, { collection: 'Vehicle' });  


const Vehicle = mongoose.model('Vehicle', vehicleSchema);

module.exports = Vehicle;
