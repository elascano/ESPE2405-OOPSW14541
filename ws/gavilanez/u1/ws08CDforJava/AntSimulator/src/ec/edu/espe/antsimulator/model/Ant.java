
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class Ant {
    private Cell position;
    private int weight;
    public void run(){
        System.out.println("Ant is running");
    }

    @Override
    public String toString() {
        return "Ant{" + "position=" + position + ", weight=" + weight + '}';
    }

    public Ant(Cell position, int weight) {
        this.position = position;
        this.weight = weight;
    }
    
    
    public void carry(Food food){
        System.out.println("This ant is carrying ---> " + food);
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
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
}
