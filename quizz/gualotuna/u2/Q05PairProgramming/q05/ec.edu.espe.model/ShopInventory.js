class ShopInventory {
    constructor() {
        this.products = [];
    }

    createProduct(id, name, price, category) {
        const product = new Product(id, name, price, category);
        this.products.push(product);
    }

    removeProduct(id) {
        this.products = this.products.filter(product => product.id !== id);
    }

    viewInventory() {
        return this.products;
    }
}
