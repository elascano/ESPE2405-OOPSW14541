package utils;

import ec.edu.espe.farmsimulator.model.Chicken;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcelo Acuña, Logic Legion, DCCO-ESPE
 */

public class Reader {

    public static List<Chicken> readChickens(String fileName, int type) {
        List<Chicken> chickens = new ArrayList<>();
        Gson gson = new Gson();
        
        if (type == 0) {
            fileName = fileName + ".txt";
        } else if (type == 1) {
            fileName = fileName + ".csv";
        } else if (type == 2) {
            fileName = fileName + ".json";
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Chicken chicken;
                if (type == 2) {
                    chicken = gson.fromJson(line, Chicken.class);
                } else {
                    String[] values = line.split(type == 0 ? ":" : ",");
                    chicken = new Chicken(
                        Integer.parseInt(values[0]),
                        values[1],
                        values[2],
                        Integer.parseInt(values[3]),
                        Boolean.parseBoolean(values[4]),
                        DateConverter.convertToDate(values[5])
                    );
                }
                chickens.add(chicken);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        
        return chickens;
    }
}
