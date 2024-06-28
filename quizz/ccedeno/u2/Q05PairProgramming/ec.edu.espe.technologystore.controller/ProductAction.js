const Product = require('C:/Users/andre/OneDrive/Desktop/ayuda/Q05PairProgramming/ec.edu.espe.technologystore.model/Product');
const Storage = require('C:/Users/andre/OneDrive/Desktop/ayuda/Q05PairProgramming/ec.edu.espe.technologystore.model/Storage');
const FileManager = require('C:/Users/andre/OneDrive/Desktop/ayuda/Q05PairProgramming/utils/FileManager');

class ProductAction {
    constructor() {
        this.fileManager = new FileManager();
    }

    processProductAction(productId, actionType, storage) {
        const product = storage.getProductById(productId);
        if (!product) {
            console.log(`Product with ID ${productId} not found.`);
            return;
        }

        switch (actionType) {
            case 'buy':
                Product.addProduct(product.id, product.name, product.brand, product.price, storage);
                break;
            case 'sell':
                const index = storage.getProductList().indexOf(product);
                if (index !== -1) {
                    storage.getProductList().splice(index, 1);
                    console.log(`Product sold: ${product.name}`);
                } else {
                    console.log(`Product not found in storage: ${product.name}`);
                }
                break;
            default:
                console.log(`Invalid action type: ${actionType}`);
                return;
        }

        this.fileManager.saveToFile(storage.getProductList(), 'products.json');
    }

    report(storage, brand = null) {
        console.log("Product list:");
        const productList = brand ? storage.getProductList().filter(product => product.brand === brand) : storage.getProductList();
        productList.forEach(product => {
            console.log(` - ${product.name} (Brand: ${product.brand}, Price: ${product.price})`);
        });
    }
}

module.exports = ProductAction;