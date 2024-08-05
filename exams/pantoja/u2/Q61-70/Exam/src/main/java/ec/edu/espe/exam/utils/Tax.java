package ec.edu.espe.exam.utils;

/**
 *
 * @author David Pantoja
 */

public class Tax {

    static float ivaPercentage = 12.0f;

    public static float computeIva(float amount) {
        float iva;

        iva = amount * ivaPercentage / 100;
        return iva;
    }

    public static float computePvP(float amount) {
        float total;

        total = amount + computeIva(amount);
        return total;
    }

    public static float computeIncomeTax(float monthlyIncome) {

        float incomeTax;
        
        float annualIncome = monthlyIncome * 12.0f;
        
        float netSalary = annualIncome - (annualIncome * 0.1145f);
       
        
        if (netSalary <= 11722) {
            incomeTax = netSalary ;
        } else if (netSalary <= 14930) {
            incomeTax = ((netSalary - 11722) * 0.5f) + 0;
        } else if (netSalary <= 19385) {
            incomeTax = ((netSalary - 14930) * 0.10f) + 160;
        } else if (netSalary <= 25638) {
            incomeTax = ((netSalary - 19385) * 0.12f) + 606;
        } else if (netSalary <= 33738) {
            incomeTax = ((netSalary - 25638) * 0.15f) + 1356;
        } else if (netSalary <= 44721) {
            incomeTax = ((netSalary - 33738) * 0.2f) + 2571;
        } else if (netSalary <= 59537) {
            incomeTax = ((netSalary - 44721) * 0.25f) + 4768;
        } else if (netSalary <= 79388) {
            incomeTax = ((netSalary - 59537) * 0.3f) + 8472;
        } else if (netSalary <= 105580) {
            incomeTax = ((netSalary - 79388) * 0.35f) + 14427;
        } else {
            incomeTax = ((netSalary - 105580) * 0.37f) + 23594;
        }
        
        return incomeTax;
       
    }    
}
