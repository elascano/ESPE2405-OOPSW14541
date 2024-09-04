// utils/database.js
const mongoose = require('mongoose');

const connectDB = async () => {
  try {
    await mongoose.connect('mongodb+srv://villagomez:villagomez@cluster0.hdylr9r.mongodb.net/', {
      useNewUrlParser: true,
      useUnifiedTopology: true,
    });
    console.log('Conexión a MongoDB exitosa');
  } catch (error) {
    console.error('Error al conectar a MongoDB', error);
    process.exit(1); // Salir del proceso con error
  }
};

module.exports = connectDB;
