package utils;

import ec.edu.espe.registrationsystem.model.Registration;
import ec.edu.espe.registrationsystem.model.Student;
import ec.edu.espe.registrationsystem.model.StudentReport;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import static utils.Validation.validationDni;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */
public class FileManager {

    public static void fileSave(String data, String fileName) {
        fileName = fileName + ".csv";

        try (FileWriter fileWriter = new FileWriter(fileName, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.err.println("Error escribiendo al archivo: " + e.getMessage());
        }
    }

    public static void clearFile(String fileName) {
        fileName = fileName + ".csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("");
        } catch (IOException e) {
            System.err.println("Error clearing the file: " + e.getMessage());
        }
    }

    public void addStudents(Scanner scanner, String fileName) {
        int studentNumber = 0;
        do {
            System.out.println("\n============================================================");
            System.out.print("Cuantos estudiantes quiere agregar?: ");
            studentNumber = Validation.validationOfInt(studentNumber, scanner);

        } while (studentNumber <= 0);
        System.out.println("============================================================");

        for (int aux = 0; aux < studentNumber; aux++) {
            System.out.println("Informacion del Estudiante Nuevo");
            String dni;
            Student student2 = null;
            boolean validation = false;
            boolean dniValidation = false;

            do {
                System.out.println("------------------------------------------------------------");

                System.out.print("Cedula: ");
                dni = scanner.next();
                dniValidation = Validation.validationOfCharacter(dni);

                if (!dniValidation) {
                    student2 = Searcher.findStudentByDNI(fileName, dni);

                    boolean validationNumbersDni = Validation.validationOfCharacter(dni);
                    if (!validationNumbersDni) {
                        if (dni.length() == 10) {
                            if (!validationDni(dni.length(), dni) || student2 != null) {
                                System.out.println("La cedula ingresada no es valida o ya existe, intente de nuevo");
                            } else {
                                validation = false;
                            }
                        } else {
                            validation = true;
                            System.out.println("Cedula ingresada no valida");
                        }
                        System.out.println("============================================================");
                    }
                } else {
                    System.out.println("Se ha ingresado un caracter no válido");
                }
            } while (validation || student2 != null || dniValidation);
            scanner.nextLine();

            String name = "";
            do {
                System.out.println("------------------------------------------------------------");
                System.out.print("Nombres: ");
                name = scanner.nextLine();
                validation = Validation.validationOfCharacter(name);
            } while (!validation);

            String lastName = "";
            do {
                System.out.println("------------------------------------------------------------");
                System.out.print("Apellidos: ");
                lastName = scanner.nextLine();
                validation = Validation.validationOfCharacter(lastName);
            } while (!validation);

            String careerCode = "";
            do {
                System.out.println("------------------------------------------------------------");
                System.out.print("Codigo de Carrera: ");
                careerCode = scanner.next();
                validation = Validation.validationOfCharacter(careerCode);
            } while (validation);

            String email = "";
            do {
                System.out.println("------------------------------------------------------------");
                System.out.print("Email: ");
                email = scanner.next();
                validation = Validation.validationEmail(email);
            } while (!validation);

            String phone = "";
            do {
                System.out.println("------------------------------------------------------------");
                System.out.print("Celular: ");
                phone = scanner.next();
                scanner.nextLine();

                validation = Validation.validationOfCharacter(phone);
                if (phone.length() != 10) {
                    System.out.println("Numero de telefono mal ingresado. Intente de nuevo.");
                }

            } while (phone.length() != 10 || validation);

            String typeOfRegistration;
            String gratuity = "";
            do {
                System.out.println("------------------------------------------------------------");
                System.out.print("Tipo de Matricula: ");
                typeOfRegistration = scanner.next();

                typeOfRegistration = typeOfRegistration.toUpperCase();

                if (typeOfRegistration.equals("PRIMERA")) {
                    gratuity = "Con Gratuidad";
                    validation = true;
                } else {
                    if (typeOfRegistration.equals("SEGUNDA") || typeOfRegistration.equals("TERCERA")) {
                        gratuity = "Sin Gratuidad";
                        validation = true;
                    } else {
                        System.out.println("Se ha ingresado una opcion no valida intentelo de nuevo.");
                        validation = false;
                    }
                }

            } while (!validation);

            Registration registrationType = new Registration(typeOfRegistration);

            System.out.println("------------------------------------------------------------");
            System.out.print("Calificacion: ");
            StudentReport studentReport = new StudentReport();
            String grade = studentReport.calculateGrade();
            scanner.nextLine();
            System.out.println("------------------------------------------------------------");

            float gradeI = Float.parseFloat(grade);
            String lastChance = "";
            if (gradeI < 14) {
                System.out.print("Supletorio: ");
                lastChance = scanner.next();
                scanner.nextLine();
                System.out.println("------------------------------------------------------------");
            } else {
                lastChance = "No requiere supletorio";
            }

            Student student = new Student(dni, name, lastName, careerCode, email, phone, registrationType, grade, lastChance, gratuity);
            FileManager.fileSave(student.toString(), fileName);
        }
        pause(scanner);
    }

