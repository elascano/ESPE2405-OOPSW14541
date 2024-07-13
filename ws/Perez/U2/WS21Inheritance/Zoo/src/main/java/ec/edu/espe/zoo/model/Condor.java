package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class Condor extends Bird{

    protected String montain;

    public Condor(String montain, int id, String description, Date bornOnDate, char gender, Cage cage, int numberOfBones, boolean vetebrate) {
        super(id, description, bornOnDate, gender, cage, numberOfBones, vetebrate);
        this.montain = montain;
    }

    @Override
    public void feed(int food) {
        System.out.println("feeding a condor with dead animals");    
    }

    /**
     * @return the montain
     */
    public String getMontain() {
        return montain;
    }

    /**
     * @param montain the montain to set
     */
    public void setMontain(String montain) {
        this.montain = montain;
    }

    @Override
    public String toString() {
        return "Condor{" + "montain=" + montain + super.toString() + '}';
    }
    
    
}
