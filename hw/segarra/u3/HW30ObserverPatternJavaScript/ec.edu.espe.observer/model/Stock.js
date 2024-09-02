class Stock {
    constructor(symbol, price) {
        this.symbol = symbol;
        this.price = price;
        this.observers = [];
    }

    addObserver(investor) {
        this.observers.push(investor);
    }

    deleteObserver(investor) {
        const index = this.observers.indexOf(investor);
        if (index !== -1) {
            this.observers.splice(index, 1);
        }
    }

    notifyObservers() {
        this.observers.forEach(observer => observer.update(this, this.price));
    }

    setPrice(price) {
        this.price = price;
        this.notifyObservers();
    }

    getPrice() {
        return this.price;
    }
}
