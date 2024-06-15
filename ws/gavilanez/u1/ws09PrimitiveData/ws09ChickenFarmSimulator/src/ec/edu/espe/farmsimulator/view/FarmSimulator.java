
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import utils.FileManager;
import utils.DateValidator;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class FarmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kenny's Chicken Farm Simulator V 0.5");
        
        int id;
        int validOption;
        String name;
        String color;
        int age;
        boolean molting;
        
        System.out.println("Enter chicken Id: ");
        id = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Enter chicken Name: ");
        name = scan.nextLine();
        
        System.out.println("Enter chicken Color: ");
        color = scan.nextLine();
        
        System.out.println("Chicken is molting?: ");
        molting =scan.nextBoolean();
        
        LocalDate birthDate = DateValidator.getValidDate();
        LocalDate currentDate = LocalDate.now();
        
        Period period = Period.between(birthDate, currentDate);
        int year = period.getYears();
        int month = period.getMonths();
        int day = period.getDays();
        
        Chicken chicken = new Chicken(id, name, color, molting, year, month, day);
        validOption = DateValidator.getValidOption();
        FileManager.save(chicken.toString(1),"chicken",1);
        Short minuend;
        short subtrahend;
        short difference;
    
        minuend = (short)70000;
        System.out.println(minuend);
    
        float addend1 = 1.2F;
        float addend2 = 2.4F;
        float sum;
        sum = addend1 + addend2;
        System.out.println(sum);
        
        char vowell ='5';
        subtrahend = (short)vowell;
        difference = (short)(minuend-subtrahend);
        System.out.println(subtrahend);
        
        System.out.println(difference);  
    }
}
