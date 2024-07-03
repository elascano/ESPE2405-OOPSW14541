class BuyProduct {
    static buy(id, name, price, category, inventory) {
        inventory.createProduct(id, name, price, category);
    }
}
