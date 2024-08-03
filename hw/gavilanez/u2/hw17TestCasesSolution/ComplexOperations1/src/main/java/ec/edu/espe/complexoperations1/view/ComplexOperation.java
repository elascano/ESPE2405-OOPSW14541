
package ec.edu.espe.complexoperations1.view;

import ec.edu.espe.complexoperations1.controller.Operation;
import ec.edu.espe.complexoperations1.controller.PersonController;
import java.time.LocalDate;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class ComplexOperation {
    
    public static void main(String[] args) {
        System.out.println("welcome to: complex Operation \n Kenny Gavilanez");
        float addend1;
        float addend2;
        float sum;
        
        addend1=1;
        addend2=2;
        
        sum= Operation.addtwoNumbers(addend1, addend2);
        OperationPrinting.printAdditon(addend1,addend2,sum);
        
        addend1=1.4f;
        addend2=2.4f;
        
        sum= Operation.addtwoNumbers(addend1, addend2);
        OperationPrinting.printAdditon(addend1,addend2,sum);
        
        addend1=2.2f;
        addend2=-1.8f;
        
        sum= Operation.addtwoNumbers(addend1, addend2);
        OperationPrinting.printAdditon(addend1, addend2, sum);
        
        LocalDate birthDate= LocalDate.parse("2000-03-01");
        long days;
        int years;
        days = PersonController.computeAgeInDays(birthDate);
        years = PersonController.computeAgeInYears(birthDate);
        System.out.println("Kenny is " +days +" days old");
        System.out.println("He was born on "+ birthDate);
        System.out.println("Kenny is " + years + " year-old");
                
    }
}
