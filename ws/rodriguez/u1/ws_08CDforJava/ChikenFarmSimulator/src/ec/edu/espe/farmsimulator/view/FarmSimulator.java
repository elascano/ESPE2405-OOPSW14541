/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.view;
import ec.edu.espe.farmsimulator.input.ChickenInput;
import ec.edu.espe.farmsimulator.output.ChickenOutput;
import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;



/**
 *
 * @author David Rodriguez,THEJAVABANDITS,DCCO-ESPE
 */
public class FarmSimulator {
    public static void main(String[] args) {
        System.out.println("David Chicken Farm Simulator V 0.5 ");

        
        Chicken chicken = ChickenInput.enterChickenData();

        
        ChickenOutput.saveChickenToFile(chicken, "chicken.txt");

        
        System.out.println("Chicken --> \n" + chicken);
    }
   
    
}
