package ec.edu.espe.compositepattern.controller;

/**
 *
 * @author Nahomi Cedeño, codecreators, DCCO - ESPEte
 */
public class President extends Supervisor {
    private static President president = new President();

    private President(String aName) {
        this();
        name = aName;
    }

    private President() {
        super();
        title = "President";
    }

    public static President getPresident(String aName) {
        president.name = aName;
        return president;
    }

    @Override
    public void stateName() {
        super.stateName();
    }
}

