/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxes;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class Income {
    public float computeIR(float salary){
        //Todo 
        float fraccionBasica;
        float impuestoFB;
        float impuestoFE;
        float impuestoTotal;
        float salaryA;
        
        salaryA = salary * 12;
        
        
        if (salaryA >= 0 && salaryA < 11902) {
            fraccionBasica = 0;
            impuestoFB = 0;
            impuestoFE = 0;
        } else if (salaryA < 15159) {
            fraccionBasica = 11902;
            impuestoFB = 0;
            impuestoFE = 0.05F;
        } else if (salaryA < 19682) {
            fraccionBasica = 15159;
            impuestoFB = 163;
            impuestoFE = 0.10F;
        } else if (salaryA < 26031) {
            fraccionBasica = 19682;
            impuestoFB = 615;
            impuestoFE = 0.12F;
        } else if (salaryA < 34255) {
            fraccionBasica = 26031;
            impuestoFB = 1377;
            impuestoFE = 0.15F;
        } else if (salaryA < 45407) {
            fraccionBasica = 34255;
            impuestoFB = 2611;
            impuestoFE = 0.20F;
        } else if (salaryA < 60450) {
            fraccionBasica = 45407;
            impuestoFB = 4841;
            impuestoFE = 0.25F;
        } else if (salaryA < 80605) {
            fraccionBasica = 60450;
            impuestoFB = 8602;
            impuestoFE = 0.30F;
        } else if (salaryA < 107199) {
            fraccionBasica = 80605;
            impuestoFB = 14648;
            impuestoFE = 0.35F;
        } else {
            fraccionBasica = 107199;
            impuestoFB = 23956;
            impuestoFE = 0.37F;
        }
        
        impuestoTotal = impuestoFB + ((salaryA - fraccionBasica) * impuestoFE);
                      
        return impuestoTotal;
    }
}
