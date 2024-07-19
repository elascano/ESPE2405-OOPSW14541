package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author David Morillo, JavaSquad, DCCO-ESPE
 */
public class Condor extends Bird{
    private String mountains;

    public Condor(String mountains, int id, String description, Date dateOnborn, char gender, int numberOfBones, Cage cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
        this.mountains = mountains;
    }

    @Override
    public String toString() {
        return "Condor{" + "mountains=" + mountains + super.toString() + '}';
    }

    @Override
    public void Feed(int food) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the mountains
     */
    public String getMountains() {
        return mountains;
    }

    /**
     * @param mountains the mountains to set
     */
    public void setMountains(String mountains) {
        this.mountains = mountains;
    }
}
