
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.controller.FileManager;
import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Marco Chanataxi, Dev Dynasty, DCCO-ESPE
 */
public class FarmSimulator {
    public static void main(String[] args) {
        System.out.println("Marco ChickenFarm Simulator V0.5");

        ChickenView view = new ChickenView();
        FileManager controller = new FileManager();
        List<Chicken> chickens = new ArrayList<>();

        // Leer los datos existentes del archivo JSON
        chickens = controller.readFromJson("chicken_data.json");

        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Choose the option you want:");
            System.out.println("1. Add Chicken");
            System.out.println("2. View Chickens");
            System.out.println("3. Update Chicken");
            System.out.println("4. Delete Chicken");
            System.out.println("5. Find Chicken");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    Chicken chicken = view.getChickenDetailsFromUser();
                    chickens.add(chicken);
                    controller.Save("chicken_data.txt", chickens);
                    controller.saveToJson("chicken_data.json", chickens);
                    view.displayChickenDetails(chicken);
                    System.out.println("Data saved to chicken_data.txt and chicken_data.json");
                    break;

                case 2:
                    chickens = controller.readFromJson("chicken_data.json");
                    for (Chicken c : chickens) {
                        view.displayChickenDetails(c);
                    }
                    break;

                case 3:
                    System.out.print("Please enter the ID of the chicken you want to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    Chicken updatedChicken = view.getChickenDetailsFromUser();
                    controller.updateChicken(updateId, updatedChicken, chickens);
                    controller.Save("chicken_data.txt", chickens);
                    controller.saveToJson("chicken_data.json", chickens);
                    System.out.println("Chicken updated and data saved.");
                    break;

                case 4:
                    System.out.print("Please enter the ID of the chicken you want to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    controller.deleteChicken(deleteId, chickens);
                    controller.Save("chicken_data.txt", chickens);
                    controller.saveToJson("chicken_data.json", chickens);
                    System.out.println("Chicken deleted and data saved.");
                    break;

                case 5:
                    System.out.print("Please enter the ID of the chicken you want to find: ");
                    int findId = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    Chicken foundChicken = controller.findChicken(findId, chickens);
                    if (foundChicken != null) {
                        view.displayChickenDetails(foundChicken);
                    } else {
                        System.out.println("Chicken not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.print("Do you want to perform another operation? (yes/no): ");
            answer = scanner.nextLine();
        } while (answer.equalsIgnoreCase("yes"));

        scanner.close();
    }
}
