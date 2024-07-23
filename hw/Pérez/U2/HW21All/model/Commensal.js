const mongoose = require('mongoose');

const commensalSchema = new mongoose.Schema({
    id: { type: String, required: true },
    name: { type: String, required: true },
    email: { type: String, required: true },
    password: { type: String, required: true },
    grade: { type: String, required: true },
    type: { type: String, default: 'commensal' },
    balance: { type: Number, required: true }
}, { collection: 'test' });

module.exports = mongoose.model('Commensal', commensalSchema);