    public void readStudents(Scanner scanner, String fileName) {
        List<Student> students = Reader.readStudents(fileName);
        System.out.println("\n===================================================================================");
        System.out.println("Lista de Estudiantes:");
        System.out.println("===================================================================================");
        int i = 1;
        for (Student student : students) {
            if (i != 1) {
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println(student);
            }
            i++;
        }
        System.out.println("-------------------------------------------------------------------------------------");
        pause(scanner);
    }

    @SuppressWarnings("empty-statement")
    public void updateStudent(Scanner scanner, String fileName, boolean adminOProfesor) {
        System.out.println("\n============================================================");
        String dni;
        boolean validation = false;

        do {
            System.out.print("Introduzca la Cedula del Estudiante a Editar: ");
            dni = scanner.next();
            scanner.nextLine();

            boolean validationNumbersDni = Validation.validationOfCharacter(dni);
            if (!validationNumbersDni) {
                if (dni.length() == 10) {
                    if (!Validation.validationDni(dni.length(), dni)) {
                        System.out.println("La cedula ingresada no es valida, intente de nuevo");
                    }
                } else {
                    System.out.println("Cedula ingresada no valida");
                }
                System.out.println("============================================================");
            }
        } while (!Validation.validationDni(dni.length(), dni));

        Student existingStudent = Searcher.findStudentByDNI(fileName, dni);

        if (existingStudent != null && adminOProfesor) {
            System.out.println("Edicion la Informacion del Estudiante:");
            System.out.println("============================================================");
            System.out.println("Nombre: " + existingStudent.getName());
            System.out.println("Apellido: " + existingStudent.getLastName());
            System.out.println("Codigo de Carrera: " + existingStudent.getCareerCode());
            System.out.println("Email: " + existingStudent.getEmail());
            System.out.println("Celular: " + existingStudent.getPhone());
            System.out.println("------------------------------------------------------------");

            String name = "";
            do {
                System.out.print("Nombre [" + existingStudent.getName() + "]: ");
                name = scanner.nextLine();
                validation = Validation.validationOfCharacter(name);
            } while (!validation);
            if (!name.isEmpty()) {
                existingStudent.setName(name);
            }

            String lastName = "";
            do {
                System.out.println("------------------------------------------------------------");
                System.out.print("Apellido [" + existingStudent.getLastName() + "]: ");
                lastName = scanner.nextLine();
                validation = Validation.validationOfCharacter(lastName);
            } while (!validation);
            if (!lastName.isEmpty()) {
                existingStudent.setLastName(lastName);
            }

            String careerCode = "";
            do {
                System.out.println("------------------------------------------------------------");
                System.out.print("Codigo de Carrera [" + existingStudent.getCareerCode() + "]: ");
                careerCode = scanner.next();
                scanner.nextLine();
                validation = Validation.validationOfCharacter(careerCode);
            } while (validation);
            if (!careerCode.isEmpty()) {
                existingStudent.setCareerCode(careerCode);
            }

            String email = "";
            do {
                System.out.println("------------------------------------------------------------");
                System.out.print("Email [" + existingStudent.getEmail() + "]: ");
                email = scanner.next();
                validation = Validation.validationEmail(email);
            } while (!validation);
            if (!email.isEmpty()) {
                existingStudent.setEmail(email);
            }
            System.out.println("------------------------------------------------------------");

            String phone = "";
            do {
                System.out.print("Celular [" + existingStudent.getPhone() + "]: ");
                phone = scanner.next();
                validation = Validation.validationOfCharacter(phone);
                scanner.nextLine();
                if (phone.length() != 10) {
                    System.out.println("Numero de telefono mal ingresado. Intente de nuevo.");
                }
                System.out.println("------------------------------------------------------------");
            } while (phone.length() != 10|| validation);

            existingStudent.setPhone(phone);

            String typeOfRegistration;
            String gratuity = "";
            do {
                System.out.println("------------------------------------------------------------");
                System.out.print("Tipo de Matricula [" + existingStudent.getTypeOfRegistration() + "]: ");
                typeOfRegistration = scanner.next();

                typeOfRegistration = typeOfRegistration.toUpperCase();

                if (typeOfRegistration.equals("PRIMERA")) {
                    gratuity = "Con Gratuidad";
                    validation = true;
                } else {
                    if (typeOfRegistration.equals("SEGUNDA") || typeOfRegistration.equals("TERCERA")) {
                        gratuity = "Sin Gratuidad";
                        validation = true;
                    } else {
                        System.out.println("Se ha ingresado una opcion no valida intentelo de nuevo.");
                        validation = false;
                    }
                }

            } while (!validation);

            System.out.print("Calificacion [" + existingStudent.getGrade() + "]: ");
            StudentReport studentReport = new StudentReport();
            String grade = studentReport.calculateGrade();
            scanner.nextLine();
            System.out.println("------------------------------------------------------------");

            float gradeF = Float.parseFloat(grade);
            String lastChance = "";
            if (gradeF < 14) {
                System.out.print("Supletorio [" + existingStudent.getLastChance() + "]: ");
                lastChance = scanner.next();
                scanner.nextLine();
                System.out.println("------------------------------------------------------------");
            } else {
                lastChance = "No requiere supletorio";
            }

            Registration registrationType = new Registration(typeOfRegistration);
            Student updatedStudent = new Student(dni, name, lastName, careerCode, email, phone, registrationType, grade, lastChance, gratuity);
            Updater.updateStudent(fileName, updatedStudent);
        } else {
            if (existingStudent != null && !adminOProfesor) {
                System.out.println("Estudiante [" + existingStudent.getName() + " " + existingStudent.getLastName() + "]\nDni:" + existingStudent.getDni() + "]:");
                System.out.println("------------------------------------------------------------");
                System.out.print("Calificacion [" + existingStudent.getGrade() + "]: ");
                StudentReport studentReport = new StudentReport();
                String grade = studentReport.calculateGrade();
                scanner.nextLine();
                System.out.println("------------------------------------------------------------");
                existingStudent.setGrade(grade);

                float gradeF = Float.parseFloat(grade);
                String lastChance = "";

                if (gradeF < 14) {
                    System.out.print("Supletorio [" + existingStudent.getLastChance() + "]: ");
                    lastChance = scanner.next();
                    scanner.nextLine();
                    System.out.println("------------------------------------------------------------");
                } else {
                    lastChance = "No requiere supletorio";
                }
                existingStudent.setLastChance(lastChance);
                Updater.updateStudent(fileName, existingStudent);
            }
        }
        pause(scanner);
    }

