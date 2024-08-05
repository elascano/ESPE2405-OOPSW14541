// index.js
const express = require('express');
const path = require('path');
const bodyParser = require('body-parser');
const DoctorController = require('./controller/DoctorController');

const app = express();
const port = 3000;

// Configurar el middleware para parsear JSON
app.use(bodyParser.json());

// Configurar la ruta estática para servir archivos desde el directorio "view"
app.use(express.static(path.join(__dirname, 'view')));

app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'view', 'DoctorView.html'));
});

app.post('/addDoctor', async (req, res) => {
    try {
        const { id, name, specialty, schedule } = req.body;
        const doctorController = new DoctorController();
        await doctorController.addDoctor(id, name, specialty, schedule);
        res.status(200).send('Doctor agregado exitosamente');
    } catch (error) {
        res.status(500).send('Error al agregar el doctor');
    }
});

app.listen(port, () => {
    console.log(`Servidor corriendo en http://localhost:${port}`);
});
