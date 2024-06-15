/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxes;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public class Income {
    
    public static float computeIR(float salary){
        float iR = 0.0F;
        float annualSalary = salary * 12;

        if (annualSalary <= 11902) {
            iR = 0;
        } else if (annualSalary <= 15159) {
            iR = (annualSalary - 11902) * 0.05f;
        } else if (annualSalary <= 19682) {
            iR = 163 + (annualSalary - 15159) * 0.10f;
        } else if (annualSalary <= 26031) {
            iR = 615 + (annualSalary - 19682) * 0.12f;
        } else if (annualSalary <= 34255) {
            iR = 1377 + (annualSalary - 26031) * 0.15f;
        } else if (annualSalary <= 45407) {
            iR = 2611 + (annualSalary - 34255) * 0.20f;
        } else if (annualSalary <= 60450) {
            iR = 4841 + (annualSalary - 45407) * 0.25f;
        } else if (annualSalary <= 80605) {
            iR = 8602 + (annualSalary - 60450) * 0.30f;
        } else if (annualSalary <= 107199) {
            iR = 14648 + (annualSalary - 80605) * 0.35f;
        } else {
            iR = 23956 + (annualSalary - 107199) * 0.37f;
        }

        return iR / 12;
    }
    
}
