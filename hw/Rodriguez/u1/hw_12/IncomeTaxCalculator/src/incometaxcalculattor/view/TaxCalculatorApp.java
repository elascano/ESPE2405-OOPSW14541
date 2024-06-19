/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package incometaxcalculattor.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import incometaxcalculator.model.Employee;
import taxes.Income; // Asegúrate de importar Income si no lo has hecho ya
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author David Rodriguez,THEJAVABANDITS,DCCO-ESPE;
 */


public class TaxCalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your annual salary in USD: ");
        float annualSalary = scanner.nextFloat();

        Employee employee = new Employee(name, annualSalary);

        System.out.println("Employee details:");
        System.out.println(employee); // Esto utilizará automáticamente el método toString()

        String filename = "employee_data.json";
        JsonUtils.saveEmployeeToJson(employee, filename);

        System.out.println("Employee data saved to " + filename);

        scanner.close(); // Cerrar el Scanner al finalizar la lectura de datos
    }

    public static class JsonUtils {

        public static void saveEmployeeToJson(Employee employee, String filename) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            try (FileWriter writer = new FileWriter(filename)) {
                gson.toJson(employee, writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}