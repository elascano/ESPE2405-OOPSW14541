
package ec.edu.espe.Taxcalculator.view;
import ec.edu.espe.Taxcalculator.model.Section;
import java.util.ArrayList;
import java.util.List;
import ec.edu.espe.Taxcalculator.utils.TaxCalculator;
import java.util.Scanner;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class TaxCalculatorSystem {
    
    
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          List<Section> sections = new ArrayList<>();
          sections.add(new Section(0,11902,0,0.0F));
          sections.add(new Section(11902, 15159, 0, 0.05F));
          sections.add(new Section(15159, 19682, 163, 0.10F));
          sections.add(new Section(19682, 26031, 615, 0.12F));
          sections.add(new Section(26031, 34255, 1377, 0.15F));
          sections.add(new Section(34255, 45407, 2611, 0.20F));
          sections.add(new Section(45407, 60450, 4841, 0.25F));
          sections.add(new Section(60450, 80605, 8602, 0.30F));
          sections.add(new Section(80605, 107199, 14648, 0.35F));
          sections.add(new Section(107199, Double.POSITIVE_INFINITY, 23956, 0.37F));
          
          System.out.println("Enter your annual salary:");
          double annualincome = scanner.nextDouble();
          double tax=TaxCalculator.Tax(annualincome,sections);
          double salary=annualincome-tax;
          System.out.println("Your annual tax is " + tax);
          System.out.println("Your salary is " + salary);
          
          
          
      }
    
      
}
