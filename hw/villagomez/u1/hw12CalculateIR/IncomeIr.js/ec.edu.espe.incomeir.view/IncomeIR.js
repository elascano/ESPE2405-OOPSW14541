const readline = require('readline');

const { computeIR } = require('../../Taxes/taxes/Income.js');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function main() {
    console.log("Calculate of Impuesto a la Renta");
  
    rl.question("Enter your monthly salary: ", (salary) => {
      const salaryNumber = parseFloat(salary);
  
      const taxPerYear = computeIR(salaryNumber);
  
      console.log("The annual IR is: " + taxPerYear);
      console.log("The monthly IR is: " + taxPerYear / 12);
      console.log("The monthly salary with IR is: " + (salaryNumber - (taxPerYear / 12)));
      console.log("The annual salary with IR is: " + ((salaryNumber * 12) - taxPerYear));
  
      rl.close();
    });
  }
  
main();