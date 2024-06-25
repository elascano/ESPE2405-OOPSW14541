/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.goalkeepermanagerobject.model;

/**
 *
 * @author G406
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Goalkeeper {

    public Goalkeeper(String par, String par1, int intValue, String par2) {
    }
    private static final String FILE_PATH = "goalkeepers.json";
    private ArrayList<Goalkeeper> goalkeepers = new ArrayList<>();

    public void addGoalkeeper(Goalkeeper goalkeeper) {
        goalkeepers.add(goalkeeper);
    }

    public void saveToFile() {
        JSONArray jsonArray = new JSONArray();
        for (Goalkeeper goalkeeper : goalkeepers) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", goalkeeper.getId());
            jsonObject.put("name", goalkeeper.getName());
            jsonObject.put("age", goalkeeper.getAge());
            jsonObject.put("team", goalkeeper.getTeam());
            jsonArray.add(jsonObject);
        }
        try (FileWriter file = new FileWriter(FILE_PATH)) {
            file.write(jsonArray.toJSONString());
            file.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile() {
        try (FileReader reader = new FileReader(FILE_PATH)) {
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(reader);
            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;
                Goalkeeper goalkeeper = new Goalkeeper(
                        (String) jsonObject.get("id"),
                        (String) jsonObject.get("name"),
                        ((Long) jsonObject.get("age")).intValue(),
                        (String) jsonObject.get("team")
                );
                goalkeepers.add(goalkeeper);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printGoalkeepers() {
        for (Goalkeeper goalkeeper : goalkeepers) {
            System.out.println(goalkeeper);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Goalkeeper manager = new Goalkeeper((String) jsonObject.get("id"), (String) jsonObject.get("name"), ((Long) jsonObject.get("age")).intValue(), (String) jsonObject.get("team"));

        System.out.println("Cargando porteros desde el archivo...");
        manager.loadFromFile();
        manager.printGoalkeepers();

        System.out.println("Agregar un nuevo portero:");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Nombre: ");
        String name = scanner.nextLine();
        System.out.print("Edad: ");
        int age = scanner.nextInt();
        scanner.nextLine();                 // consume the remaining newline
        System.out.print("Equipo: ");
        String team = scanner.nextLine();

        Goalkeeper newGoalkeeper = new Goalkeeper(id, name, age, team);
        manager.addGoalkeeper(newGoalkeeper);

        System.out.println("Guardando porteros en el archivo...");
        manager.saveToFile();

        System.out.println("Porteros actuales:");
        manager.printGoalkeepers();
    }
}