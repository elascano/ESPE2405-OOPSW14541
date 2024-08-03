package ec.edu.espe.registrationsystem.model;

import java.io.*;
import java.util.*;
import utils.FileManager;
import utils.Validation;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */
public class TutorAccount implements Serializable {

    private String tutorUser;
    private String tutorPasword;

    public TutorAccount(String tutorUser, String tutorPasword) {
        this.tutorUser = tutorUser;
        this.tutorPasword = tutorPasword;
    }

    public String getTutorUser() {
        return tutorUser;
    }

    public void setTutorUser(String tutorUser) {
        this.tutorUser = tutorUser;
    }

    public String getTutorPasword() {
        return tutorPasword;
    }

    public void setTutorPasword(String tutorPasword) {
        this.tutorPasword = tutorPasword;
    }

    public static void viewReport(Scanner scanner, String fileName) {
        StudentReport.generateReport(scanner, fileName);
    }

    public void addTutorsA(String fileName) {
        Scanner scanner = new Scanner(System.in);
        int tutorNumber = 0;
        do {
            System.out.println("\n============================================================");
            System.out.print("Cuantas cuentas de profesores quiere agregar?: ");
            tutorNumber = Validation.validationOfInt(tutorNumber, scanner);
        } while (tutorNumber <= 0);
        System.out.println("============================================================");

        for (int aux = 0; aux < tutorNumber; aux++) {
            System.out.print("Nombre de usuario: ");
            String tutorUser = scanner.next();

            System.out.print("Contraseña: ");
            String tutorPasword = scanner.next();

            TutorAccount tutorAccount = new TutorAccount(tutorUser, tutorPasword);

        }
        
    }

    private static TutorAccount findTutorByUser(String fileName, String tutorUser) {
        List<TutorAccount> tutors = readTutorsA(fileName);

        for (TutorAccount tutor : tutors) {
            if (tutor.getTutorUser().equals(tutorUser)) {
                return tutor;
            }
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Tutor con usuario: " + tutorUser + " no encontrado");
        System.out.println("------------------------------------------------------------");
        return null;
    }

    public static List<TutorAccount> readTutorsA(String fileName) {
        List<TutorAccount> tutors = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName + ".csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {

                String[] values = line.split(",");
                TutorAccount tutor = new TutorAccount(
                        values[0],
                        values[1]
                );
                tutors.add(tutor);

            }
        } catch (IOException e) {
            System.err.println("Error leyendo el archivo: " + e.getMessage());
        }

        return tutors;
    }

    public static void printTutors(List<TutorAccount> tutors) {
        if (tutors.isEmpty()) {
            System.out.println("No hay cuentas de tutores registrados.");
        } else {
            System.out.println("\n===================================================================================");
            System.out.println("Lista de Cuenta de Tutores:");
            System.out.println("===================================================================================");
            for (TutorAccount tutor : tutors) {
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("Usuario: " + tutor.getTutorUser());
                System.out.println("Contraseña: " + tutor.getTutorPasword());
            }
            System.out.println("-------------------------------------------------------------------------------------");
        }
    }

    public void updateTutorsA(Scanner scanner, String fileName, boolean adminOProfesor) {
        System.out.println("\n============================================================");
        String tutorUser;

        do {
            System.out.print("Introduzca el Usuario del Tutor a Editar: ");
            tutorUser = scanner.next();
            scanner.nextLine();
        } while (tutorUser.isEmpty());

        TutorAccount existingTutor = TutorAccount.findTutorByUser(fileName, tutorUser);

        if (existingTutor != null && adminOProfesor) {
            System.out.println("Edicion la Informacion de la Cuenta Tutor");
            System.out.println("------------------------------------------------------------");

            System.out.println("Usuario: " + existingTutor.getTutorUser());
            System.out.println("Contraseña: " + existingTutor.getTutorPasword());

            System.out.println("------------------------------------------------------------");
            System.out.print("Usuario [" + existingTutor.getTutorUser() + "]: ");
            String newUser = scanner.nextLine();
            if (!newUser.isEmpty()) {
                existingTutor.setTutorUser(newUser);
            }

            System.out.print("Contraseña [" + existingTutor.getTutorPasword() + "]: ");
            String newPassword = scanner.nextLine();
            if (!newPassword.isEmpty()) {
                existingTutor.setTutorPasword(newPassword);
            }

            updateTutorInFileA(fileName, existingTutor);
        } else {
            System.out.println("Tutor no encontrado o no tiene permisos para editar");
        }
    }

    private void updateTutorInFileA(String fileName, TutorAccount updatedTutor) {
        List<TutorAccount> tutors = readTutorsA(fileName);
        boolean found = false;

        for (int i = 0; i < tutors.size(); i++) {
            if (tutors.get(i).getTutorUser().equals(updatedTutor.getTutorUser())) {
                tutors.set(i, updatedTutor);
                found = true;
                break;
            }
        }

        if (found) {
            FileManager.clearFile(fileName);
            for (TutorAccount tutor : tutors) {
                FileManager.fileSave(tutor.toString(), fileName);
            }
            System.out.println("Tutor actualizado exitosamente");
        } else {
            System.out.println("Tutor con usuario " + updatedTutor.getTutorUser() + " no encontrado");
        }
    }

    public void findTutorA(Scanner scanner, String fileName) {
        System.out.println("============================================================");
        System.out.print("Introduzca el usuario del Tutor: ");
        String tutorUser = scanner.next();
        System.out.println("============================================================");

        TutorAccount tutor = TutorAccount.findTutorByUser(fileName, tutorUser);
        System.out.println("------------------------------------------------------------");
        if (tutor != null) {
            System.out.println("Tutor encontrado:");
            System.out.println("------------------------------------------------------------");
            System.out.println("Usuario: " + tutor.getTutorUser());
            System.out.println("Contraseña: " + tutor.getTutorPasword());
        } else {
            System.out.println("Tutor con usuario " + tutorUser + " no encontrado");
        }
        System.out.println("------------------------------------------------------------");

        scanner.nextLine();
    }

    public void deleteTutorsA(Scanner scanner, String fileName) {
        System.out.println("============================================================");
        System.out.print("Introduzca el usuario del Tutor a eliminar: ");
        String tutorUser = scanner.next();
        System.out.println("============================================================");

        List<TutorAccount> tutors = readTutorsA(fileName);
        boolean found = false;

        for (int i = 0; i < tutors.size(); i++) {
            if (tutors.get(i).getTutorUser().equals(tutorUser)) {
                tutors.remove(i);
                found = true;
                break;
            }
        }

        if (found) {
            FileManager.clearFile(fileName);
            for (TutorAccount tutor : tutors) {
                FileManager.fileSave(tutor.toString(), fileName);
            }
            System.out.println("Tutor eliminado exitosamente");
        } else {
            System.out.println("Tutor con usuario " + tutorUser + " no encontrado");
        }
    }

    public static void pause(Scanner scanner) {
        System.out.print("Pulse Enter para continuar...\n");
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return tutorUser + "," + tutorPasword;
    }
}
