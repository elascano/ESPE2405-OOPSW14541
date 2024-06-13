
package espe.edu.ec.farmsimulator.view;

import espe.edu.ec.farmsimulator.model.Chicken;
import java.util.Date;

/**
 *
 * @author Saray Cañarte, codecreators, DCCO - ESPE
 */
public class FarmSimulator {
    public static void main (String[]args){
        System.out.println ("Saray's Chicken Farm Simulator V 0.5"); 
       
        Chicken chicken = new Chicken (1, "Lucy", "white and brown", 0, true, new Date());
        System.out.println ("Chicken ---> \n"+ chicken);
        
        int id =2;
        String name = "Maruja";
        String color = "black";
        int age =1;
        boolean molting = false;
        Date borOnDate =new Date();
        
        chicken = new Chicken (id, name, color, age, molting, borOnDate);
        System.out.println ("Chicken ---> \n"+ chicken);
        
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
