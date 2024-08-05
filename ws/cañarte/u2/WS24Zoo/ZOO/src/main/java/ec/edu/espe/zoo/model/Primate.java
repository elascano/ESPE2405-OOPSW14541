package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Saray Cañarte, codecreators, DCCO - ESPE
 */
public abstract class Primate extends Mammal{

    public Primate(int id, String description, Date dateOnborn, char gender, int numberOfBones, Cage cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }

}
