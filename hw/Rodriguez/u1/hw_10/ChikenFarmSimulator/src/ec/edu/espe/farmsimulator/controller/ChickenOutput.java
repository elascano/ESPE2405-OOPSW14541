/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.controller;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import utils.FileManager;


/**
 *
 * @author David Rodriguez,THEJAVABANDITS,DCCO-ESPE
 */
public class ChickenOutput {
    public static void saveChickenToFile(Chicken chicken) {
        String className = ChickenOutput.class.getSimpleName(); // Obtener el nombre de la clase

        System.out.println("Select file type to save:");
        System.out.println("1. TXT");
        System.out.println("2. CSV");
        System.out.println("3. JSON");

        int fileType = validateFileType(scanner, "Enter file type (1-3): ");

        String fileName = className.toLowerCase(); // Usar el nombre de la clase como base para el nombre del archivo

        FileManager.save(chicken, fileType, fileName);
    }

    private static Scanner scanner = new Scanner(System.in); // Declarar el scanner como estático para usarlo en el método

    private static int validateFileType(Scanner scanner, String prompt) {
        int fileType;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                fileType = scanner.nextInt();
                if (fileType >= 1 && fileType <= 3) {
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and 3.");
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // Consume invalid input
            }
        }
        return fileType;
    }
}