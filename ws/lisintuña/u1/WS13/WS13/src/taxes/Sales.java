/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxes;

/**
 *
 * @author DELL
 */
public class Sales {

    public static float compututeIva(float taxPorcentage,float baseAmout) {
    float iva;
    iva=baseAmout + taxPorcentage/100;
    return iva;
   
}
   public static float computeIce(){
       return 0.0F;
   } 
    
}