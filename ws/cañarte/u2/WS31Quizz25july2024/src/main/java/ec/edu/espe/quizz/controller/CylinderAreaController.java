
package ec.edu.espe.quizz.controller;

import ec.edu.espe.quizz.model.Cylinder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import utils.MongoDBUtil;

/**
 *
 * @author Saray Cañarte & Christian Bonifaz
 */
public class CylinderAreaController {
    public static String computeCylinderArea(double radio, double height) {
        double area;
        
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("#0.00", symbols);

        if (radio > 0 && height > 0) {
            area = 2.00 * Math.PI * radio * (radio + height);
        } else {
            area = 0.00;
        }

        return df.format(area);
    }
    
    public static boolean create(Cylinder cylinder) {
        return MongoDBUtil.create(cylinder);
    }
}
