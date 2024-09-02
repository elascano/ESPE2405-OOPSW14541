class StockController {
    constructor(model, view) {
        this.model = model;
        this.view = view;
    }

    setStockPrice(price) {
        this.model.setPrice(price);
    }

    addInvestor(investor) {
        this.model.registerObserver(investor);
    }

    removeInvestor(investor) {
        this.model.removeObserver(investor);
    }

    updateView(stockSymbol, stockPrice) {
        this.view.displayNotification(`Stock: ${stockSymbol} has a new price: ${stockPrice}`);
    }
}
