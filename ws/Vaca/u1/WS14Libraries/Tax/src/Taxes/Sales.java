/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taxes;

/**
 *
 * @author MSI-PULSE
 */
public class Sales {
    public static float computeIVA (float taxPercentaje, float baseAmount){
        float iva;
        iva = baseAmount * taxPercentaje/100;
        return iva;
    }
    
    public static float computeIce (){
        //TODO
        return 0.0F;        
    }
}