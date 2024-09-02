
package ec.edu.espe.controller;

import ec.edu.espe.model.Stock;
import ec.edu.espe.model.Investor;
import ec.edu.espe.view.StockView;
/**
 *
 * @author MSI-PULSE
 */
public class StockController {
    private Stock model;
    private StockView view;

    public StockController(Stock model, StockView view) {
        this.model = model;
        this.view = view;
    }

    public void setStockPrice(double price) {
        model.setPrice(price);
    }

    public void addInvestor(Investor investor) {
        model.registerObserver(investor);
    }

    public void removeInvestor(Investor investor) {
        model.removeObserver(investor);
    }

    public void updateView(String stockSymbol, double stockPrice) {
        view.displayNotification("Stock: " + stockSymbol + " has a new price: " + stockPrice);
    }
}