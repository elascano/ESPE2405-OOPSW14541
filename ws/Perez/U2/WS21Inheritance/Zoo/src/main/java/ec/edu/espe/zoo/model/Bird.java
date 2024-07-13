package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public abstract class Bird extends Animal{
    
    public Bird(int id, String description, Date bornOnDate, char gender, Cage cage, int numberOfBones, boolean vetebrate) {
        super(id, description, bornOnDate, gender, cage, numberOfBones, vetebrate);
    }
    
}
