package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class Monkey extends Primate{

    public Monkey(int id, String description, Date bornOnDate, char gender, Cage cage, int numberOfBones, boolean vetebrate) {
        super(id, description, bornOnDate, gender, cage, numberOfBones, vetebrate);
    }

    @Override
    public void feed(int food) {
        System.out.println("Feeding a monkey");
    }
    
}