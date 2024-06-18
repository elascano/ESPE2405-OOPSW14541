const fs = require('fs');
const readline = require('readline');
const Chicken = require('./Chicken');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const questions = ["ID: ", "Name: ", "Color: ", "Age: ", "Molting [true/false]: "];

let chicken;

function askQuestion(index, answers = []) {
    rl.question(questions[index], function(answer) {
        answers.push(answer);
        if (index === questions.length - 1) {
            rl.close();
            createChicken(answers);
        } else {
            askQuestion(index + 1, answers);
        }
    });
}

function createChicken(data) {
    const bornOnDate = new Date();
    chicken = new Chicken(data[0], data[1], data[2], data[3], data[4] === 'true', bornOnDate);
    saveChickenToFile(chicken);
}

function saveChickenToFile(chicken) {
    const filePath = 'C:\\Users\\mateo\\Downloads\\ChickensData.txt';
    fs.writeFileSync(filePath, chicken.toString() + '\n');
    console.log("Chicken data has been saved to " + filePath);
}

console.log("Chicken farm simulator");
console.log("\nPlease enter chicken details:");

askQuestion(0);

