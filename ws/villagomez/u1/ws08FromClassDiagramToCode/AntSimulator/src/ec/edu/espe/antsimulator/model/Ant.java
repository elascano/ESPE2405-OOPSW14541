package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCC-ESPE
 */
public class Ant {
    Cell position;
    int weight;

    @Override
    public String toString() {
        return "Ant{" + "position=" + position + ", weight=" + weight + '}';
    }
    
    public void run(){
        System.out.println("Ant is running");
    }

    public void carry(Food food){
        System.out.println("This ant is carrying --> " + food);
    }
    
    public Ant(Cell position, int weight) {
        this.position = position;
        this.weight = weight;
    }
    
    
}
