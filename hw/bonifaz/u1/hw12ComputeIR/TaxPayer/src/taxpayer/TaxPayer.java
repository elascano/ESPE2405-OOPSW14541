
package taxpayer;

import taxes.Income;
import taxes.Sales;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class TaxPayer {

    public static void main(String[] args) {  
        float monthlySalary=2000F;
        float iva= Sales.computeIva(15, monthlySalary);
        System.out.println("Iva --> "+iva);
        float salary= Income.computeIR(monthlySalary);
        float salaryAc=monthlySalary-salary;
        System.out.println("IR --> "+ salaryAc);
        System.out.println("Final Salary --> "+salaryAc);
    }
    
}
