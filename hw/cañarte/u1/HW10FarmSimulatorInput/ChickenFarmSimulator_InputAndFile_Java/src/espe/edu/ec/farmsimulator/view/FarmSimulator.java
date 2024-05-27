package espe.edu.ec.farmsimulator.view;

import espe.edu.ec.farmsimulator.model.Chicken;
import espe.edu.ec.farmsimulator.controller.SaveToFile;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Saray Cañarte, codecreators, DCCO - ESPE
 */
public class FarmSimulator {

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Saray's Chicken Farm Simulator V 0.5");

      int id;
      String name;
      String color;
      int age;
      boolean molting;
      String bornOnDate;

      System.out.print("ID: ");
      String idString = input.nextLine(); 
      id = Integer.parseInt(idString);  

      System.out.print("Name: ");
      name = input.nextLine();

      System.out.print("Color: ");
      color = input.nextLine();

      System.out.print("Age: ");
      String ageString = input.nextLine(); 
      age = Integer.parseInt(ageString);  

      System.out.print("Molting (true/false): ");
      String moltingString = input.nextLine(); 
      molting = Boolean.parseBoolean(moltingString);  

      System.out.print("Born on date (dd/mm/yyyy): ");
      bornOnDate = input.nextLine();

      Chicken chicken = new Chicken(id, name, color, age, molting, bornOnDate);
      
      try {
        SaveToFile.saveChickenToFile(chicken, "chickenData.txt");
        System.out.println("Chicken data has been saved");
      } catch (IOException e) {
        System.err.println("Error saving chicken data");
      }
      
      System.out.println("Chicken ---> \n" + chicken);
    }
  }
}
