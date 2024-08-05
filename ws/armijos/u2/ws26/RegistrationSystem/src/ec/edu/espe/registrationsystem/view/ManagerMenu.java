package ec.edu.espe.registrationsystem.view;

import ec.edu.espe.registrationsystem.model.AdminAccount;
import ec.edu.espe.registrationsystem.model.StudentAccount;
import ec.edu.espe.registrationsystem.model.Tutor;
import ec.edu.espe.registrationsystem.model.TutorAccount;
import java.util.List;
import utils.FileManager;
import java.util.Scanner;
import utils.Validation;

/**
 *
 * @autor Logic Legion, DCCO-ESPE
 */
public class ManagerMenu {

    public static boolean loginAccounts(String password, String account, Scanner scanner) {
        int i = 0;
        String passComprobation = "", userComprobation = "";
        boolean comprobation = true;

        while (i < 3 && comprobation) {
            i++;
            System.out.println("==============================================");
            System.out.println("            INGRESO DE USUARIO");
            System.out.println("==============================================");
            System.out.print("Usuario: ");
            userComprobation = scanner.nextLine();
            System.out.print("Clave: ");
            passComprobation = scanner.nextLine();

            if (account.equals("LogicLegion")) {
                if (userComprobation.equals(account) && passComprobation.equals(password)) {
                    System.out.println("Ingreso exitoso!\n");
                    FileManager.pause(scanner);
                    comprobation = false;
                } else {
                    System.out.println("Usuario o clave mal ingresada. Intente de nuevo\n");
                    FileManager.pause(scanner);
                }
            } else {
                AdminAccount admin = new AdminAccount();
                comprobation = !admin.validateTutorLogin(userComprobation, passComprobation);
                if (!comprobation) {
                    System.out.println("Ingreso Exitoso");
                } else {
                    System.out.println("Usuario o clave mal ingresada. Intente de nuevo\n");
                }
            }
        }
        return comprobation;
    }

    public static String selectCourse(String fileName) {
        Scanner scanner = new Scanner(System.in);
        boolean validate = false;
        int option = 0;

        do {
            System.out.println("\n============================================================");
            System.out.println("Escoja Un Curso: ");
            System.out.println("============================================================");
            System.out.println("1. Algebra");
            System.out.println("2. Quimica");
            System.out.println("3. Administracion Financiera");
            System.out.println("4. Contabilidad");
            System.out.println("5. Marketing");
            System.out.println("============================================================\n");
            option = Validation.validationOfInt(option, scanner);
            if (option < 1 || option > 5) {
                System.out.println("Se ha ingresado una opcion incorrecta.");
            }

        } while (option < 1 || option > 5);

        switch (option) {
            case 1:
                return "Algebra";
            case 2:
                return "Quimica";
            case 3:
                return "AdministracionFinanciera";
            case 4:
                return "Contabilidad";
            case 5:
                return "Marketing";
            default:
                throw new AssertionError("Opcion Invalida.");
        }

    }

