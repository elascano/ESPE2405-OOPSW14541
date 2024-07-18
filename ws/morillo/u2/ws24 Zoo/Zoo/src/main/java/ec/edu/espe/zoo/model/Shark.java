package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author David Morillo, JavaSquad, DCCO-ESPE
 */
public class Shark extends Fish{

    public Shark(int id, String description, Date dateOnborn, char gender, int numberOfBones, Cage cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }

    @Override
    public void Feed(int food) {
        System.out.println("Feeding the Shark with " + food + " seal");
    }
    
}
