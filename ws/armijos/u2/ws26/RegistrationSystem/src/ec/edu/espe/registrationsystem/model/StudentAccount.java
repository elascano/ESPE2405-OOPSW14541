package ec.edu.espe.registrationsystem.model;
import ec.edu.espe.registrationsystem.view.ManagerMenu;
import java.util.Scanner;

/**
 *
 * @author Logic Legion, DCCO-ESPE
 */

public class StudentAccount {
    //Methods
    public static void viewReport(Scanner scanner, String fileName){
        StudentReport.generateStudentReport(scanner, fileName);        
    }
    
}