    public static void callMainMenu() {

        AdminAccount adminUser = new AdminAccount();
        String fileName = "";
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("============================================================");
            System.out.println("        INSTITUTO TECNOLOGICO SUPERIOR BOLIVAR V0.12");
            System.out.println("============================================================");
            System.out.println("            SISTEMA DE MATRICULAS DE ESTUDIANTES");
            System.out.println("------------------------------------------------------------");

            System.out.println("Seleccione un usuario:");
            System.out.println("------------------------------------------------------------");
            System.out.println("1. Estudiantes");
            System.out.println("2. Profesores");
            System.out.println("3. Personal Administrativo");
            System.out.println("4. Salir");
            System.out.println("------------------------------------------------------------");

            System.out.print(">>");
            int userType = 0;
            userType = Validation.validationOfInt(userType, scanner);

            if (userType != 0) {
                switch (userType) {
                    case 1 -> {

                        fileName = selectCourse(fileName);
                        System.out.println("============================================================\n");
                        manageStudents(scanner, fileName);

                    }
                    case 2 -> {

                        exit = loginAccounts("", "", scanner);
                        if (exit) {
                            exit = false;
                            break;
                        }

                        fileName = selectCourse(fileName);
                        System.out.println("============================================================\n");
                        manageProfessors(scanner, fileName);
                    }
                    case 3 -> {

                        int option = 0;
                        do {
                            System.out.println("\n============================================================");
                            System.out.println("Seleccione una opcion:");
                            System.out.println("============================================================");
                            System.out.println("1. Administrar Estudiantes");
                            System.out.println("2. Administrar cuenta de  Tutores");
                            System.out.println("3. Administrar Tutores");
                            System.out.println("============================================================");
                            option = Validation.validationOfInt(option, scanner);
                        } while (option < 1 || option > 3);

                        if (option == 1) {
                            fileName = selectCourse(fileName);
                            System.out.println("============================================================\n");
                            manageAdminStaff(scanner, fileName);
                        } else if (option == 2) {
                            System.out.println("Abriendo archivo de cuentas de tutores...");
                            String tutorsFileName = "tutorsAccount";
                            manageAccountTutors(scanner, fileName);
                        } else if (option == 3) {
                            System.out.println("Abriendo archivo de tutores...");
                            String tutorsFile = "tutors";
                            manageTutors(scanner, tutorsFile);
                        } else {
                            System.out.println("Opción no válida.");
                        }
                    }
                    case 4 ->
                        exit = true;
                    default -> {
                        System.out.println("Seleccion invalida. Por favor, intentelo de nuevo.");
                        FileManager.pause(scanner);
                    }
                }
            }
        }
    }

    private static void manageProfessors(Scanner scanner, String fileName) {
        FileManager fileManager = new FileManager();
        boolean exit = false;

        while (!exit) {
            System.out.println("============================================================");
            System.out.println("Sistema para Profesores:");
            System.out.println("============================================================");
            System.out.println("1. Encontrar Estudiantes");
            System.out.println("2. Modificar Nota Estudiantes");
            System.out.println("3. Ver Reporte de estudiantes");
            System.out.println("4. Cambiar de Curso");
            System.out.println("5. Volver al menu principal");
            System.out.println("------------------------------------------------------------");
            System.out.print(">>");
            int operation = 0;

            operation = Validation.validationOfInt(operation, scanner);

            if (operation != 0) {
                switch (operation) {
                    case 1:
                        fileManager.findStudent(scanner, fileName);
                        break;
                    case 2:
                        fileManager.updateStudent(scanner, fileName, false);
                        break;
                    case 3:
                        TutorAccount.viewReport(scanner, fileName);
                        break;
                    case 4:

                        fileName = selectCourse(fileName);
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Seleccion invalida. Por favor, intentelo de nuevo.");
                        FileManager.pause(scanner);
                }
            }
        }
    }

    private static void manageAdminStaff(Scanner scanner, String fileName) {
        AdminAccount adminUser = new AdminAccount();

        boolean exit = false;
        FileManager fileManager = new FileManager();
        exit = loginAccounts(adminUser.getAdminPassword(), adminUser.getAdminUser(), scanner);
        if (exit) {
            exit = false;
        }

        while (!exit) {
            System.out.println("\n============================================================");
            System.out.println("Sistema para Administrar Estudiantes");
            System.out.println("============================================================");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Visualizar Estudiantes");
            System.out.println("3. Modificar Estudiantes");
            System.out.println("4. Eliminar Estudiante");
            System.out.println("5. Encontrar Estudiantes por Cedula");
            System.out.println("6. Cambiar de Curso");
            System.out.println("7. Salir");
            System.out.println("------------------------------------------------------------");
            System.out.print(">>");

            int operation = 0;

            operation = Validation.validationOfInt(operation, scanner);

            if (operation != 0) {
                switch (operation) {
                    case 1:
                        adminUser.addStudents(scanner, fileName);
                        break;
                    case 2:
                        adminUser.viewReport(scanner, fileName);
                        break;
                    case 3:
                        adminUser.updateStudent(scanner, fileName);
                        break;
                    case 4:
                        adminUser.deleteStudent(scanner, fileName);
                        break;
                    case 5:
                        adminUser.findStudent(scanner, fileName);
                        break;
                    case 6:
                        fileName = selectCourse(fileName);
                        break;
                    case 7:
                        exit = true;
                        break;
                    default:
                        System.out.println("Seleccion invalida. Por favor, intentelo de nuevo.");
                        FileManager.pause(scanner);
                        break;
                }
            }
        }
    }

    private static void manageAccountTutors(Scanner scanner, String fileName) {
        AdminAccount adminUser = new AdminAccount();
        fileName = "tutorsAccount";
        TutorAccount tutorAUser = new TutorAccount(fileName, fileName);

        boolean exit = loginAccounts(adminUser.getAdminPassword(), adminUser.getAdminUser(), scanner);
        if (exit) {
            exit = false;
        }
        while (!exit) {
            System.out.println("\n============================================================");
            System.out.println("Sistema para Administrar Cuenta de Tutores");
            System.out.println("============================================================");
            System.out.println("1. Agregar Cuenta de Tutores");
            System.out.println("2. Visualizar Cuenta de Tutores");
            System.out.println("3. Modificar Cuenta de Tutor");
            System.out.println("4. Eliminar Cuenta de Tutor");
            System.out.println("5. Encontrar Cuenta de Tutor por Usuario");
            System.out.println("6. Salir");
            System.out.println("------------------------------------------------------------");
            System.out.print("Seleccione una opción: ");

            int operation = Validation.validationOfInt(0, scanner);

            switch (operation) {
                case 1:
                    AdminAccount.createTutorAccounts();
                    FileManager.pause(scanner);
                case 2:
                    List<TutorAccount> tutorsA = TutorAccount.readTutorsA(fileName);
                    TutorAccount.printTutors(tutorsA);
                    FileManager.pause(scanner);
                    break;
                case 3:
                    tutorAUser.updateTutorsA(scanner, fileName, true);
                    break;
                case 4:
                    tutorAUser.deleteTutorsA(scanner, fileName);
                    FileManager.pause(scanner);
                    break;
                case 5:
                    tutorAUser.findTutorA(scanner, fileName);
                    FileManager.pause(scanner);
                    break;

                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Selección inválida. Por favor, inténtelo de nuevo.");
                    FileManager.pause(scanner);
                    break;
            }
        }

    }

    private static void manageTutors(Scanner scanner, String fileName) {
        AdminAccount adminUser = new AdminAccount();
        boolean exit = loginAccounts(adminUser.getAdminPassword(), adminUser.getAdminUser(), scanner);
        if (exit) {
            exit = false;
        }
        while (!exit) {
            System.out.println("\n============================================================");
            System.out.println("Sistema para Administrar Tutores");
            System.out.println("============================================================");
            System.out.println("1. Agregar Tutores");
            System.out.println("2. Visualizar Tutores");
            System.out.println("3. Modificar Tutor");
            System.out.println("4. Eliminar Tutor");
            System.out.println("5. Encontrar Tutor por Cedula");
            System.out.println("6. Cambiar Archivo de Tutores");
            System.out.println("7. Salir");
            System.out.println("------------------------------------------------------------");
            System.out.print("Seleccione una opcion: ");

            int operation = Validation.validationOfInt(0, scanner);

            switch (operation) {
                case 1:
                    Tutor.addTutors(fileName);
                    break;
                case 2:
                    List<Tutor> tutors = Tutor.readTutors(fileName);
                    Tutor.printTutors(tutors);
                    FileManager.pause(scanner);
                    break;
                case 3:
                    Tutor.updateTutors(scanner, fileName, true);
                    break;
                case 4:
                    Tutor.deleteTutors(scanner, fileName);
                    break;
                case 5:
                    Tutor.findTutor(scanner, fileName);
                    break;
                case 6:
                    System.out.print("Introduzca el nuevo archivo de tutores: ");
                    fileName = scanner.nextLine();
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Seleccion invalida. Por favor, intentelo de nuevo.");
                    FileManager.pause(scanner);
                    break;
            }
        }

    }

    public static void manageStudents(Scanner scanner, String fileName) {
        FileManager fileManager = new FileManager();
        boolean exit = false;

        while (!exit) {
            System.out.println("============================================================");
            System.out.println("Sistema para Estudiantes:");
            System.out.println("============================================================");
            System.out.println("1. Ver reporte de estudiante");
            System.out.println("2. Cambiar de Curso");
            System.out.println("3. Volver");
            System.out.println("------------------------------------------------------------");
            System.out.print(">>");

            int operation = 0;

            operation = Validation.validationOfInt(operation, scanner);

            if (operation != 0) {
                switch (operation) {
                    case 1 -> {
                        StudentAccount.viewReport(scanner, fileName);
                    }
                    case 2 ->{
                        fileName = selectCourse(fileName);
                    }
                    case 3 ->
                        exit = true;
                    default -> {
                        System.out.println("Seleccion invalida. Por favor, intentelo de nuevo.");
                        FileManager.pause(scanner);
                    }
                }
            }
        }
    }
}
