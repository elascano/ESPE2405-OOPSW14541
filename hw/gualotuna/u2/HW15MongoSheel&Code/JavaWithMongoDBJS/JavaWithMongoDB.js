const { MongoClient } = require('mongodb');
const readline = require('readline');

async function main() {
    const uri = "mongodb+srv://bpgualotuna1:bpgualotuna1@cluster0.elvwlgc.mongodb.net/";
    const client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });

    try {
        await client.connect();
        
        const database = client.db('oop');
        const collection = database.collection('students');
        
        const rl = readline.createInterface({
            input: process.stdin,
            output: process.stdout
        });

        rl.question('Ingrese id: ', (id) => {
            rl.question('Ingrese nombre: ', (name) => {
                rl.question('Ingrese si es hombre (true/false): ', (isMale) => {
                    const male = isMale.toLowerCase() === 'true';
                    
                    rl.question('Ingrese cuantos hermanos tiene: ', (siblings) => {
                        const siblingsCount = parseInt(siblings);
                        
                        const doc = {
                            id: id,
                            name: name,
                            male: male,
                            siblings: siblingsCount
                        };

                        collection.insertOne(doc, (err, result) => {
                            if (err) {
                                console.error('Error al insertar el documento:', err);
                            } else {
                                console.log('Documento insertado con éxito!');
                            }
                            
                            rl.close();
                            client.close();
                        });
                    });
                });
            });
        });
    } catch (err) {
        console.error('Error al conectar con MongoDB:', err);
    }
}

main();