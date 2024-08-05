// controller/DoctorController.js
const connectToDB = require('./MongoDBConnection');
const Doctor = require('../model/Doctor');

class DoctorController {
    async addDoctor(id, name, specialty, schedule) {
        const newDoctor = new Doctor(id, name, specialty, schedule);
        const doctorsCollection = await connectToDB();
        await doctorsCollection.insertOne(newDoctor);
        console.log('Doctor added successfully:', newDoctor);
    }
}

module.exports = DoctorController;
    