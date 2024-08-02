/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.complexoperations.view;

import ec.edu.espe.complexoperations.controller.Operation;
import ec.edu.espe.complexoperations.controller.PersonController;
import java.time.LocalDate;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class ComplexOperations {

    public static void main(String[] args) {
        System.out.println("Welcome to complex operations! \nEduardo Segarra");
        float addend1;
        float addend2;
        float sum;
        
        //keyboard input
        addend1 = 1;
        addend2 = 2;
        
        sum = Operation.addTwoNumbers(addend1, addend2);
        
        OperationPrinting.printAddition(addend1, addend2, sum);
        
        addend1 = 1.2F;
        addend2 = 2.4F;
        
        sum = Operation.addTwoNumbers(addend1, addend2);
        
        OperationPrinting.printAddition(addend1, addend2, sum);
        
        addend1 = 2.2F;
        addend2 = -1.8F;
        
        sum = Operation.addTwoNumbers(addend1, addend2);
        
        OperationPrinting.printAddition(addend1, addend2, sum);
        
        LocalDate birthDate = LocalDate.parse("2004-01-31");
        int days, years;
        
        days = PersonController.computeAgeInDays(birthDate);
        years = PersonController.computeAgeInYears(birthDate);
        
        System.out.println("Eduardo is " + days + " days old.");
        System.out.println("He was born on " + birthDate);
        
        System.out.println("Eduardo is " + years + "years-old");
    }

}