    public static void pause(Scanner scanner) {
        System.out.print("Pulse Enter para continuar...");
        scanner.nextLine();
        System.out.println();
    }

    public void deleteStudent(Scanner scanner, String fileName) {
        System.out.println("============================================================");
        System.out.print("Introduzca la Cedula del Estudiante a Eliminar: ");
        String dni = scanner.next();
        System.out.println("============================================================");

        boolean validationNumbersDni = Validation.validationOfCharacter(dni);
        if (!validationNumbersDni) {
            if (dni.length() == 10) {
                if (validationDni(dni.length(), dni)) {
                    Student student = Searcher.findStudentByDNI(fileName, dni);
                    scanner.nextLine();
                    Eraser.deleteStudent(fileName, dni);
                } else {
                    System.out.println("Cedula ingreada no válida.");
                }
            } else {
                System.out.println("Cedula ingreada no válida.");
            }
        }
        pause(scanner);
    }

    public void findStudent(Scanner scanner, String fileName) {
        System.out.println("============================================================");
        System.out.print("Introduzca la cedula del Estudiante: ");
        String dni = scanner.next();
        System.out.println("============================================================");

        boolean validationNumbersDni = Validation.validationOfCharacter(dni);
        if (!validationNumbersDni) {
            if (dni.length() == 10) {
                if (validationDni(dni.length(), dni)) {
                    scanner.nextLine();
                    System.out.println("Curso: " + fileName);
                    Student student = Searcher.findStudentByDNI(fileName, dni);
                    System.out.println("------------------------------------------------------------");
                    if (student != null) {
                        System.out.println("Estudiante encontrado: \n" + student);
                        System.out.println("------------------------------------------------------------");
                    }
                    pause(scanner);
                } else {
                    scanner.nextLine();
                    System.out.println("Cedula ingreada no valida.\n");
                    pause(scanner);
                }
            } else {
                System.out.println("Cedula ingresada no valida");
            }
        } else {
            System.out.println("Se ha ingresado un caracter no valido.");
        }
        pause(scanner);
    }
}
