const addTwoNumbers = require('../ec.edu.espe.complexoperationsjavascript.model/Operation.js');
const computeAgeInDays = require('../ec.edu.espe.complexoperationsjavascript.model/PersonController.js');
const computeAgeInYears = require('../ec.edu.espe.complexoperationsjavascript.model/PersonController.js');

addend1 = 9.1
addend2 = -3.2
sum = addTwoNumbers(addend1, addend2)

console.log(sum)

birthDate = '31-01-2004'
ageInDays = computeAgeInDays(birthDate)
ageInYears = computeAgeInYears(birthDate)

console.log(ageInDays)
console.log(ageInYears)