package ec.edu.espe.Taxcalculator.utils;

import ec.edu.espe.Taxcalculator.model.Section;
import java.util.List;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class TaxCalculator {
    public static double Tax (double annualincome,List<Section> sections ){
        for (Section section : sections){
            if (annualincome >= section.getLowerlimit() && annualincome <= section.getUpperlimit()){
                double basetax = section.getBasetax();
                double excesspercentage= section.getExcesspercentage();
                double lowerlimit = section.getLowerlimit();
                double annualtax = basetax + (annualincome - lowerlimit) * excesspercentage;
                return Math.round(annualtax * 100.0) / 100.0;
                                
            }
            
        }
        return 1;
    }

    
}
