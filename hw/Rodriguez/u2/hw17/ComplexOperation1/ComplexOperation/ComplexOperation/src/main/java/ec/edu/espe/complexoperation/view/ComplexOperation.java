package ec.edu.espe.complexoperation.view;

import ec.edu.espe.complexoperation.controller.Operation;
import ec.edu.espe.complexoperation.controller.PersonController;
import java.time.LocalDate;

/**
 *
 * @author David Rodriguez,THEJAVABANDITS DCCO-ESPE
 */
public class ComplexOperation {

    public static void main(String[] args) {
        System.out.println("Welcome to Complex Operation! \nDavid Rodriguez");

        float addend1;
        float addend2;
        float sum;

        //keyboar imput
        addend1 = 1;
        addend2 = 2;
        sum = Operation.addTwoNumbers(addend1, addend2);
        OperationPrinting.printAdditon(addend1, addend2, sum);

        addend1 = 1.2F;
        addend2 = 2.4F;
        sum = Operation.addTwoNumbers(addend1, addend2);
        OperationPrinting.printAdditon(addend1, addend2, sum);

        addend1 = 2.2F;
        addend2 = -1.8F;
        sum = Operation.addTwoNumbers(addend1, addend2);
        OperationPrinting.printAdditon(addend1, addend2, sum);
        
        LocalDate birthDate = LocalDate.parse("2004-11-10");
        int days;
        int years;
        
        days = PersonController.computeAgeInDays(birthDate);
        years = PersonController.computeAgeInYears(birthDate);
        System.out.println("David is " + days + " days old");
        System.out.println("He was born on " + birthDate);
        System.out.println("David is " + years + " year old");
    }
}
