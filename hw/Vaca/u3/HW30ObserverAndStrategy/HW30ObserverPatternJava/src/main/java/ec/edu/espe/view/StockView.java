/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.view;

import ec.edu.espe.controller.StockController;
import ec.edu.espe.model.Investor;
import ec.edu.espe.model.Stock;

/**
 *
 * @author MSI-PULSE
 */
public class StockView {

    public void displayNotification(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        
        Stock appleStock = new Stock("AAPL", 150.00);

       
        StockView view = new StockView();

        
        StockController controller = new StockController(appleStock, view);

        
        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");

       
        controller.addInvestor(investor1);
        controller.addInvestor(investor2);

        
        controller.setStockPrice(155.00);
        controller.updateView(appleStock.getSymbol(), appleStock.getPrice());

       
        controller.removeInvestor(investor2);
        controller.setStockPrice(160.00);
        controller.updateView(appleStock.getSymbol(), appleStock.getPrice());
    }
}
