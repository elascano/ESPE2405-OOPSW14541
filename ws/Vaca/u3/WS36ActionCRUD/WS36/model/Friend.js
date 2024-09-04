// model/Friend.js
const mongoose = require('mongoose');

// Definimos el esquema del amigo
const friendSchema = new mongoose.Schema({
  name: { type: String, required: true },
  lastName: { type: String, required: true },
  yearOfBirth: { type: Number, required: true }, // MongoDB maneja los números como Int32 por defecto
});

module.exports = mongoose.model('Friend', friendSchema);
