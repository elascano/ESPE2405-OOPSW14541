/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.complexcontroller.view;

import ec.edu.espe.complexcotroller.controller.Operation;
import ec.edu.espe.complexcotroller.controller.PersonController;
import java.time.LocalDate;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class ComplexOperation {
    public static void main(String[] args) {
        System.out.println("Welcome to Complex Operation \n Christian Bonifaz");
        float addend1;
        float addent2;
        float sum;
        
        addend1=1;
        addent2=2;
        sum=Operation.addTwoNumbers(addend1, addent2);
        OperationPrinting.printAddition(addend1, addent2, sum);
        
        addend1=1.2F;
        addent2=2.4F;
        sum=Operation.addTwoNumbers(addend1, addent2);
        OperationPrinting.printAddition(addend1, addent2, sum);
        
        addend1=2.2F;
        addent2=-1.8F;
        sum=Operation.addTwoNumbers(addend1, addent2);
        OperationPrinting.printAddition(addend1, addent2, sum);
        
        LocalDate birthDate = LocalDate.parse("2001-11-13");
        long days;
        int years;
        days = PersonController.computeAgeInDays(birthDate);
        years = PersonController.computeAgeInYears(birthDate);
        System.out.println("Christian is "+days+" days old");
        System.out.println("He was born on "+birthDate);
        
        System.out.println("Christian is "+ years+ " years old");
    }
}



