package taxes;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public  class Income {
    public static float computeIR(float salary){
        float totalAnualSalary;
        float totalMonthlySalary;
        float irTaxPerYear;
        float irTaxPerMonth;
        float anualSalary = salary * 12;
        
        if (anualSalary >=0 && anualSalary < 11902){
            irTaxPerYear = 0;
        } else if (anualSalary >= 11902.00 && anualSalary < 15159.00){
            irTaxPerYear = ((anualSalary - 11902F)*0.05F);
        }else if (anualSalary >= 15159.00 && anualSalary < 19682.00){
            irTaxPerYear = (((anualSalary - 15159) * 0.10F)+163);
        }else if (anualSalary >= 19682.00 && anualSalary < 26031.00){
            irTaxPerYear = (((anualSalary - 19682) * 0.12F)+615);
        }else if (anualSalary >= 26031.00 && anualSalary < 34255.00){
            irTaxPerYear = (((anualSalary - 26031) * 0.10F)+1377);
        }else if (anualSalary >= 34255.00 && anualSalary < 45407.00){
            irTaxPerYear = (((anualSalary - 34255) * 0.10F)+2611);
        }else if (anualSalary >= 45407.00 && anualSalary < 60450.00){
            irTaxPerYear = (((anualSalary - 45407) * 0.10F)+4841);
        }else if (anualSalary >= 60450.00 && anualSalary < 80605.00){
            irTaxPerYear = (((anualSalary - 60450) * 0.10F)+8602);
        }else if (anualSalary >= 80605.00 && anualSalary < 107199.00){
            irTaxPerYear = (((anualSalary - 80605) * 0.10F)+14648);
        } else {
            irTaxPerYear = (((anualSalary - 107199) * 0.10F)+23956);
        } 
        
        
        return irTaxPerYear;
    }
    
}
