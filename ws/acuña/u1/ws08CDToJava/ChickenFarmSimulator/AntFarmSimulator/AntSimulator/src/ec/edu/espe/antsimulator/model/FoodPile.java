
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Marcelo Acuña, Logic Legion, DCCO-ESPE
 */
public class FoodPile {
    private Cell position;
    private int pileAnount;

    public Food yieldFood(int amount){
        Food food= new Food(amount);
        return food;    
    }

    public FoodPile(Cell position, int pileAnount) {
        this.position = position;
        this.pileAnount = pileAnount;
    }

    @Override
    public String toString() {
        return "FoodPile{" + "position=" + position + ", pileAnount=" + pileAnount + '}';
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
     * @return the pileAnount
     */
    public int getPileAnount() {
        return pileAnount;
    }

    /**
     * @param pileAnount the pileAnount to set
     */
    public void setPileAnount(int pileAnount) {
        this.pileAnount = pileAnount;
    }
    
    
    
}
