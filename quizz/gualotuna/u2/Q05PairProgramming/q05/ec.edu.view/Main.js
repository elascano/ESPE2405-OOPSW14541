class Main {
    static viewProduct(product) {
        console.log(`ID: ${product.id}, Name: ${product.name}, Price: ${product.price}, Category: ${product.category}`);
    }

    static viewInventory(inventory) {
        const products = inventory.viewInventory();
        products.forEach(product => Main.viewProduct(product));
    }
}

