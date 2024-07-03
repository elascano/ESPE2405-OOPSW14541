const { MongoClient } = require('mongodb');
const readline = require('readline');

// URI de conexión a MongoDB
const uri = "mongodb+srv://acuna:acuna@cluster0.znfrgif.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

async function main() {
    const client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });

    try {
        await client.connect();
        console.log("Connected to MongoDB");

        const database = client.db("opp"); // Nombre de la base de datos
        const collection = database.collection("students"); // Nombre de la colección

        const rl = readline.createInterface({
            input: process.stdin,
            output: process.stdout
        });

        let choice;
        do {
            console.log("\n--- Menu ---");
            console.log("1. Insert Document");
            console.log("2. Read Documents");
            console.log("3. Update Document");
            console.log("4. Delete Document");
            console.log("5. Exit");

            choice = await askQuestion(rl, "Choose an option: ");

            switch (choice) {
                case '1':
                    const id = await askQuestion(rl, "Enter ID: ");
                    const name = await askQuestion(rl, "Enter name: ");
                    const isMale = await askQuestion(rl, "Is male? (true/false): ");
                    const siblings = parseInt(await askQuestion(rl, "Enter number of siblings: "), 10);

                    await insertDocument(collection, id, name, isMale === 'true', siblings);
                    break;
                case '2':
                    await readDocuments(collection);
                    break;
                case '3':
                    const editId = await askQuestion(rl, "Enter ID of document to update: ");
                    const newName = await askQuestion(rl, "Enter new name: ");

                    await updateDocument(collection, editId, newName);
                    break;
                case '4':
                    const deleteId = await askQuestion(rl, "Enter ID of document to delete: ");

                    await deleteDocument(collection, deleteId);
                    break;
                case '5':
                    console.log("Exiting...");
                    break;
                default:
                    console.log("Invalid option.");
            }
        } while (choice !== '5');
    } finally {
        await client.close();
        rl.close();
    }
}

async function askQuestion(rl, question) {
    return new Promise((resolve) => {
        rl.question(question, (answer) => {
            resolve(answer.trim());
        });
    });
}

async function insertDocument(collection, id, name, isMale, siblings) {
    const document = {
        id: id,
        name: name,
        male: isMale,
        siblings: siblings
    };

    const result = await collection.insertOne(document);
    console.log(`Document inserted with ID: ${result.insertedId}`);
}

async function readDocuments(collection) {
    const cursor = collection.find();

    await cursor.forEach(doc => {
        console.log(doc);
    });
}

async function updateDocument(collection, id, newName) {
    const result = await collection.updateOne({ id: id }, { $set: { name: newName } });
    console.log(`Document with ID ${id} updated: ${result.modifiedCount} document(s) affected.`);
}

async function deleteDocument(collection, id) {
    const result = await collection.deleteOne({ id: id });
    console.log(`Document with ID ${id} deleted: ${result.deletedCount} document(s) deleted.`);
}

main().catch(console.error);
