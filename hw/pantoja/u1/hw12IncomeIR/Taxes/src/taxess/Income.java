/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxess;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class Income {
    public static float computeIR(float salary){
        float annualSalary = salary * 12;
        float IR = 0.F;
        if(annualSalary > 0 && annualSalary <= 11902){
           IR = 0.F;
        }
        else if(annualSalary > 11902 && annualSalary <= 15159){
            IR = (annualSalary - 11902) * 0.05F;
        }
        else if(annualSalary > 15159 && annualSalary <= 19682){
            IR = (annualSalary - 15159) * 0.10F + 163;
        }
        else if(annualSalary > 19682 && annualSalary <= 26031){
            IR = (annualSalary - 19682) * 0.12F + 615;
        }
        else if(annualSalary > 26031 && annualSalary <= 34255){
            IR = (annualSalary - 26031) * 0.15F + 1377;
        }
        else if(annualSalary > 34255 && annualSalary <= 45407){
            IR = (annualSalary - 34255) * 0.20F + 2611;
        }
        else if(annualSalary > 45407 && annualSalary <= 60450){
            IR = (annualSalary - 45407) * 0.25F + 4841;
        }
        else if(annualSalary > 60450 && annualSalary <= 80605){
            IR = (annualSalary - 60450) * 0.30F + 8602;
        }
        else if(annualSalary > 80605 && annualSalary <= 107199){
            IR = (annualSalary - 80605) * 0.35F + 14648;
        }
        else if(annualSalary > 107199 ){
            IR = (annualSalary - 107199) * 0.37F + 23956;
        }
        //TODO
        return IR;
    }
    
   
    
}
