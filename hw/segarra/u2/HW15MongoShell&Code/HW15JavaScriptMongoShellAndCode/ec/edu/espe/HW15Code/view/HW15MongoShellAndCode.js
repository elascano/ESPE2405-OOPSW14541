//HW15MongoShellAndCode.js

const { MongoClient } = require('MongoDB');

async function main() {
    const uri = 'mongodb+srv://segarra:segarra@cluster0.b2q6ac3.mongodb.net/';
    const client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });

    try {
        
        await client.connect();

        
        const database = client.db('oop');
        const collection = database.collection('students');

        const newStudent = {
            id: 'L00428992',
            name: 'Eduardo Segarra',
            male: true,
            siblings: 1
        };

        // Inserta el objeto en la colección
        const result = await collection.insertOne(newStudent);

        console.log(`Nuevo estudiante insertado con el id: ${result.insertedId}`);
    } catch (err) {
        console.error(err);
    } finally {
        // Cierra la conexión con MongoDB
        await client.close();
    }
}

main().catch(console.error);