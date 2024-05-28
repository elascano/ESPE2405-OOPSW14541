
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;
import java.util.Scanner;
import utils.AgeCalculator;
import utils.DateConverter;
import utils.FileManager;
/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class FarmSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Christian's Chicken farm simulator V0.6");
        System.out.print("\nHow many chickens do you want to enter?: ");
        int chickenNumber = scanner.nextInt();
        
        for (int aux = 0; aux < chickenNumber; aux++) {

            System.out.println("\nChicken Data");

            int id= FileManager.FileReadLastId()+1;
            
            System.out.print("ID: "+ id+"\n");          

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Color: ");
            String color = scanner.next();

            System.out.print("Molting [true/false]: ");
            boolean molting = scanner.nextBoolean();      

            System.out.print("Born on date [dd/MM/yyyy]: ");
            String bornOnDate = scanner.next();

            int age = AgeCalculator.AgeCalculator(bornOnDate);
            Date born=DateConverter.convertToDate(bornOnDate);


            Chicken chicken = new Chicken(id, name, color, age, molting, born);
            FileManager.FileSave(chicken);
            
        }
    }
}