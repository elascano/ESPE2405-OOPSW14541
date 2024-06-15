package Taxes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class sales {
    public static float computeIva(float taxPorcentaje, float baseAmount){
     float iva;
     iva= baseAmount * taxPorcentaje;
     return iva;
    }
    public static float computeIce(){
        return 0.0F;
    }
}
