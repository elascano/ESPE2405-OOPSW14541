package ec.edu.espe.farmsilumator.view;

import ec.edu.espe.farmsilumator.model.Chicken;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import utils.AgeCalculation;
import utils.FileManager;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Domenica's Chicken Farm Simulator V. 0.5");
        
        try(Scanner input = new Scanner(System.in)) {
            String continueInput;
            
            do {
                int id;
                String name;
                String color;
                boolean molting;
                String bornOnDateStr; 

                System.out.println("Enter the ID:");
                String idStr = input.nextLine();
                id = Integer.parseInt(idStr);

                System.out.println("Enter the name:");
                name = input.nextLine();

                System.out.println("Enter the color:");
                color = input.nextLine();

                System.out.println("Enter if it's molting:");
                String moltingStr = input.nextLine();
                molting = Boolean.parseBoolean(moltingStr);

                System.out.println("Enter the Born On Date: (dd/mm/yyyy)");
                bornOnDateStr = input.nextLine();
                Date bornOnDate = null;

                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    bornOnDate = dateFormat.parse(bornOnDateStr);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                int age = AgeCalculation.calculateAge(bornOnDate); 

                Chicken chicken = new Chicken(id, name, color, age, molting, bornOnDate); 

                FileManager.saveChickenData(chicken);

                System.out.println("Chicken --> \n" + chicken);

                System.out.println("Do you want to enter another chicken? (yes/no):");
                continueInput = input.nextLine();
            } while (continueInput.equalsIgnoreCase("yes"));
            
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
        

    public ChickenFarmSimulator() {
    }
}
