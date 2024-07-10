const { MongoClient } = require('mongodb');
const readline = require('readline');

const uri = "mongodb+srv://bonifaz:bonifaz@cluster0.vleslwo.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

const client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});


async function main() {
    try {

        await client.connect();
        console.log("Connected to MongoDB");

        const database = client.db("opp");

        const collection = database.collection("students");

        let choice;

        do {
            console.log("\n--- Menu ---");
            console.log("1. Insert Document");
            console.log("2. Read Documents");
            console.log("3. Update Document");
            console.log("4. Delete Document");
            console.log("5. Exit");

            choice = await askQuestion("Choose an option: ");

            switch (parseInt(choice)) {
                case 1:
                    let id = await askQuestion("Enter ID: ");
                    let name = await askQuestion("Enter name: ");
                    let isMale = await askQuestion("Is male? (true/false): ");
                    let siblings = parseInt(await askQuestion("Enter number of siblings: "));
                    await insertDocument(collection, id, name, isMale === 'true', siblings);
                    break;
                case 2:
                    await readDocuments(collection);
                    break;
                case 3:
                    let editId = await askQuestion("Enter ID of document to update: ");
                    let newName = await askQuestion("Enter new name: ");
                    await updateDocument(collection, editId, newName);
                    break;
                case 4:
                    let deleteId = await askQuestion("Enter ID of document to delete: ");
                    await deleteDocument(collection, deleteId);
                    break;
                case 5:
                    console.log("Exiting...");
                    break;
                default:
                    console.log("Invalid option.");
            }
        } while (parseInt(choice) !== 5);

    } catch (err) {
        console.error(err);
    } finally {

        rl.close();

        await client.close();
        console.log("MongoDB connection closed");
    }
}

async function insertDocument(collection, id, name, isMale, siblings) {
    const document = {
        id: id,
        name: name,
        male: isMale,
        siblings: siblings
    };
    await collection.insertOne(document);
    console.log("Document inserted:", document);
}

async function readDocuments(collection) {
    const cursor = collection.find();
    await cursor.forEach(doc => {
        console.log(doc);
    });
}

async function updateDocument(collection, id, newName) {
    await collection.updateOne({ id: id }, { $set: { name: newName } });
    console.log(`Document with ID ${id} has been updated.`);
}

async function deleteDocument(collection, id) {
    await collection.deleteOne({ id: id });
    console.log(`Document with ID ${id} has been deleted.`);
}

function askQuestion(question) {
    return new Promise(resolve => {
        rl.question(question, answer => {
            resolve(answer);
        });
    });
}

main().catch(console.error);