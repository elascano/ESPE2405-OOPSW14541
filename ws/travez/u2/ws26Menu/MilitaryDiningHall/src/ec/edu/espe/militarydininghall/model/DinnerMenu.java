package ec.edu.espe.militarydininghall.model;

/**
 *
 * @author THEJAVABANDITS,DCCO-ESPE
 */
public class DinnerMenu {
    private String breakfastName;
    private String lunchName;
    private String snackName;

    public DinnerMenu(String breakfastName, String lunchName, String snackName) {
        this.breakfastName = breakfastName;
        this.lunchName = lunchName;
        this.snackName = snackName;
    }

    // Getters and Setters
    public String getBreakfastName() {
        return breakfastName;
    }

    public void setBreakfastName(String breakfastName) {
        this.breakfastName = breakfastName;
    }

    public String getLunchName() {
        return lunchName;
    }

    public void setLunchName(String lunchName) {
        this.lunchName = lunchName;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public void changeDishName(String newBreakfastName, String newLunchName, String newSnackName) {
        this.breakfastName = newBreakfastName;
        this.lunchName = newLunchName;
        this.snackName = newSnackName;
        System.out.println("Dish names changed to: Breakfast - " + newBreakfastName + ", Lunch - " + newLunchName + ", Snack - " + newSnackName);
    }

    @Override
    public String toString() {
        return "DinnerMenu{" +
                "breakfastName='" + breakfastName + '\'' +
                ", lunchName='" + lunchName + '\'' +
                ", snackName='" + snackName + '\'' +
                '}';
    }
}
