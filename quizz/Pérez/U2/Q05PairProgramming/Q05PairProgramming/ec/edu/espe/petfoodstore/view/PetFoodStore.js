import readline from 'readline';
import Food from '../model/Food.js';
import Stock from '../model/Stock.js';
import FileManager from '../utils/FileManager.js';
import Transaction from '../controller/Transaction.js';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function askQuestion(query) {
  return new Promise(resolve => rl.question(query, resolve));
}

async function main() {
    let foodList = FileManager.load(); 

    if (!Array.isArray(foodList)) {
        console.error('Error: foodList is not an array');
        foodList = []; 
    }

    let choice;
    do {
        console.log('\nMenu:');
        console.log('1. Sell Food');
        console.log('2. Buy Food');
        console.log('3. Exit');

        choice = await askQuestion('Enter your choice: ');

        if (choice === '1' || choice === '2') {
            console.log('1.procan (dog)');
            console.log('2.prolan (dog)');
            console.log('3. dogchow (dog)');
            console.log('4. whiskas (cat)');
            console.log('5.procat (cat):');
            console.log('6. michu (cat)');
            const id = parseInt(await askQuestion('Enter food id : '), 10);
            if (id < 1 || id > 6) {
                console.error('Invalid food id');
                continue;
            }

            const amount = parseFloat(await askQuestion('Enter amount in lb: '));
            if (amount <= 0) {
                console.error('Amount must be greater than 0');
                continue;
            }

            if (choice === '1') {
                Transaction.sell(foodList, id, amount);
            } else if (choice === '2') {
                Transaction.buy(foodList, id, amount);
            }
        }

    } while (choice !== '3');

    rl.close();
}

main().catch((err) => {
    console.error(err);
    rl.close();
});
