class Investor extends Observer {
    constructor(name) {
        super();
        this.name = name;
    }

    update(stockSymbol, stockPrice) {
        console.log(`Investor ${this.name} notified. Stock: ${stockSymbol} Price: ${stockPrice}`);
    }

    getName() {
        return this.name;
    }
}
