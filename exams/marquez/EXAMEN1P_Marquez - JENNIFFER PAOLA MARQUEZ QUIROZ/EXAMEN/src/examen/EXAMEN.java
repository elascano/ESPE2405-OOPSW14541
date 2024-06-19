/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G406
 */
public class EXAMEN {

    public static void main(String[] args) {
        // Create a list of Cathedral objects
        List<Cathedral> cathedrals = new ArrayList<>();
        cathedrals.add(new Cathedral(1, "Basílica del Voto Nacional", "Quito", "Father Julio Matovelle"));
        Gson gson = new Gson();
        String json = gson.toJson(cathedrals);

        try (FileWriter writer = new FileWriter("cathedrals.json")) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class Cathedral {
        private int id;
        private String name;
        private String location;
        private String architect;

        public Cathedral(int id, String name, String location, String architect) {
            this.id = id;
            this.name = name;
            this.location = location;
            this.architect = architect;
        }
    }
}

