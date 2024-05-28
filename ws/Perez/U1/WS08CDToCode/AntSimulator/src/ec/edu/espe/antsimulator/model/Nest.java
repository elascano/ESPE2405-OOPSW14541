package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Ismael Travez, The Java Bandits, DCCO-ESPE
 */
public class Nest {
    private Cell position;
    private Food[] stockPile;

    public Nest(Cell position, Food[] stockPile) {
        this.position = position;
        this.stockPile = stockPile;
    }

    @Override
    public String toString() {
        return "Nest{" + "position=" + position + ", stockPile=" + stockPile + '}';
    }
    
    /**
     * @return the position
     */
    public Cell getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Cell position) {
        this.position = position;
    }

    /**
     * @return the stockPile
     */
    public Food[] getStockPile() {
        return stockPile;
    }

    /**
     * @param stockPile the stockPile to set
     */
    public void setStockPile(Food[] stockPile) {
        this.stockPile = stockPile;
    }
    
    
}
