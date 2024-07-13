package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public abstract class Bird extends Animal {

    public Bird(int id, String description, Date dateOnborn, char gender, int numberOfBones, Cage cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }

}
