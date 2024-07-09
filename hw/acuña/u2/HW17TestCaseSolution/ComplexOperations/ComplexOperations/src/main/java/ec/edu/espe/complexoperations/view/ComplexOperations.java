package ec.edu.espe.complexoperations.view;

import ec.edu.espe.complexoperations.controler.Operation;
import ec.edu.espe.complexoperations.controler.PersonController;
import java.time.LocalDate;

/**
 *
 * @author Marcelo Acuña, LogicLegion, DCCO-ESPE 
 */
public class ComplexOperations {

    public static void main(String[] args) {
        System.out.println("Welcome to Complex Operations \nMarcelo Acuna");
        
        float addend1;
        float addend2;
        float sum;
        
        addend1=1;
        addend2=2;
        
        sum=Operation.addTwoNumbers(addend1, addend2);
        
        OperationPrinting.printAddition(addend1, addend2, sum);
        
        addend1=1.2F;
        addend2=2.4F;
        
        sum=Operation.addTwoNumbers(addend1, addend2);
        
        OperationPrinting.printAddition(addend1, addend2, sum);
        
        addend1=2.2F;
        addend2=-1.8F;
        
        sum=Operation.addTwoNumbers(addend1, addend2);
        
        OperationPrinting.printAddition(addend1, addend2, sum);
        
        
        LocalDate birthDate = LocalDate.parse("2004-02-04");
        long days;
        int years;
        days = PersonController.computeAgeInDays(birthDate);
        years = PersonController.computeAgeInYears(birthDate);
        System.out.println("Abner is "+days+" days old");
        System.out.println("He was born on "+birthDate);
        
        System.out.println("Abner is "+ years+ " years old");

        }

}