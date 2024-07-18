const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

const { MongoClient } = require('mongodb');


const url = 'mongodb+srv://villagomez:villagomez@cluster0.hdylr9r.mongodb.net/';

const dbName = 'oop';
const collectionName = 'students';

function inputData() {
    readline.question('Enter the ID: ', (id) => {
        readline.question('Enter the name: ', (name) => {
            readline.question('It is male? true/false: ', (male) => {
                readline.question('Enter the number of siblings: ', (sibling) => {
                    const userData = {
                        id: id,
                        name: name,
                        male: (male.toLowerCase() === 'true'),
                        siblings: parseInt(sibling)
                    };


                    MongoClient.connect(url, (err, client) => {
                        if (err) {
                            console.error('Error al conectar a MongoDB:', err);
                            return;
                        }

                        console.log('Conectado a MongoDB correctamente');

                        const db = client.db(dbName);
                        const collection = db.collection(collectionName);

                        collection.insertOne(userData, (err, result) => {
                            if (err) {
                                console.error('Error al insertar documento:', err);
                            } else {
                                console.log('Documento insertado correctamente:', result.ops[0]);
                            }

                            client.close();
                            readline.close();
                        });
                    });
                });
            });
        });
    });
}

inputData();