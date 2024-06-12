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
public class income {
    public static float computeIR(float salary){
        
        float tax;

        if (salary <= 11902) {
            tax = 0;
        } else if (salary <= 15159) {
            tax = (salary - 11902) * 0.05f;
        } else if (salary <= 19682) {
            tax = 163 + (salary - 15159) * 0.10f;
        } else if (salary <= 26031) {
            tax = 615 + (salary - 19682) * 0.12f;
        } else if (salary <= 34255) {
            tax = 1377 + (salary - 26031) * 0.15f;
        } else if (salary <= 45407) {
            tax = 2611 + (salary - 34255) * 0.20f;
        } else if (salary <= 60450) {
            tax = 4841 + (salary - 45407) * 0.25f;
        } else if (salary <= 80605) {
            tax = 8602 + (salary - 60450) * 0.30f;
        } else if (salary <= 107199) {
            tax = 14648 + (salary - 80605) * 0.35f;
        } else {
            tax = 23956 + (salary - 107199) * 0.37f;
        }

        return tax;
    }
        
        
        
    }
    

