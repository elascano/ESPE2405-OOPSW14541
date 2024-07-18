/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espe.complexoperations.view;

import ec.edu.espe.complexoperations.controller.Operations;
import ec.edu.espe.complexoperations.controller.PersonController;
import java.time.LocalDate;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class ComplexOperations {

    public static void main(String[] args) {
        System.out.println("\nWelcome to Complex Operations! \nFrom David Pantoja");
        float addend1;
        float addend2;
        float sum;

        //Keybord input
        addend1 = 1;
        addend2 = 2;
        sum = Operations.addTwoNumbers(addend1, addend2);

        OperationPrinting.printAdd(addend1, addend2, sum);
        
        addend1 = 1.2F;
        addend2 = 2.4F;
        sum = Operations.addTwoNumbers(addend1, addend2);

        OperationPrinting.printAdd(addend1, addend2, sum);
       
        addend1 = 2.2F;
        addend2 = -1.8F;
        sum = Operations.addTwoNumbers(addend1, addend2);

        OperationPrinting.printAdd(addend1, addend2, sum);
        LocalDate date = LocalDate.parse("1970-12-17");
        long ageInDays = PersonController.computeAgeInDays(date);
        int ageInYears = PersonController.computeAgeInYears(date);
        System.out.println(ageInDays);
        System.out.println(ageInYears);
        
        

    }

}
