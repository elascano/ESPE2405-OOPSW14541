
package utils;

/**
 *
 * @author G400
 */
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import espe.edu.ec.alamcen.model.Cellphone;


import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class CellphoneManager {
    private ArrayList<Cellphone> cellphones;
    private static final String FILE_NAME = "cellphones.json";
    private static final Gson gson = new Gson();

    public CellphoneManager() {
        this.cellphones = new ArrayList<>();
    }

    public void addCellphone(Cellphone cellphone) {
        cellphones.add(cellphone);
    }

    public void saveToFile() throws IOException {
        try (Writer writer = new FileWriter(FILE_NAME)) {
            gson.toJson(cellphones, writer);
        }
    }

    public void loadFromFile() throws IOException {
        try (Reader reader = new FileReader(FILE_NAME)) {
            Type type = new TypeToken<ArrayList<Cellphone>>() {}.getType();
            cellphones = gson.fromJson(reader, type);
        }
    }

    public void displayCellphones() {
        cellphones.forEach(System.out::println);
    }
}
