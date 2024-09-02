// server.js
const express = require('express');
const connectDB = require('./utils/database');
const { findFriendByName, calculateAge } = require('./controller/FriendController');
const path = require('path');

const app = express();
const port = 3000;

// Conectar a la base de datos
connectDB();

// Middleware para analizar cuerpos de solicitud JSON
app.use(express.json());

// Servir archivos estáticos
app.use(express.static(path.join(__dirname, 'public')));

// Ruta para servir la interfaz desde la carpeta view
app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, 'view', 'index.html'));
});

// Ruta para buscar amigos por nombre y apellido
app.get('/api/friends/:name/:lastName', async (req, res) => {
  const { name, lastName } = req.params;
  try {
    const friend = await findFriendByName(name, lastName);
    if (friend) {
      const age = calculateAge(friend.yearOfBirth);
      res.json({ ...friend.toObject(), age });
    } else {
      res.status(404).json({ message: 'Amigo no encontrado' });
    }
  } catch (error) {
    res.status(500).json({ message: 'Error del servidor', error });
  }
});

// Iniciar el servidor
app.listen(port, () => {
  console.log(`Servidor ejecutándose en http://localhost:${port}`);
});
