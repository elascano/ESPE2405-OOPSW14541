package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class DateConverter {

    public static Date convertToDate(String dateString) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return formatter.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido. Por favor, use dd/MM/yyyy.");
            return null;
        }
    }
}
