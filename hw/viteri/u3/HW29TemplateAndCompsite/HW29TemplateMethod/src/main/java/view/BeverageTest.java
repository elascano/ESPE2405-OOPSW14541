/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Coffee;
import model.Tea;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class BeverageTest {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        
        System.out.println("\nMaking tea ...");
        tea.prepareRecipe();
        
        System.out.println("\nMaking coffee ...");
        coffee.prepareRecipe();
    }
}