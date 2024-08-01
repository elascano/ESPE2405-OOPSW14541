const Operation = require('../ec.edu.espe.complexoperations.controler/Operation');
const PersonController = require('../ec.edu.espe.complexoperations.controler/PersonController');
const OperationPrinting = require('./OperationPrinting');

console.log("Welcome to Complex Operations \nMarcelo Acuna");

let addend1;
let addend2;
let sum;

addend1 = 1;
addend2 = 2;

sum = Operation.addTwoNumbers(addend1, addend2);

OperationPrinting.printAddition(addend1, addend2, sum);

addend1 = 1.2;
addend2 = 2.4;

sum = Operation.addTwoNumbers(addend1, addend2);

OperationPrinting.printAddition(addend1, addend2, sum);

addend1 = 2.2;
addend2 = -1.8;

sum = Operation.addTwoNumbers(addend1, addend2);

OperationPrinting.printAddition(addend1, addend2, sum);

const birthDate = new Date("2001-08-07");
let years;
let days;

days = PersonController.computeAgeInDays(birthDate);
years = PersonController.computeAgeInYears(birthDate);

console.log(`Marcelo is ${days} days old`);
console.log(`He was born on ${birthDate.toDateString()}`);

console.log(`Marcelo is ${years} years old`);
