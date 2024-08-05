const { MongoClient } = require('mongodb');

async function main() {
    const uri = "mongodb+srv://cedeno:cedeno@cluster0.arabu7a.mongodb.net/";

    const client = new MongoClient(uri);

    try {
        await client.connect();

        const db = client.db('opp');
        const coleccion = db.collection('student');

        const documento = {
            name: "Andres",
            male: true,
            siblings: 2
        };

        const resultado = await coleccion.insertOne(documento);
        console.log(`Se agregó: ${resultado.insertedId}`);
    } catch (e) {
        console.error(e);
    } finally {
        await client.close();
    }
}

main().catch(console.error);