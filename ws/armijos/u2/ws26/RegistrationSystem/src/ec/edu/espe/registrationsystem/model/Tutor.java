package ec.edu.espe.registrationsystem.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utils.FileManager;

import utils.Validation;

public class Tutor {

    private String dni;
    private String name;
    private String lastName;
    private Career career;
    private String email;
    private String phone;
    private Course course;

    public Tutor(String dni, String name, String lastName, Career career, String email, String phone, Course course) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.career = career;
        this.email = email;
        this.phone = phone;
        this.course = course;
    }

    @Override
    public String toString() {
        return dni + "," + name + "," + lastName + "," + career + "," + email + "," + phone + "," + course;
    }

    public static void addTutors(String fileName) {

        Scanner scanner = new Scanner(System.in);
        int tutorNumber = 0;
        do {
            System.out.println("\n============================================================");
            System.out.print("Cuantos profesores quiere agregar?: ");
            tutorNumber = Validation.validationOfInt(tutorNumber, scanner);
        } while (tutorNumber <= 0);
        System.out.println("============================================================");

        for (int aux = 0; aux < tutorNumber; aux++) {
            System.out.println("Informacion del Profesor Nuevo");
            String dni;
            boolean validation = false;
            boolean dniValidation = false;

            do {
                System.out.println("------------------------------------------------------------");
                System.out.print("Cedula: ");
                dni = scanner.next();
                dniValidation = Validation.validationOfCharacter(dni);

                if (!dniValidation) {
                    boolean validationNumbersDni = Validation.validationOfCharacter(dni);
                    if (!validationNumbersDni) {
                        if (dni.length() == 10) {
                            if (!Validation.validationDni(dni.length(), dni)) {
                                System.out.println("La cedula ingresada no es valida, intente de nuevo");
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
            } while (validation || dniValidation);

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

            String course = "";
            do {
                System.out.println("------------------------------------------------------------");
                System.out.print("Ingrese el curso: ");
                course = scanner.next();
                validation = Validation.validationOfCharacter(course);
            } while (!validation);

            Career careerName = new Career(careerCode);
            Course courseName = new Course(course);
            Tutor tutor = new Tutor(dni, name, lastName, careerName, email, phone, courseName);
            FileManager.fileSave(tutor.toString(), fileName);
        }
    }

    private static Tutor findTutorByDni(String fileName, String dni) {
        List<Tutor> tutors = readTutors(fileName);

        for (Tutor tutor : tutors) {
            if (tutor.getDni().equals(dni)) {
                return tutor;
            }
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Tutor con cedula: " + dni + " no encontrado");
        System.out.println("------------------------------------------------------------");
        return null;
    }

    public static ArrayList<Tutor> readTutors(String fileName) {
        ArrayList<Tutor> tutors = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName + ".csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {

                String[] values = line.split(",");
                Career careerName = new Career(values[3]);
                Course courseName = new Course(values[6]);
                Tutor tutor = new Tutor(
                        values[0],
                        values[1],
                        values[2],
                        careerName,
                        values[4],
                        values[5],
                        courseName
                );
                tutors.add(tutor);

            }
        } catch (IOException e) {
            System.err.println("Error leyendo el archivo: " + e.getMessage());
        }

        return tutors;

    }

    public static void printTutors(List<Tutor> tutors) {
        int tutorSeparator = 0;
        if (tutors.isEmpty()) {
            System.out.println("No hay tutores registrados.");
        } else {
            System.out.println("\n===================================================================================");
            System.out.println("Lista de Tutores:");
            System.out.println("===================================================================================");
            for (Tutor tutor : tutors) {
                if(tutorSeparator != 0){
                    System.out.println("-------------------------------------------------------------------------------------");
                    System.out.println("Cedula: " + tutor.getDni());
                    System.out.println("Nombre: " + tutor.getName());
                    System.out.println("Apellido: " + tutor.getLastName());
                    System.out.println("Codigo de Carrera: " + tutor.getCareer());
                    System.out.println("Email: " + tutor.getEmail());
                    System.out.println("Celular: " + tutor.getPhone());
                    System.out.println("Curso: " + tutor.getCourse());
                }
                tutorSeparator++;
            }
            System.out.println("-------------------------------------------------------------------------------------");
        }
    }

    public static void updateTutors(Scanner scanner, String fileName, boolean adminOProfesor) {
        System.out.println("\n============================================================");
        String dni;

        do {
            System.out.print("Introduzca la Cedula del Tutor a Editar: ");
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

        Tutor existingTutor = Tutor.findTutorByDni(fileName, dni);

        if (existingTutor != null && adminOProfesor) {
            System.out.println("Edicion la Informacion del Tutor");
            System.out.println("------------------------------------------------------------");

            System.out.println("Nombre: " + existingTutor.getName());
            System.out.println("Apellido: " + existingTutor.getLastName());
            System.out.println("Codigo de Carrera: " + existingTutor.getCareer());
            System.out.println("Email: " + existingTutor.getEmail());
            System.out.println("Celular: " + existingTutor.getPhone());
            System.out.println("Curso: " + existingTutor.getCourse());

            System.out.println("------------------------------------------------------------");
            System.out.print("Nombre [" + existingTutor.getName() + "]: ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) {
                existingTutor.setName(name);
            }

            System.out.print("Apellido [" + existingTutor.getLastName() + "]: ");
            String lastName = scanner.nextLine();
            if (!lastName.isEmpty()) {
                existingTutor.setLastName(lastName);
            }

            System.out.print("Codigo de Carrera [" + existingTutor.getCareer() + "]: ");
            String careerCode = scanner.next();
            Career careerName = new Career(careerCode);
            scanner.nextLine();
            if (!careerCode.isEmpty()) {
                existingTutor.setCareer(careerName);
            }

            System.out.print("Email [" + existingTutor.getEmail() + "]: ");
            String email = scanner.next();
            scanner.nextLine();
            if (!email.isEmpty()) {
                existingTutor.setEmail(email);
            }

            String phone;
            do {
                System.out.print("Celular [" + existingTutor.getPhone() + "]: ");
                phone = scanner.next();
                scanner.nextLine();
                if (phone.length() != 10) {
                    System.out.println("Numero de telefono mal ingresado. Intente de nuevo.");
                }
            } while (phone.length() != 10);

            existingTutor.setPhone(phone);

            System.out.print("Curso [" + existingTutor.getCourse() + "]: ");
            String course = scanner.next();
            Course courseName = new Course(course);
            scanner.nextLine();
            if (!careerCode.isEmpty()) {
                existingTutor.setCourse(courseName);
            }

            updateTutorInFile(fileName, existingTutor);
        } else {
            System.out.println("Tutor no encontrado o no tiene permisos para editar");
        }
    }

    public static void updateTutorInFile(String fileName, Tutor updatedTutor) {
        List<Tutor> tutors = readTutors(fileName);
        boolean found = false;

        for (int i = 0; i < tutors.size(); i++) {
            if (tutors.get(i).getDni().equals(updatedTutor.getDni())) {
                tutors.set(i, updatedTutor);
                found = true;
                break;
            }
        }

        if (found) {
            FileManager.clearFile(fileName);
            for (Tutor tutor : tutors) {
                FileManager.fileSave(tutor.toString(), fileName);
            }
            System.out.println("Tutor actualizado exitosamente");
        } else {
            System.out.println("Tutor con Cédula " + updatedTutor.getDni() + " no encontrado");
        }
    }

    public static void findTutor(Scanner scanner, String fileName) {
        System.out.println("============================================================");
        System.out.print("Introduzca la cedula del Tutor: ");
        String dni = scanner.next();
        System.out.println("============================================================");

        if (!Validation.validationOfCharacter(dni)) {
            if (dni.length() == 10) {
                if (Validation.validationDni(dni.length(), dni)) {
                    Tutor tutor = Tutor.findTutorByDni(fileName, dni);
                    System.out.println("------------------------------------------------------------");
                    if (tutor != null) {
                        System.out.println("Tutor encontrado:");
                        System.out.println("------------------------------------------------------------");
                        System.out.println("Nombre: " + tutor.getName());
                        System.out.println("Apellido: " + tutor.getLastName());
                        System.out.println("Codigo de Carrera: " + tutor.getCareer());
                        System.out.println("Email: " + tutor.getEmail());
                        System.out.println("Celular: " + tutor.getPhone());
                        System.out.println("Curso: " + tutor.getCourse());
                    } else {
                        System.out.println("Tutor con cedula " + dni + " no encontrado");
                    }
                    System.out.println("------------------------------------------------------------");
                } else {
                    System.out.println("Cedula ingresada no valida");
                }
            } else {
                System.out.println("Cedula debe tener 10 dígitos");
            }
        } else {
            System.out.println("Se ha ingresado un caracter no valido");
        }

        scanner.nextLine();
    }

    public static void deleteTutors(Scanner scanner, String fileName) {
        System.out.println("============================================================");
        System.out.print("Introduzca la cedula del Tutor a eliminar: ");
        String dni = scanner.next();
        System.out.println("============================================================");

        List<Tutor> tutors = readTutors(fileName);
        boolean found = false;

        for (int i = 0; i < tutors.size(); i++) {
            if (tutors.get(i).getDni().equals(dni)) {
                tutors.remove(i);
                found = true;
                break;
            }
        }

        if (found) {
            FileManager.clearFile(fileName);
            for (Tutor tutor : tutors) {
                FileManager.fileSave(tutor.toString(), fileName);
            }
            System.out.println("Tutor eliminado exitosamente");
        } else {
            System.out.println("Tutor con cedula " + dni + " no encontrado");
        }
    }

    public static void pause(Scanner scanner) {
        System.out.print("Pulse Enter para continuar...\n");
        scanner.nextLine();
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the career
     */
    public Career getCareer() {
        return career;
    }

    /**
     * @param career the career to set
     */
    public void setCareer(Career career) {
        this.career = career;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the course
     */
    public Course getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(Course course) {
        this.course = course;
    }
}
