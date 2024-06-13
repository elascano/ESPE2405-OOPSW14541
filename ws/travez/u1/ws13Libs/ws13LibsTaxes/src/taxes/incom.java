/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxes;

/**
 *
 * @author Ismael Travez, The Java Bandits, DCCO-ESPE
 */
public class incom {
    
        public static float computeIR(float salary) {
        float annualSalary = salary * 12;
        float IR = 0;
        if (annualSalary <= 11902) {
            IR = 0;
        } else if (annualSalary > 11902 && annualSalary <= 15159) {
            IR = 0.05F * (annualSalary - 11902) + 0;
        } else if (annualSalary > 15159 && annualSalary <= 19682) {
            IR = 0.10F * (annualSalary - 15159) + 163F;
        } else if (annualSalary > 19682 && annualSalary <= 26031) {
            IR = 0.12F * (annualSalary - 19682) + 615F;
        } else if (annualSalary > 26031 && annualSalary <= 34225) {
            IR = 0.15F * (annualSalary - 26031) + 1377F;
        } else if (annualSalary > 34225 && annualSalary <= 45407) {
            IR = 0.20F * (annualSalary - 34225) + 2611F;
        } else if (annualSalary > 45407 && annualSalary <= 60450) {
            IR = 0.25F * (annualSalary - 45407) + 4841F;
        } else if (annualSalary > 60450 && annualSalary <= 80605) {
            IR = 0.30F * (annualSalary - 60450) + 8602F;
        } else if (annualSalary > 8060 && annualSalary <= 107199) {
            IR = 0.35F * (annualSalary - 8060) + 14648F;
        } else if (annualSalary > 107199) {
            IR = 0.37F * (annualSalary - 107199) + 23956F;
        }

        return IR;
    }
}
