
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Jenniffer Marquez, Javasquad, DCCO-ESPE
 */
public class Ant {
    private Cell position;
    private int weight;
    
    public void run (){
        System.out.println("Ant is Running");
    }
    public void carry(Food food){
        System.out.println("This ant is carring -->" + food);
    }
    public Ant(Cell position, int weight) {
        this.position = position;
        this.weight = weight;
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
