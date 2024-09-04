class StockView {
    displayNotification(message) {
        console.log(message);
    }
}


const appleStock = new Stock("AAPL", 150.00);
const view = new StockView();
const controller = new StockController(appleStock, view);

const investor1 = new Investor("Alice");
const investor2 = new Investor("Bob");

controller.addInvestor(investor1);
controller.addInvestor(investor2);

controller.setStockPrice(155.00);
controller.updateView(appleStock.getSymbol(), appleStock.getPrice());

controller.removeInvestor(investor2);
controller.setStockPrice(160.00);
controller.updateView(appleStock.getSymbol(), appleStock.getPrice());
