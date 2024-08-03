const express = require('express');
const cors = require('cors');
const bodyParser = require('body-parser');
const { connectDB } = require('./controller/ConnectMongoDB');
const appointmentController = require('./controller/AppointmentController');

const app = express();
const port = 5000;

app.use(cors());
app.use(bodyParser.json());

connectDB().then(() => {
    app.use('/api', appointmentController);

    app.listen(port, () => {
        console.log(`Servidor escuchando en http://localhost:${port}`);
    });
});