package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Luis Vaca, DCCO-ESPE
 */
public abstract class Feline extends Mammal{

    public Feline(int id, String description, Date dateOnborn, char gender, int numberOfBones, Cage cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }

}
