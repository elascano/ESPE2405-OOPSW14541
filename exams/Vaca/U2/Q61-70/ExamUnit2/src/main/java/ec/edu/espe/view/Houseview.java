/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.view;

/**
 *
 * @author G406
 */
import ec.edu.espe.controller.HouseController;
import java.util.Scanner;


public class Houseview {

    public void captureHouseData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter house ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter house name: ");
        String name = scanner.nextLine();

        System.out.print("Enter house area (in square meters): ");
        double area = scanner.nextDouble();

        System.out.print("Enter price per square meter: ");
        double pricePerSquareMeter = scanner.nextDouble();

        HouseController controller = new HouseController();
        controller.createHouse(id, name, area, pricePerSquareMeter);
        
        displayMessage("House created successfully!");
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Houseview view = new Houseview();
        view.captureHouseData();
    }
}
