/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex.edu.espe.apartments.controller;

/**
 *
 * @author G406
 */
public class CalculatedPrice {
    public static int calculedPrice(int price, int time){
        int totalPrice = 0;
        
        totalPrice = price * time;
        
        return totalPrice;
    }
}
