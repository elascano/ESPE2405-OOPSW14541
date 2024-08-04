const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();

// Middleware
app.use(bodyParser.json());
app.use(cors());

// Conexión a Mon mongodb+srv://cedeno:cedeno@cluster0.arabu7a.mongodb.net/
const mongoURI = 'mongodb+srv://cedeno:cedeno@cluster0.arabu7a.mongodb.net/';

mongoose.connect(mongoURI, { useNewUrlParser: true, useUnifiedTopology: true })
    .then(() => console.log('MongoDB connected'))
    .catch(err => console.log(err));

// Rutas
const taxPayers = require('./routes/taxPayers');
app.use('/api/taxPayers', taxPayers);

// Iniciar el servidor
const port = 5000;
app.listen(port, () => console.log(`Server running on port ${port}`));
