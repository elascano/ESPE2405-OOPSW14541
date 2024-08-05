package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public abstract class Primate extends Mammal{

    public Primate(int id, String description, Date dateOnborn, char gender, int numberOfBones, Cage cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }

}
