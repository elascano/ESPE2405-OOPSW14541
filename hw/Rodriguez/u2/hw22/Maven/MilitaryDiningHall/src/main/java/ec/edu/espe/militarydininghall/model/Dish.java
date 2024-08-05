package ec.edu.espe.militarydininghall.model;

import java.util.Date;

/**
 *
 * @author TheJavaBandits, DCCO-ESPE
 */
public class Dish {

    protected String date;
    protected String breakfast;
    protected String lunch;
    protected String dinner;

    public Dish() {
        // keep empty for it to work
    }

    public Dish(String date, String breakfast, String lunch, String dinner) {
        this.date = date;
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }
    
    @Override
    public String toString() {
        return "Dishes{" + "Date=" + getDate() + ", breakfast=" + getBreakfast() + ", lunch=" + getLunch() + ", dinner=" + getDinner() + '}';
    }

    public String notification() {
        return "This month the dishes are:\nBreakfast: " + getBreakfast() + " / Lunch: " + getLunch() + " / Dinner: " + getDinner();
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the breakfast
     */
    public String getBreakfast() {
        return breakfast;
    }

    /**
     * @param breakfast the breakfast to set
     */
    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    /**
     * @return the lunch
     */
    public String getLunch() {
        return lunch;
    }

    /**
     * @param lunch the lunch to set
     */
    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    /**
     * @return the dinner
     */
    public String getDinner() {
        return dinner;
    }

    /**
     * @param dinner the dinner to set
     */
    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

}
