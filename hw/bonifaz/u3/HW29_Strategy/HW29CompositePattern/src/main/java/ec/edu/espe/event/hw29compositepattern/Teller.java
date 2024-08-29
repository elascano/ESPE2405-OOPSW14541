package ec.edu.espe.event.hw29compositepattern;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class Teller extends Employee {

    public Teller(String aName) {
        this();
        name = aName;
    }

    public void stateName() {
        super.stateName();
    }

    public Teller() {
        title = "Teller";
    }
}
