const Product = require('C:/Users/andre/OneDrive/Desktop/ayuda/Q05PairProgramming/ec.edu.espe.technologystore.model/Product');
const Storage = require('C:/Users/andre/OneDrive/Desktop/ayuda/Q05PairProgramming/ec.edu.espe.technologystore.model/Storage');
const ProductAction = require('C:/Users/andre/OneDrive/Desktop/ayuda/Q05PairProgramming/ec.edu.espe.technologystore.controller/ProductAction');
const FileManager = require('C:/Users/andre/OneDrive/Desktop/ayuda/Q05PairProgramming/utils/FileManager');
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const storage = new Storage();
const productAction = new ProductAction();
const fileManager = new FileManager();

function loadProducts() {
    try {
        const productList = fileManager.readFile('products.json');
        storage.setProductList(productList);
    } catch (error) {
        console.log('No existing products found, starting with an empty storage.');
    }
}

function displayMenu() {
    console.log('==== Technology Store Menu ====');
    console.log('1. Add Product');
    console.log('2. Sell Product');
    console.log('3. View Storage Report');
    console.log('4. Exit');
}

function addProduct() {
    rl.question('Enter product ID: ', (id) => {
        rl.question('Enter product name: ', (name) => {
            rl.question('Enter product brand: ', (brand) => {
                rl.question('Enter product price: ', (price) => {
                    Product.addProduct(parseInt(id), name, brand, parseFloat(price), storage);
                    displayMenuOptions();
                });
            });
        });
    });
}

function sellProduct() {
    console.log('Available Products:');
    storage.getProductList().forEach(product => {
        console.log(`ID: ${product.id}, Name: ${product.name}, Brand: ${product.brand}, Price: ${product.price}`);
    });

    rl.question('Enter product ID to sell: ', (productId) => {
        const product = storage.getProductById(parseInt(productId));
        if (product) {
            productAction.processProductAction(parseInt(productId), 'sell', storage);
        } else {
            console.log(`Product with ID ${productId} not found.`);
        }
        displayMenuOptions();
    });
}

function viewStorageReport() {
    rl.question('Do you want to filter by brand? (yes/no): ', (answer) => {
        if (answer.toLowerCase() === 'yes') {
            rl.question('Enter brand name: ', (brand) => {
                productAction.report(storage, brand);
                displayMenuOptions();
            });
        } else {
            productAction.report(storage);
            displayMenuOptions();
        }
    });
}

function displayMenuOptions() {
    displayMenu();
    rl.question('Enter your choice: ', (answer) => {
        switch (answer) {
            case '1':
                addProduct();
                break;
            case '2':
                sellProduct();
                break;
            case '3':
                viewStorageReport();
                break;
            case '4':
                rl.close();
                break;
            default:
                console.log('Invalid option. Please enter a number from 1 to 4.');
                displayMenuOptions();
                break;
        }
    });
}

function main() {
    console.log('Welcome to the Technology Store!');
    loadProducts(); 
    displayMenuOptions();
}

main();