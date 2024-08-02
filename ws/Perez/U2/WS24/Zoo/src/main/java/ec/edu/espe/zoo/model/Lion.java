package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class Lion extends Feline{

    boolean mane;

    public Lion(boolean mane, int id, String description, Date bornOnDate, char gender, Cage cage, int numberOfBones, boolean vetebrate) {
        super(id, description, bornOnDate, gender, cage, numberOfBones, vetebrate);
        this.mane = mane;
    }

    @Override
    public void feed(int food) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Lion{" + "mane=" + mane + super.toString() + '}';
    }
    /*
    @Override
    public void feed(int food){
        System.out.println("feeding the lion with " + food + "mice");
    }
    */
    public void feed(int quantity, Food food){
        System.out.println("feedinf the lion with " + quantity + " " + food + "(s)");
    }
    
}