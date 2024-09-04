package ec.edu.espe.observerpattern.controller;

/**
 *
 * @author David Rodriguez,THEJAVABANDITS DCCO-ESPE
 */

public class IBM extends Stock {
    private double price;
    
    public IBM(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }
    
    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers(new Double(price));
    }
    
    public void setSymbol(String symbol) {
        this.symbol = symbol;
        notifyObservers(symbol);
    }
}
