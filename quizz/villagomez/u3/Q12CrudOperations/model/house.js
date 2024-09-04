const mongoose = require('mongoose');

const houseSchema = new mongoose.Schema({
  id: String,
  description: String,
  dateOfBuilding: Date,
  yearsOfExistence: Number
}, { collection: 'houses' }); 

module.exports = mongoose.model('House', houseSchema);