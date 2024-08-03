import { Operation } from '../ec.edu.espe.complexoperations.controller/Operation.js';
import PersonController  from '../ec.edu.espe.complexoperations.controller/PersonController.js';
import { OperationPrinting } from './OperationPrinting.js';

console.log("Welcome to Complex Operations! \nCarlos Perez");

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

const birthDate = new Date("2003-02-22");
const days = PersonController.computeAgeInDays(birthDate);
const years = PersonController.computeAgeInYears(birthDate);

console.log(`Carlos is ${days} days old`);
console.log(`He was born on ${birthDate.toDateString()}`);
console.log(`Carlos is ${years} year-old`);
