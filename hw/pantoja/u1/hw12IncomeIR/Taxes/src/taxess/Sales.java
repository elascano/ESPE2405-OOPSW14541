/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxess;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class Sales {
    public static float computeIva(float taxPercentage, float baseAmount){
        float iva;
        iva = baseAmount * taxPercentage  /100;
        return iva;
    }
    public static float computeIce(){
        //TODO
        return 0.0F;
    }
}
