const mongoose = require('mongoose');
const Schema = mongoose.Schema;

// Crear el esquema
const TaxPayerSchema = new Schema({
    id: { type: String, required: true },
    email: { type: String, required: true },
    name: { type: String, required: true },
    password: { type: String, required: true },
    documentation: { type: String, required: true }
});

module.exports = mongoose.model('TaxPayer', TaxPayerSchema);
