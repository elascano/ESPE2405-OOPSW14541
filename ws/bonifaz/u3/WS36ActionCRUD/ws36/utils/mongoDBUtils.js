// utils/mongoDBUtils.js
const MongoClientSingleton = require('./mongoClientSingleton');

const connectDB = async () => {
    try {
        await MongoClientSingleton.getConnection();
        console.log('MongoDB connected');
    } catch (error) {
        console.error('Error connecting to MongoDB:', error);
    }
};

module.exports = { connectDB };
