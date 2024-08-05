package utils;

import ec.edu.espe.registrationsystem.model.Student;
import java.util.List;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */

public class Eraser {

    public static void deleteStudent(String fileName, String dni) {
        List<Student> students = Reader.readStudents(fileName);
        students.removeIf(student -> student.getDni().equals(dni));
        
        FileManager.clearFile(fileName);  // Clear the file first
        for (Student student : students) {
            FileManager.fileSave(student.toString(), fileName);
        }
    }
}
