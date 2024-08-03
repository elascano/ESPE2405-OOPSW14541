package ec.edu.espe.registrationsystem.model;

import java.util.InputMismatchException;
import java.util.Scanner;
import utils.FileManager;
import utils.Validation;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */
public class StudentReport {

    public void calculateFinalGrade(double unit1Grade, double unit2Grade, double supplementaryGrade) {

        double finalGrade = (unit1Grade + unit2Grade + supplementaryGrade) / 3;

        System.out.println("La calificación final del estudiante es: " + finalGrade);

    }

    public void determinateTypeOfRegistration(String registrationType) {

        switch (registrationType.toLowerCase()) {
            case "first" ->
                System.out.println("El estudiante está registrado por primera vez.");
            case "second" ->
                System.out.println("El estudiante está registrado por segunda vez.");
            case "third" ->
                System.out.println("El estudiante está registrado por tercera vez.");
            default ->
                System.out.println("Tipo de registro desconocido.");
        }
    }

    public static void generateStudentReport(Scanner scanner, String fileName) {
        FileManager fileManager = new FileManager();
        fileManager.findStudent(scanner, fileName);
    }
    
    public static void generateReport(Scanner scanner, String fileName) {
        FileManager fileManager = new FileManager();
        fileManager.readStudents(scanner, fileName);
    }

    public String calculateGrade() {

        Scanner scanner = new Scanner(System.in);
        String stringFinalGrade;

        System.out.println("Ingrese notas del alumno:");
        float unitOne = 0.0F;
        do {
            System.out.print("Unidad 1: ");
            unitOne = Validation.validationOfFloat(unitOne, scanner);
        } while (unitOne == -1.0F);
        
        float unitTwo = 0.0F;
        do {
            System.out.print("Unidad 2: ");
            unitTwo = Validation.validationOfFloat(unitTwo, scanner);
        } while (unitTwo == -1.0F);
        
        float finalGrade = (unitOne + unitTwo) / 2;

        stringFinalGrade = String.valueOf(finalGrade);

        return stringFinalGrade;

    }
}
