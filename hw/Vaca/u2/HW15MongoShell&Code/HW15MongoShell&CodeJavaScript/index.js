const { MongoClient } = require('mongodb');
const readlineSync = require('readline-sync');
const fs = require('fs');


const uri = 'mongodb+srv://vaca:vaca@cluster0.42hdahs.mongodb.net/';

async function run() {
  const client = new MongoClient(uri);

  try {
    
    await client.connect();

    
    const database = client.db('oop');
    const collection = database.collection('students');

    
    const id = readlineSync.question('Ingrese ID: ');
    const name = readlineSync.question('Ingrese nombre: ');
    const isMale = readlineSync.question('Es male (true/false): ').toLowerCase() === 'true';
    const siblings = parseInt(readlineSync.question('Ingrese número de siblings: '), 10);

    
    const student = {
      id: id,
      name: name,
      isMale: isMale,
      siblings: siblings
    };

    
    await collection.insertOne(student);

    
    fs.writeFileSync('student.json', JSON.stringify(student, null, 2), 'utf-8');

    
    console.log('Documento guardado en MongoDB Atlas y en student.json:', student);
  } catch (error) {
    console.error('Error:', error);
  } finally {
    
    await client.close();
  }
}

run().catch(console.dir);
