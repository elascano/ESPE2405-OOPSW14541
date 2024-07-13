package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Marcelo Acuña, LogicLegion, DCCO-ESPE 
 */
public abstract class Fish extends Animal{
    
    public Fish(int id, String description, Date dateOnborn, char gender, int numberOfBones, Cage cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }
    
}
