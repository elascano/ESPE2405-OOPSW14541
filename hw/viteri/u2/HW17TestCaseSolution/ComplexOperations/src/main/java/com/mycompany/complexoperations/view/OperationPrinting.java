/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complexoperations.view;
import controller.Operations;
import static controller.Operations.round;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class OperationPrinting {

    public static void printAddition(double addend1, double addent2, double sum) {
        addend1=round(addend1, 2);
        addent2=round(addent2, 2);
        System.out.println("The addition of " + addend1 + " + " + addent2 + " is " + sum);
    }
    
}
