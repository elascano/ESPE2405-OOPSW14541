class ConcreteInvestor extends Investor {
    constructor(name) {
        super();
        this.name = name;
    }

    update(stock, price) {
        console.log(`Investor ${this.name} notified. New price of ${stock.symbol}: $${price}`);
    }
}
