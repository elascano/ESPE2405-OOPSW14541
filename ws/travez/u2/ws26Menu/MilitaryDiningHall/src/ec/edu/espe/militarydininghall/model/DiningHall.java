package ec.edu.espe.militarydininghall.model;

import java.util.Arrays;

/**
 *
 * @author THEJAVABANDITS,DCCO-ESPE
 */
public class DiningHall {
    private int id;

    public DiningHall(int id) {
        this.id = id;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void mealSchedule() {
        System.out.println("Meal schedule created");
    }

    public void discountPayment() {
        System.out.println("Payment discounted");
    }

    @Override
    public String toString() {
        return "DiningHall{" +
                "id=" + id +
                '}';
    }
}