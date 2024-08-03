package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public abstract class Primate extends Mammal{

    public Primate(int id, String description, Date dateOnborn, char gender, int numberOfBones, Cage cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }

}
