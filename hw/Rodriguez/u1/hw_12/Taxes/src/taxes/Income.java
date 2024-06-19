/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxes;

/**
 *
 * @author David Rodriguez,THEJAVABANDITS,DCCO-ESPE
 */

public class Income {

   public static float calculateIncomeTax(float salary) {
        float tax = 0.0f;

        if (salary <= 11902) {
            tax = 0.0f;
        } else if (salary <= 15159) {
            tax = (salary - 11902) * 0.05f;
        } else if (salary <= 19682) {
            tax = 271.85f + (salary - 15159) * 0.10f;
        } else if (salary <= 26031) {
            tax = 543.85f + (salary - 19682) * 0.12f;
        } else if (salary <= 34255) {
            tax = 991.51f + (salary - 26031) * 0.15f;
        } else if (salary <= 45407) {
            tax = 2196.91f + (salary - 34255) * 0.20f;
        } else if (salary <= 60450) {
            tax = 3686.91f + (salary - 45407) * 0.25f;
        } else if (salary <= 80605) {
            tax = 6331.91f + (salary - 60450) * 0.30f;
        } else if (salary <= 107199) {
            tax = 10042.91f + (salary - 80605) * 0.35f;
        } else {
            tax = 16808.91f + (salary - 107199) * 0.37f;
        }

        return tax;
    }
}