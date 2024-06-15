/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxes;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class Sales {
    public static float computeIva(float taxPercentage, float baseAmount){
        float iva;
        iva= baseAmount*taxPercentage/100;
        return iva;
    }
    public float computeIce(){
        //Todo
        return 0.0F;
    }
}
