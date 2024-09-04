package ec.edu.espe.compositepattern.controller;

/**
 *
 * @author Nahomi Cedeño, codecreators, DCCO - ESPE
 */
public class Manager extends Supervisor {
    public Manager(String aName) {
        this();
        name = aName;
    }

    public Manager() {
        super();
        title = "Manager";
    }

    @Override
    public void stateName() {
        super.stateName();
    }
}

