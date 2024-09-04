package ec.edu.espe.compositepattern.controller;

/**
 *
 * @author Nahomi Cedeño, codecreators, DCCO - ESPE
 */
public class Teller extends Employee {
    public Teller(String aName) {
        this();
        name = aName;
    }

    public Teller() {
        super();
        title = "Teller";
    }

    @Override
    public void stateName() {
        super.stateName();
    }
}
