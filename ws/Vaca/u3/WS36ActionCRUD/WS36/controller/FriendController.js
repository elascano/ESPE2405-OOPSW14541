// controller/FriendController.js
const Friend = require('../model/Friend');

// Función para buscar un amigo por nombre y apellido
exports.findFriendByName = async (name, lastName) => {
  try {
    return await Friend.findOne({ name, lastName });
  } catch (error) {
    throw new Error('Error buscando el amigo');
  }
};

// Función para calcular la edad del amigo
exports.calculateAge = (yearOfBirth) => {
  const currentYear = new Date().getFullYear();
  return currentYear - yearOfBirth;
};
