package utils;

import ec.edu.espe.registrationsystem.model.Student;
import java.util.List;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */

public class Updater {

    public static void updateStudent(String fileName, Student updatedStudent) {
        List<Student> students = Reader.readStudents(fileName);
        boolean found = false;
        
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getDni().equals(updatedStudent.getDni())) {
                students.set(i, updatedStudent);
                found = true;
                break;
            }
        }
        
        if (found) {
            FileManager.clearFile(fileName);  // Clear the file first
            for (Student student : students) {
                FileManager.fileSave(student.toString(), fileName);
            }
        } else {
            System.out.println("Estudiante con Cédula " + updatedStudent.getDni() + " No Encontrado.");
        }
    }
}
