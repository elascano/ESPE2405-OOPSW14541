const mongoose = require('mongoose');

const TutorSchema = new mongoose.Schema({
    cedula: String,
    nombres: String,
    apellidos: String,
    fechaNacimiento: Date,
    edad: Number,
    codigoCarrera: String,
    email: String,
    celular: String
});

module.exports = mongoose.model('Tutor', TutorSchema);
