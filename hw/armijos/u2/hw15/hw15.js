const { MongoClient } = require('mongodb');

async function main() {
  const uri = "mongodb+srv://EnzoArmijos:EnzoArmijos@cluster0.t8g9ujs.mongodb.net/g"; 

  const client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });

  try {
    await client.connect();
    console.log("Connected correctly to server");

    const database = client.db('OOP'); 
    const collection = database.collection('Students');

    const newUser = {
      name: "John Doe",
      email: "johndoe@example.com",
      password: "securepassword123"
    };

    const result = await collection.insertOne(newUser);
    console.log(`New user created with the following id: ${result.insertedId}`);
  } catch (err) {
    console.error(err);
  } finally {
    await client.close();
  }
}

main().catch(console.error);
