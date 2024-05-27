const fs = require('fs');
const readline = require('readline');
const Chicken = require('./Chicken');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});


console.log("\nMarcelo's Chicken farm simulator V0.5");
console.log("Intoduce chicken attributes: \n");

const questions = ["ID: ", "Name: ", "Color: ", "Age: ", "Molting [true/false]: "];

let chicken;
const askQuestion = (numberQuestion, answers = []) => {
    rl.question(questions[numberQuestion], (answer) => {
        answers.push(answer);
        if (numberQuestion === questions.length - 1) {
            rl.close();
            createChicken(answers);
        } else {
            askQuestion(numberQuestion + 1, answers);
        }
    });
};

const createChicken = ([id, name, color, age, molting]) => {
    const bornOnDate = new Date();
    chicken = new Chicken(id, name, color, age, molting === 'true', bornOnDate);
    saveChickenToFile(chicken);
};

const saveChickenToFile = (chicken) => {
    const filePath = 'C:\\prueba\\WChickenClass.txt';
    fs.writeFileSync(filePath, chicken.toString() + '\n');
    console.log("\n--- Saved Data ---\n");
};

askQuestion(0);
