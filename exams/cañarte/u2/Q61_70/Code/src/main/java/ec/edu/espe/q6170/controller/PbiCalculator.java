
package ec.edu.espe.q6170.controller;

import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


/**
 *
 * @author Saray Cañarte
 */
public class PbiCalculator {
    public static String computeDifferencePbi(float initialPbi, float finalPbi){
        float result;
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("#0.00", symbols);

        if (finalPbi  >= initialPbi) {
            result = finalPbi - initialPbi;
        } else {
            result =  initialPbi -finalPbi ;
        }

        return df.format(result);
    
    }
   
}
