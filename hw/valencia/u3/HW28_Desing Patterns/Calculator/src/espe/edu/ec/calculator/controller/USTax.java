/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package espe.edu.ec.calculator.controller;

/**
 *
 * @author Yuliana Valencia, DCCO-ESPE
 */
public class USTax {
   private static USTax instance;

    private USTax() {
    }

    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }
    public double calculateVAT(double amount, double vatRate) {
        double vatAmount = amount * vatRate;
        return vatAmount;
    }


    public int getSomeValue() {
       return 0;
    }

    public void setSomeValue(int value) {
    }
}