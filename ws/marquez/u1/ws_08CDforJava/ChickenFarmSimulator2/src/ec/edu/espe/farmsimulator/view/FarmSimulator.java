package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import ec.edu.espe.farmsimulator.input.ChickenInput;
import ec.edu.espe.farmsimulator.output.ChickenOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jenniffer Marquez, Javasquad, DCCO-ESPE
 */
public class FarmSimulator {
    public static void main(String[] args) {
        System.out.println("Jenniffer Chicken Farm Simulator V 0.5 ");

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