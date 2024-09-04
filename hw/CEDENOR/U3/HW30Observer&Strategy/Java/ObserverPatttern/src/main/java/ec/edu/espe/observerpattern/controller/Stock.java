package ec.edu.espe.observerpattern.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Nahomi Cedeño, codecreators, DCCO - ESPE
 */
abstract class Stock {
    protected String symbol;
    protected double price;
    private List<IInvestor> investors = new ArrayList<>();

    public Stock() {
     
    }
    
    public String getSymbol() {  
        return symbol;
    }

    public void addObserver(IInvestor investor) {
        investors.add(investor);
    }

    public void deleteObserver(IInvestor investor) {
        investors.remove(investor);
    }

    protected void notifyObservers(Object args) {
        Iterator i = investors.iterator();
        while (i.hasNext()){
            IInvestor investor = (IInvestor)i.next();
            investor.update(this, args);
        }
    }
}
