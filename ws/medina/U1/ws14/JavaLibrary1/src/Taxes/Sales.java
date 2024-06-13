/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taxes;

/**
 *
 * @author Simone Medina, JavaSquad, DCCO-ESPE
 */
public class Sales {
    public static float computeIva(float taxPorcentage, float baseAmount){
        float iva;
        iva= baseAmount * taxPorcentage /100;
        return iva;
          
    }
    public static float computeIce(){
        //To do
        return 0.0F;
    
    }
}
