/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;



/**
 *
 * @author David Rodriguez,THEJAVABANDITS,DCCO-ESPE
 */
public class FarmSimulator {
    public static void main(String[] args) {
        System.out.println("David chicken Farm Simulator V 0.5 ");
        Chicken chicken= new Chicken(1, "Lucy" , "whiteand brone", 0, true, new Date());
        
        System.out.println("Chicken --> \n" + chicken);
        
        int id = 2;
        String name = "Maruja";
        String color = "black";
        int age = 1;
        boolean molting = false;
        Date bornOnDate = new Date();
        
        chicken = new Chicken(id, name, color, age, molting, bornOnDate);
        System.out.println("Chiken 2 --> \n" + chicken);
        
        
    }
            
    
}
