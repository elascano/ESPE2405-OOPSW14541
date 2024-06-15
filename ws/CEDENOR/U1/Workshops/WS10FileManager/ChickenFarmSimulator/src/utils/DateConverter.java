package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
* @author Nahomi Cedeño, CODE CREATORS, DCCO-ESPE
 */
public class DateConverter {

    public static Date convertToDate(String dateString) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return formatter.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Invalid date format, use dd/MM/yyyy.");
            return null;
        }
    }
}
