package ec.edu.espe.examnunit2.controller;

/**
 * 
 * @autor Marcelo Acuña, Logic Legion, DCCO-ESPE
 */
public class ControllerVehicle {
    public ControllerVehicle() {
       
    }

     public double calculatePrice(String year) {
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int vehicleYear = Integer.parseInt(year);
        int age = currentYear - vehicleYear;
        double basePrice = 20000;
        double depreciationRate = 0.05;
        double price = basePrice * Math.pow((1 - depreciationRate), age);
        return Math.max(price, 1000); 
    }
}