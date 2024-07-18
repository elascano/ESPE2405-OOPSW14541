/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.complexoperations.view;

import com.mycompany.complexoperations.controller.Operation;
import com.mycompany.complexoperations.controller.PersonController;
import java.time.LocalDate;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE 
 */
public class ComplexOperations {
    public static void main(String[] args) {
        System.out.println("Welcome to Complex Operation by Abner Arboleda");
        float addend1;
        float addent2;
        float sum;
        
        addend1=1;
        addent2=2;
        sum=Operation.addTwoNumbers(addend1, addent2);
        OperationPrinting.printAdittion(addend1, addent2, sum);
        
        addend1=1.2F;
        addent2=2.4F;
        sum=Operation.addTwoNumbers(addend1, addent2);
        OperationPrinting.printAdittion(addend1, addent2, sum);
        
        addend1=2.2F;
        addent2=-1.8F;
        sum=Operation.addTwoNumbers(addend1, addent2);
        OperationPrinting.printAdittion(addend1, addent2, sum);
        
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
