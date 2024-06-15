/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxes;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class Income {
    public static float computeIR(float salary){
        //TODO
        float salaryYear = salary*12;
        float IR=0f;
        
        if(salaryYear<=11902){
            IR = 0f;
        }
        else if(salaryYear <= 15159){
            IR= (salaryYear -11902) * (0.05f);
        }
        else if(salaryYear <= 19682){
            IR = 163 + (salaryYear - 15159 )* (0.10f);
        }
        else if(salaryYear <= 26031){
            IR = 615 + (salaryYear -19682)* (0.12f);
        }else if(salaryYear <= 34255){
            IR = 1377 + (salaryYear -26031 )* (0.15f);
        }else if(salaryYear <= 45407){
            IR = 2611 + (salaryYear - 34255 )* (0.20f);
        }else if(salaryYear <= 60450){
            IR = 4841 + (salaryYear - 45407)* (0.25f);
        }else if(salaryYear <= 80605){
            IR = 8602 + (salaryYear -60450)* (0.30f);
        }
        else if(salaryYear <= 107199){
            IR = 14648 + (salaryYear -80605)* (0.35f);
        }else if(salaryYear > 107199){
            IR = 23956 + (salaryYear - 107199)* (0.37f);
        }
        
        return IR;
    }
}
