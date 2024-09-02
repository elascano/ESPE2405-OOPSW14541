class Stock extends Subject {
    constructor(symbol, price) {
        super();
        this.symbol = symbol;
        this.price = price;
        this.observers = [];
    }

    setPrice(price) {
        this.price = price;
        this.notifyObservers();
    }

    getSymbol() {
        return this.symbol;
    }

    getPrice() {
        return this.price;
    }

    registerObserver(observer) {
        this.observers.push(observer);
    }

    removeObserver(observer) {
        this.observers = this.observers.filter(obs => obs !== observer);
    }

    notifyObservers() {
        this.observers.forEach(observer => observer.update(this.symbol, this.price));
    }
}
