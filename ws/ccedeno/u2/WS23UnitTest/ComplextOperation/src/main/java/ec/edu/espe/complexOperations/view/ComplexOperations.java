/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.complexOperations.view;

import es.edu.espe.complexOperations.controller.Operation;
import es.edu.espe.complexOperations.controller.PersonController;
import java.time.LocalDate;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class ComplexOperations {
    
    public static void main(String[] args) {
        System.out.println("welcome to complex Operations andres cedeno");
        
        float addend1;
        float addend2;
        float sum;
        
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
        
        LocalDate birthDate = LocalDate.parse("1970-12-17");
        int days;
        int years;
        days = PersonController.computeAgeInDays(birthDate);
        years = PersonController.computeAgeInYears(birthDate);
        System.out.println("Andres is"+days+"daus old");
        System.out.println("he was born on" + birthDate);
        
        System.out.println("Andres is" + years +"year-old");
    }

}
