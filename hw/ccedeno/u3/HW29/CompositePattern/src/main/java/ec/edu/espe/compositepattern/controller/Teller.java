
package ec.edu.espe.compositepattern.controller;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
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
