/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package espe.edu.ec.calculator.view;

import espe.edu.ec.calculator.controller.USTax;

/**
 *
 * @author Yuliana Valencia, DCCO-ESPE
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        USTax singletonInstance = USTax.getInstance();

        double purchaseAmount = 100.0; // Monto de la compra
        double vatRate = 0.18; // Tasa de IVA del 18%

        double vatAmount = singletonInstance.calculateVAT(purchaseAmount, vatRate);
        System.out.println("Monto de IVA: " + vatAmount);

        // Cambiar el valor de someValue utilizando los métodos get y set
        int currentValue = singletonInstance.getSomeValue();
        System.out.println("Valor actual de someValue: " + currentValue);

        singletonInstance.setSomeValue(42);
        System.out.println("Nuevo valor de someValue: " + singletonInstance.getSomeValue());
    }

}
