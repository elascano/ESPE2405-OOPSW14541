/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;

/**
 *
 * @author Carlos Pérez, The Java Bandits, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args){
        System.out.println("Hello chickens from Carlos Perez \nChicken Farm Simulator 2K24 V 0.1");
        
        Chicken chicken = new Chicken(1, "Lucy", "Black", 1, true, new Date());
           
        System.out.println("Chicken --> " + chicken);
        
        int id = 2;
        String name = "Maruja";
        String color = "white";
        int age = 0;
        boolean molting = false;
        Date bornOnDate = new Date();
        
        chicken = new Chicken(id, name, color, age, molting, bornOnDate);
        System.out.println("Chicken --> " + chicken);
    }
}
