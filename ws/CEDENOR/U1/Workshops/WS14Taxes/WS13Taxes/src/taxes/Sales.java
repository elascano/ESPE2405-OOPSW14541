/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxes;

/**
 *
 * @author Nahomi Cedeno
 */
public class Sales {
    public static float computeIva (float taxPorcentage, float baseAmount){
        float iva;
        iva = baseAmount * taxPorcentage /100;
        return iva;
    }
    public static float computeIce(){
        return 0.0F;
    }
}
