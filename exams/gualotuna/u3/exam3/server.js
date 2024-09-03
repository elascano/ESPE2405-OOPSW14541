import express from 'express';
import { MongoClient } from 'mongodb';
import bodyParser from 'body-parser';
import path from 'path';

const app = express();
const port = 3000;

// Conexión a MongoDB Atlas
const uri = "mongodb+srv://bpgualotuna1:bpgualotuna1@cluster0.elvwlgc.mongodb.net/";
const client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });

// Middleware
app.use(bodyParser.json());
app.use(express.static(path.join(__dirname, 'view'))); 

// Ruta para guardar datos en la base de datos
app.post('/save', async (req, res) => {
  const data = req.body;

  try {
    await client.connect();
    const database = client.db("strategyGualotuna");
    const collection = database.collection("arrayBrayan");

    const result = await collection.insertOne(data);
    res.json({ message: 'Data saved successfully', result });
  } catch (error) {
    console.error('Error saving to database:', error);
    res.status(500).json({ error: 'Failed to save data' });
  } finally {
    await client.close();
  }
});

// Inicia el servidor
app.listen(port, () => {
  console.log(`Server running at http://localhost:${port}`);
});
