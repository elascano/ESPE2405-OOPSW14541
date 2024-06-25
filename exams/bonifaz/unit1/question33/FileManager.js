const fs = require('fs');
const readline = require('readline');
const SchoolBag = require('./SchoolBag');
const SchoolBagSimulator = require('./SchoolBagSimulator');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const questions = ["ID: ", "Brand: ", "Color: "];
let schoolBag;

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
    schoolBag = new SchoolBag(data[0], data[1], data[2]);
    saveSchoolBagToFile(schoolBag);
}

function saveSchoolBagToFile(schoolBag) {
    const filePath = 'SchoolBagData.json';
    let existingData = [];

  
    if (fs.existsSync(filePath)) {
        const rawData = fs.readFileSync(filePath);
        existingData = JSON.parse(rawData);
    }

    
    existingData.push({
        id: schoolBag.getId(),
        brand: schoolBag.getBrand(),
        color: schoolBag.getColor()
    });

   
    fs.writeFileSync(filePath, JSON.stringify(existingData, null, 2));
    console.log("SchoolBag data has been saved to " + filePath);
}


function saveSimulatorData() {
    const schoolBags = SchoolBagSimulator.generateData();
    const filePath = 'SchoolBagSimulatorData.json';
    
    const data = schoolBags.map(bag => ({
        id: bag.getId(),
        brand: bag.getBrand(),
        color: bag.getColor()
    }));

    fs.writeFileSync(filePath, JSON.stringify(data, null, 2));
    console.log("SchoolBagSimulator data has been saved to " + filePath);
}

console.log("School bag simulator");

    
saveSimulatorData();

console.log("\nPlease enter new bag details:");
askQuestion(0);