// utils/mongoClientSingleton.js
const mongoose = require('mongoose');

class MongoClientSingleton {
    constructor() {
        const uri = 'mongodb+srv://bonifaz:bonifaz@cluster0.vleslwo.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0';
        this.connection = mongoose.connect(uri, {
            useNewUrlParser: true,
            useUnifiedTopology: true,
        });
    }

    getConnection() {
        return this.connection;
    }
}

module.exports = new MongoClientSingleton();
