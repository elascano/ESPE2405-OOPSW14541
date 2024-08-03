const express = require('express');
const { getDB } = require('./ConnectMongoDB');

const router = express.Router();

router.post('/appointments', async (req, res) => {
    const db = getDB();
    const collection = db.collection('appointments');
    try {
        const result = await collection.insertOne(req.body);
        res.status(201).send(result);
    } catch (error) {
        console.error('Error al guardar la cita:', error);
        res.status(500).send({ error: 'Error al guardar la cita' });
    }
});

router.get('/appointments', async (req, res) => {
    const db = getDB();
    const collection = db.collection('appointments');
    try {
        const appointments = await collection.find({}).toArray();
        res.status(200).send(appointments);
    } catch (error) {
        console.error('Error al obtener las citas:', error);
        res.status(500).send({ error: 'Error al obtener las citas' });
    }
});

module.exports = router;