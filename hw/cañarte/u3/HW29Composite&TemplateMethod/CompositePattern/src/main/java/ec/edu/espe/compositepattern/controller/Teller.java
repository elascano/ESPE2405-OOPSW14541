package ec.edu.espe.compositepattern.controller;

/**
 *
 * @author Saray Cañarte
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
