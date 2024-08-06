package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Jenniffer Marquez, JavaSquad, DCCO-ESPE
 */
public class Eagle extends Bird{

    public Eagle(int id, String description, Date dateOnborn, char gender, int numberOfBones, Cage cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }

    @Override
    public void Feed(int food) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
