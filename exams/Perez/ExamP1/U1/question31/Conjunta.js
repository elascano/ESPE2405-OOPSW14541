class Mask {
    constructor(id, name, type, price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }
}

const fs = require('fs');
const readline = require('readline');

const jsonFile = 'Mask.json';

function readMasks() {
    try {
        const data = fs.readFileSync(jsonFile, 'utf8');
        return JSON.parse(data);
    } catch (error) {
        console.error(error);
        return [];
    }
}

function writeMasks(masks) {
    try {
        fs.writeFileSync(jsonFile, JSON.stringify(masks, null, 4));
        console.log('Mask data updated successfully.');
    } catch (error) {
        console.error(error);
    }
}

function addMask(id, name, type, price) {
    const masks = readMasks();
    masks.push(new Mask(id, name, type, price));
    writeMasks(masks);
}

function inputMaskData() {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    rl.question('Enter the mask ID: ', (id) => {
        rl.question('Enter the mask name: ', (name) => {
            rl.question('Enter the mask type: ', (type) => {
                rl.question('Enter the mask price: ', (price) => {
                    addMask(parseInt(id), name, type, parseFloat(price));
                    rl.close();
                });
            });
        });
    });
}

inputMaskData();


