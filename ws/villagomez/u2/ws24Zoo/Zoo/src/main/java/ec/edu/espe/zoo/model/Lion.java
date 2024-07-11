package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */
public class Lion extends Feline{
    
    private boolean mane;

    public Lion(boolean mane, int id, String description, Date dateOnborn, char gender, int numberOfBones, Cage cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
        this.mane = mane;
    }

    @Override
    public String toString() {
        return "Lion{" + "mane=" + mane + super.toString() + '}';
    }
    
    @Override
    public void Feed(int food) {
        System.out.println("Feeding a Lion with " + food + " rats");
    }
    
    public void feed(int quantity, Food food){
        System.out.println("Feeding the lion with " + quantity + " " + food + "(s)");
        System.out.println("Number of legs " + numberOfLegs);
    }

    /**
     * @return the mane
     */
    public boolean isMane() {
        return mane;
    }

    /**
     * @param mane the mane to set
     */
    public void setMane(boolean mane) {
        this.mane = mane;
    }
    
}
