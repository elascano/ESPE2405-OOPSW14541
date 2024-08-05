package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Andres Cedeno, codecreators, DCCO-ESPE
 */
public abstract class Mammal extends Animal {
    
    public Mammal(int id, String description, Date dateOnborn, char gender, int numberOfBones, Cage cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }
    
}
