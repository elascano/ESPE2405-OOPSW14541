class Storage {
    constructor() {
        this.productList = [];
    }

    addProduct(product) {
        this.productList.push(product);
    }

    getProductList() {
        return this.productList;
    }

    setProductList(productList) {
        this.productList = productList;
    }
    
    getProductById(id) {
        return this.productList.find(product => product.id === id);
    }
}

module.exports = Storage;