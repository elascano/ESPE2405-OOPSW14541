const Chicken = require("./Chicken");
const fs = require('fs');
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const askQuestion = (question) => {
    return new Promise((resolve) => rl.question(question, resolve));
};

(async () => {
    const fileStream = fs.createWriteStream('Chicken.txt', { flags: 'w' });
    
    fileStream.write("Brayan's Chicken Farm Simulator V 0.5\n");

    let chicken = new Chicken(1, "Lucy", "white and brown", 0, true, new Date());
    fileStream.write("Chicken --> \n" + chicken.toString() + "\n");

    try {
        const id = await askQuestion("Enter ID of the second Chicken: ");
        const name = await askQuestion("Enter name for the second Chicken: ");
        const color = await askQuestion("Enter color for the second Chicken: ");
        const age = await askQuestion("Enter age for the second Chicken: ");
        const molting = await askQuestion("Is it molting (true/false)?: ");
        const bornOnDate = new Date();

        chicken = new Chicken(parseInt(id), name, color, parseInt(age), molting === 'true', bornOnDate);
        fileStream.write("Chicken 2 --> \n" + chicken.toString() + "\n");
    } catch (error) {
        console.error('Error:', error);
    } finally {
        rl.close();
        fileStream.end();
    }
})();