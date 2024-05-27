package ec.edu.espe.farmsimulator.controller;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Marcelo Acuña, Logic Legion, DCCO-ESPE
 */
public class Reader {

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\prueba\\ChickenClass.txt"))) {
            String line = reader.readLine();
            if (line != null) {
                line = line.substring(line.indexOf("{") + 1, line.indexOf("}"));
                String[] parts = line.split(", ");
                int id = Integer.parseInt(parts[0].split("=")[1]);
                String name = parts[1].split("=")[1];
                String color = parts[2].split("=")[1];
                int age = Integer.parseInt(parts[3].split("=")[1]);
                boolean molting = Boolean.parseBoolean(parts[4].split("=")[1]);
                String bornOnDateString = parts[5].split("=")[1];
                Date bornOnDate = formatter.parse(bornOnDateString);

                Chicken c = new Chicken(id, name, color, age, molting, bornOnDate);
                System.out.println(c.toString());
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

}
