/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complexoperations.view;

import controller.Operations;
import controller.PersonController;
import java.time.LocalDate;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class ComplexOperations {
    public static void main(String[] args) {
        System.out.println("Welcome to Complex Operation by Alexis Viteri");
        float addend1;
        float addent2;
        float sum;
        
        addend1=1;
        addent2=2;
        sum=Operations.addTwoNumbers(addend1, addent2);
        OperationPrinting.printAddition(addend1, addent2, sum);
        
        addend1=2.2F;
        addent2=2.6F;
        sum=Operations.addTwoNumbers(addend1, addent2);
        OperationPrinting.printAddition(addend1, addent2, sum);
        
        addend1=2.2F;
        addent2=-1.5F;
        sum=Operations.addTwoNumbers(addend1, addent2);
        OperationPrinting.printAddition(addend1, addent2, sum);
        
        LocalDate birthDate = LocalDate.parse("2004-02-04");
       int years;
        int days = PersonController.computeAgeInDays(birthDate);
        years = PersonController.computeAgeInYears(birthDate);
        System.out.println("Alexis is "+days+" days old");
        System.out.println("He was born on "+birthDate);
        
        System.out.println("Alexis is "+ years+ " years old");
    }



}
