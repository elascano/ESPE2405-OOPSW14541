const { MongoClient } = require('mongodb');
const Student = require('./student');

const uri = "mongodb+srv://carlosp:carlosp@cluster0.qouhg0b.mongodb.net/oop?retryWrites=true&w=majority";

const client = new MongoClient(uri);

async function run() {
    try {
        await client.connect();
        const database = client.db('oop');
        const collection = database.collection('students');

        const id = "L00429335";
        const name = "Juan Pérez";
        const male = true;
        const siblings = 1;

        const student = new Student(id, name, male, siblings);
        const doc = {
            id: student.getId(),
            name: student.getName(),
            male: student.isMale(),
            siblings: student.getSiblings()
        };

        const result = await collection.insertOne(doc);
        console.log(`Document inserted with ID: ${result.insertedId}`);

        await client.close();
    } catch (err) {
        console.error('Error: ', err);
    }
}

run().catch(console.error);
