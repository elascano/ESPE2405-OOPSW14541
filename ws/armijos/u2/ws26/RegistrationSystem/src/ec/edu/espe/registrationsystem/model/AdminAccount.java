package ec.edu.espe.registrationsystem.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import utils.FileManager;
import utils.Validation;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class AdminAccount {

    private final String adminUser = "LogicLegion";
    private final String adminPassword = "14541";
    FileManager fileManager = new FileManager();

    @Override
    public String toString() {
        return "AdminAccount{" + "adminUser=" + adminUser + ", adminPassword=" + adminPassword + '}';
    }

    public String getAdminUser() {
        return adminUser;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public static void createTutorAccounts() {
        Scanner scanner = new Scanner(System.in);
        int numAccounts = 0;
        do {
            System.out.print("Ingrese el número de cuentas de tutores que desea añadir: ");
            numAccounts = Validation.validationOfInt(numAccounts, scanner);
        } while (numAccounts <= 0);

        for (int i = 0; i < numAccounts; i++) {
            System.out.print("Ingrese el nombre de usuario del tutor " + (i + 1) + ": ");
            String tutorUser = scanner.nextLine();

            System.out.print("Ingrese la contraseña del tutor " + (i + 1) + ": ");
            String tutorPassword = scanner.nextLine();

            saveTutorAccount(tutorUser, tutorPassword);
        }

        System.out.println("Cuentas de tutores añadidas exitosamente.");
    }

    public static void saveTutorAccount(String tutorUser, String tutorPassword) {
        TutorAccount tutor = new TutorAccount(tutorUser, tutorPassword);
        String data = tutor.getTutorUser() + "," + tutor.getTutorPasword();
        FileManager.fileSave(data, "tutorsAccount");
    }

    public boolean validateTutorLogin(String tutorUser, String tutorPassword) {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader("tutorsAccount.csv"))) {
            while ((line = reader.readLine()) != null) {
                String[] credentials = line.split(",");
                if (credentials[0].equals(tutorUser) && credentials[1].equals(tutorPassword)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void addStudents(Scanner scanner, String fileName) {
        fileManager.addStudents(scanner, fileName);
    }

    public void viewReport(Scanner scanner, String fileName) {
        StudentReport.generateReport(scanner, fileName);
    }

    public void updateStudent(Scanner scanner, String fileName) {
        fileManager.updateStudent(scanner, fileName, true);
    }

    public void deleteStudent(Scanner scanner, String fileName) {
        fileManager.deleteStudent(scanner, fileName);
    }

    public void findStudent(Scanner scanner, String fileName) {
        fileManager.findStudent(scanner, fileName);
    }

}
