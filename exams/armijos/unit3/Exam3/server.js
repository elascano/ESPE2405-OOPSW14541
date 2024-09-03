const express = require('express');
const bodyParser = require('body-parser');
const { MongoClient } = require('mongodb');
const path = require('path'); // Asegúrate de tener esta línea

const app = express();
const port = 3000; // Cambiado de 5000 a 3000


// URI de MongoDB
const uri = 'mongodb+srv://EnzoArmijos:EnzoArmijos@cluster0.t8g9ujs.mongodb.net/';

// Nombre de la base de datos y la colección
const dbName = 'Exam3';
const collectionName = 'Exam3';

let client;

// Conectar a la base de datos
async function connectToDatabase() {
    client = new MongoClient(uri);
    try {
        await client.connect();
        console.log('Connected to MongoDB');
    } catch (error) {
        console.error('Failed to connect to MongoDB', error);
        process.exit(1); // Salir del proceso si no se puede conectar
    }
}

// Conectar a la base de datos cuando el servidor se inicia
connectToDatabase();

// Configurar bodyParser para manejar solicitudes POST
app.use(bodyParser.json());

// Ruta GET para servir el archivo HTML
app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'index.html'));
});

// Ruta POST para guardar los datos ordenados
app.post('/sort', async (req, res) => {
    const { numbers, sortedNumbers } = req.body;

    if (!numbers || !sortedNumbers) {
        return res.status(400).send('Invalid request body');
    }

    try {
        const db = client.db(dbName);
        const collection = db.collection(collectionName);

        const result = await collection.insertOne({
            originalNumbers: numbers,
            sortedNumbers: sortedNumbers,
            timestamp: new Date()
        });

        res.status(200).json({ message: 'Data saved successfully', result });
    } catch (error) {
        console.error('Error saving data to MongoDB', error);
        res.status(500).json({ message: 'Failed to save data', error });
    }
});

// Iniciar el servidor
app.listen(port, () => {
    console.log(`Server running at http://localhost:${port}`);
});
