package ec.edu.espe.chickenfarmsimlator.view;

import ec.edu.espe.chickenfarmsimlator.model.Chicken;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import Utils.FileManager;
import ec.edu.espe.chickenfarmsimlator.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Hello chickens from Danny Ayuquina");

        int id;
        String name;
        String color;
        boolean molting;
        LocalDate bornOnDate;
        
        FileManager fileOperation = new FileManager("chickens","json");

        Chicken chicken = new Chicken(2, "Mariela", "white and brown", true, LocalDate.now());
        fileOperation.save(chicken.toString());

        //Input data
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Id: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter color: ");
        color = scanner.nextLine();
        System.out.println("Enter molting: ");
        molting = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Enter born date: ");
        String bornDateString;
        bornDateString = scanner.nextLine();
        bornOnDate = LocalDate.parse(bornDateString, dateFormat);

        Chicken chicken2 = new Chicken(id, name, color, molting, bornOnDate);

        fileOperation.save(chicken2.toString());
        fileOperation.read();
        
        System.out.println(chicken2);
        
        FileManager fileOperation2 = new FileManager("prueba", "json");
        
    }
}
