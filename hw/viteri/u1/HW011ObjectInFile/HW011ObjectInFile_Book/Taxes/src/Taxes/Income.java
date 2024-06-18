/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taxes;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class Income {
    public static double calculateIncomeTax(double income) {
        double tax = 0;
    
        if (income <= 10000) {
            tax = income * 0.05;
        } else if (income <= 20000) {
            tax = 500 + ((income - 10000) * 0.1);
        } else if (income <= 30000) {
            tax = 2000 + ((income - 20000) * 0.15);
        } else {
            tax = 4500 + ((income - 30000) * 0.2);
        }
    
        return tax;
    }
    }

