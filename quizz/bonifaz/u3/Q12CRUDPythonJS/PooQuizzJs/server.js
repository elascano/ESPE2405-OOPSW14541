const express = require('express');
const bodyParser = require('body-parser');
const { savePlayer } = require('./src/database/mongodb');
const Player = require('./src/models/player');
const CalculateGA = require('./src/controllers/calculateGA');

const app = express();
const port = 3000;

app.use(bodyParser.json());
app.use(express.static('public'));

app.post('/savePlayer', async (req, res) => {
    console.log('Received request to save player:', req.body); // Log para verificar datos recibidos
    const { id, name, description, goal, asist } = req.body;
    const GA = CalculateGA.calcularPromedioGA(goal, asist);
    const player = new Player(id, name, description, goal, asist, GA);

    try {
        await savePlayer(player);
        console.log('Player saved successfully'); // Log para éxito
        res.status(200).send('Player saved successfully');
    } catch (error) {
        console.error('Error saving player:', error); // Log para error
        res.status(500).send('Error saving player');
    }
});

app.listen(port, () => {
    console.log(`Server running at http://localhost:${port}`);
});

