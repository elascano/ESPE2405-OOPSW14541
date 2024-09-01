
package ec.edu.espe.model;


/**
 *
 * @author MSI-PULSE
 */
public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println("Investor " + name + " notified. " + 
                            "Stock: " + stockSymbol + " Price: " + stockPrice);
    }

    public String getName() {
        return name;
    }
}
