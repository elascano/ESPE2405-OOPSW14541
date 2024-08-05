package ec.edu.espe.registrationsystem.model;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */

public class Registration {
    
    private String typeoOfRegistration;

    
    @Override
    public String toString() {
        return typeoOfRegistration;
    }
    
    public Registration(String typeoOfRegistration) {
        this.typeoOfRegistration = typeoOfRegistration;
    }
    
    /**
     * @return the typeoOfRegistration
     */
    public String getTypeoOfRegistration() {
        return typeoOfRegistration;
    }

    /**
     * @param typeoOfRegistration the typeoOfRegistration to set
     */
    public void setTypeoOfRegistration(String typeoOfRegistration) {
        this.typeoOfRegistration = typeoOfRegistration;
    }
    
    
}
