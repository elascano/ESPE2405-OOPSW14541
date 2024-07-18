const Storage = require('C:/Users/andre/OneDrive/Desktop/ayuda/Q05PairProgramming/ec.edu.espe.technologystore.model/Storage');
const FileManager = require('C:/Users/andre/OneDrive/Desktop/ayuda/Q05PairProgramming/utils/FileManager');

class Product {
    constructor(id, name, brand, price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    static addProduct(id, name, brand, price, storage) {
        const product = new Product(id, name, brand, price);
        storage.addProduct(product);
        console.log(`Product added: ${product.name}`);

        const fileManager = new FileManager();
        fileManager.saveToFile(storage.getProductList(), 'products.json');
    }
}

module.exports = Product;