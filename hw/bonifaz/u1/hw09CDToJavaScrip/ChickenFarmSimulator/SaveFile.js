const fs = require('fs');
const readline = require('readline');
const Chicken = require('./Chicken');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});


console.log("\nChristian's Chicken farm simulator V0.6");
console.log("Chicken Data\n");

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
    const filePath = 'C:\\Users\\mateo\\Downloads\\ChickensData.txt';
    fs.writeFileSync(filePath, chicken.toString() + '\n');
    console.log("\n--- Saved Data ---\n");
};

askQuestion(0);
