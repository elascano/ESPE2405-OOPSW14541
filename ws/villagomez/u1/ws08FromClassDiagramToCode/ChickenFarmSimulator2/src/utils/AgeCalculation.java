package utils;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author usuar
 */
public class AgeCalculation {
    public static int calculateAge(Date bornOnDate) {
        Calendar birth = Calendar.getInstance();
        birth.setTime(bornOnDate);
        Calendar today = Calendar.getInstance();
        
        int age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        
        if (today.get(Calendar.MONTH) < birth.get(Calendar.MONTH) || 
            (today.get(Calendar.MONTH) == birth.get(Calendar.MONTH) && today.get(Calendar.DAY_OF_MONTH) < birth.get(Calendar.DAY_OF_MONTH))) {
            age--;
        }
        
        return age;
    }
}
