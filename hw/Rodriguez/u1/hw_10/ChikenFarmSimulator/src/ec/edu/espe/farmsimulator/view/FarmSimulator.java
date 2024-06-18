/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.view;
import ec.edu.espe.farmsimulator.controller.ChickenInput;
import ec.edu.espe.farmsimulator.controller.ChickenOutput;
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

    ChickenOutput.saveChickenToFile(chicken);

    System.out.println("Chicken --> \n" + chicken);
        Short minuend; 
        short subtrahend;
        short difference;
    
        minuend=(short)70000;
        System.out.println(minuend);
        
        float addend1=1.2F;
        float addend2=2.4F;
        float sum;
        sum=addend1+addend2;
        System.out.println(sum);
        
        char vowell='5';
        subtrahend=(short)vowell;
       difference=(short)(minuend-subtrahend);
        System.out.println(subtrahend);
        
        System.out.println(difference);
    }
    
}