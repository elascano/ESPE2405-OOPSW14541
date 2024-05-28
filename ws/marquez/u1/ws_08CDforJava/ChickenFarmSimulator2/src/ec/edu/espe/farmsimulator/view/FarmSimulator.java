/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import ec.edu.espe.farmsimulator.input.ChickenInput;
import ec.edu.espe.farmsimulator.output.ChickenOutput;
import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;
/**
 *
 * @author Jenniffer Marquez, Javasquad, DCCO-ESPE
 */
public class FarmSimulator {
   public static void main(String[] args) {
        System.out.println("Jenniffer Chicken Farm Simulator V 0.5 ");

        
        Chicken chicken = ChickenInput.enterChickenData();

        
        ChickenOutput.saveChickenToFile(chicken, "chicken.txt");

        
        System.out.println("Chicken --> \n" + chicken);
    }
    
}
