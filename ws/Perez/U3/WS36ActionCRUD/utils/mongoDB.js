const { MongoClient } = require('mongodb');
const Store = require('./model/store'); // Asegúrate de tener tu clase Store en model/Store.js

const uri = "mongodb+srv://segarra:segarra@cluster0.b2q6ac3.mongodb.net/Q6170?retryWrites=true&w=majority";

const client = new MongoClient(uri);

async function run() {
    try {
        await client.connect();
        const database = client.db('Q6170');
        const collection = database.collection('Store'); // Especifica la colección 'Store'

        // Datos de ejemplo, puedes obtener estos valores de algún input de tu aplicación
        const id = "1234";
        const name = "My Store";
        const inventory = 100;
        const sales = 50;

        // Crear una instancia de Store
        const store = new Store(id, name, inventory, sales);
        const doc = {
            id: store.getId(),
            name: store.getName(),
            inventory: store.getInventory(),
            sales: store.getSales()
        };

        // Insertar el documento en la colección
        const result = await collection.insertOne(doc);
        console.log(`Document inserted with ID: ${result.insertedId}`);

        await client.close();
    } catch (err) {
        console.error('Error: ', err);
    }
}

run().catch(console.error);
