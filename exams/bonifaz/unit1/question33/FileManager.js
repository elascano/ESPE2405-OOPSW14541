const fs = require('fs');
const readline = require('readline');
const SchoolBag = require('./SchoolBag');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const questions = ["ID: ", "Brand: ", "Color: "];

let schoolbag;

function askQuestion(index, answers = []) {
    rl.question(questions[index], function(answer) {
        answers.push(answer);
        if (index === questions.length - 1) {
            rl.close();
            createSchoolBag(answers);
        } else {
            askQuestion(index + 1, answers);
        }
    });
}

function createSchoolBag(data) {
    const bornOnDate = new Date();
    schoolbag = new SchoolBag(data[0], data[1], data[2]);
    saveSchoolBagToFile(schoolbag);
}

function saveSchoolBagToFile(schoolbag) {
    const filePath = 'C:\\Users\\Downloads\\SchoolBagData.txt';
    fs.writeFileSync(filePath, schoolbag.toString() + '\n');
    console.log("SchoolBag data has been saved to " + filePath);
}

console.log("School bag simulator");
console.log("\nPlease enter chicken details:");

askQuestion(0);