package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class Monkey extends Primate{

    public Monkey(int id, String description, Date dateOnborn, char gender, int numberOfBones, Cage cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }

    @Override
    public void Feed(int food) {
        System.out.println("Feeding a monkey");
    }
}
