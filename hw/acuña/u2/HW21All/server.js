const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const cors = require('cors');
const Tutor = require('./models/Tutor');

const app = express();
const port = 3000;

app.use(bodyParser.json());
app.use(cors());

mongoose.connect('mongodb+srv://acuna:acuna@cluster0.znfrgif.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0', {
    useNewUrlParser: true,
    useUnifiedTopology: true
}).then(() => {
    console.log('Conectado a MongoDB');
}).catch(error => {
    console.error('Error conectando a MongoDB:', error);
});

app.post('/guardarTutor', async (req, res) => {
    try {
        const tutor = new Tutor(req.body);
        await tutor.save();
        res.status(201).send('Tutor guardado exitosamente');
    } catch (error) {
        res.status(500).send('Error al guardar el tutor');
    }
});

app.listen(port, () => {
    console.log(`Servidor escuchando en http://localhost:${port}`);
});
