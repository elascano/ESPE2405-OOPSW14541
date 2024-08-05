const mongoose = require('mongoose');

const uri = 'mongodb+srv://acuna:acuna@cluster0.znfrgif.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0';

mongoose.connect(uri, { useNewUrlParser: true, useUnifiedTopology: true })
    .then(() => console.log('Conectado a MongoDB'))
    .catch(err => console.error('Error al conectar a MongoDB', err));

module.exports = mongoose;