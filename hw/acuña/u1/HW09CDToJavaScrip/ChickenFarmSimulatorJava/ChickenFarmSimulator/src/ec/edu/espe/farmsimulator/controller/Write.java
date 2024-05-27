package ec.edu.espe.farmsimulator.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Marcelo Acuña, Logic Legion, DCCO-ESPE
 */
class Chicken {

    int id;
    String name;
    String color;
    int age;
    boolean active;
    Date date;

    public Chicken(int id, String name, String color, int age, boolean active, Date date) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.active = active;
        this.date = date;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
        String dateString = dateFormat.format(date);
        return "(" + id + ", \"" + name + "\", \"" + color + "\", " + age + ", \"" + active + ", \"" + dateString + "\")";
    }
}

class File {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> usedIds = new HashSet<>();
        //para sobreescribir
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\prueba\\WChickenClass.txt"))) {
            writer.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //para ir guardando
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\prueba\\WChickenClass.txt", true))) {
            for (int i = 0; i < 1; i++) {

                System.out.println("Marcelo's Chicken farm simulator V0.5");
                System.out.println();
                System.out.println("Intoduce chicken attributes " + (i + 1) + ":");
                System.out.println();

                int id;
                while (true) {
                    System.out.print("ID: ");
                    id = scanner.nextInt();
                    if (usedIds.contains(id)) {
                        System.out.println("ID already used. Please enter a different ID.");
                    } else {
                        usedIds.add(id);
                        break;
                    }
                }

                System.out.print("Name: ");
                String name = scanner.next();

                System.out.print("Color: ");
                String color = scanner.next();

                System.out.print("Age : ");
                int age = scanner.nextInt();

                System.out.print("Molting (true or false): ");
                boolean active = scanner.nextBoolean();

                Date date = new Date();

                Chicken chicken = new Chicken(id, name, color, age, active, date);

                System.out.println(chicken.toString());

                writer.write(chicken.toString());
                writer.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
