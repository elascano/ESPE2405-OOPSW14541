package ec.edu.espe.compositepattern.controller;

/**
 *
 * @author Saray Cañarte
 */
public class Clerk extends Employee {
    public Clerk(String aName) {
        this();
        name = aName;
    }

    public Clerk() {
        super();
        title = "Clerk";
    }

    @Override
    public void stateName() {
        super.stateName();
    }
}
