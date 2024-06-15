package ec.edu.espe.Taxcalculator.utils;

import ec.edu.espe.Taxcalculator.model.Section;
import java.util.List;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class TaxCalculator {
    
    public static double Taxiess(double mensualincome){
        
        
        return (mensualincome*12) * 0.0945;
    }
    
    public static double Tax (double mensualincome,List<Section> sections ){
        for (Section section : sections){
            if (mensualincome >= section.getLowerlimit() && mensualincome <= section.getUpperlimit()){
                double basetax = section.getBasetax();
                double excesspercentage= section.getExcesspercentage();
                double lowerlimit = section.getLowerlimit();
                double annualtax = basetax + (mensualincome - lowerlimit) * excesspercentage;
                return Math.round(annualtax * 100.0) / 100.0;
                                
            }
            
        }
        return 1;
    }

    
}
