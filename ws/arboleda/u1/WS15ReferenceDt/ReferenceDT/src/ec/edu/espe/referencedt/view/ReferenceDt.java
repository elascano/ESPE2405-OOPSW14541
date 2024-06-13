package ec.edu.espe.referencedt.view;
import ec.edu.espe.referencedt.model.Professor;
/**
 *
 * @author Abner Arboleda, Code Creators, DCCO-ESPE
 */

public class ReferenceDt {

    public static void main(String[] args) {
        float salary;
        Professor professor = new Professor(1, "Christian", 3000, 22);
        salary = 2500;
        
        
        float salaries[]= new float[3];
        salaries[0]=1;
        salaries[1]=2;
        salaries[2]=3;
        
        System.out.println("salary from main before calling --> " + salary);
        changeSalary(salary);
        System.out.println("salary from main after calling --> " + salary);
        
        System.out.println("salary from main before calling " );
        for(float s : salaries){
            System.out.println("salary "+s);
        }
        changeSalaries(salaries);
        System.out.println("salary from main after calling ");
        for(float s : salaries){
            System.out.println("salary "+s);
        }
        System.out.println("professor in the main -->"+ professor);
        changeProfessorSalary(professor);
        System.out.println("professor in the main after calling -->"+ professor);
    }

    public static void changeSalary(float salary) {
        System.out.println("salary inside method before change --> " + salary);
        salary = 2000;
        System.out.println("salary inside method after change --> " + salary);
    }
    public static void changeSalaries(float salaries[]){
         System.out.println("salary inside method before change ");
         for(float s : salaries){
            System.out.println("salary "+s);
        }
        salaries[0]=100;
        salaries[1]=200;
        salaries[2]=300;
        
         System.out.println("salary inside method before change ");
         for(float s : salaries){
            System.out.println("salary "+s);
        }
    }
    public static void changeProfessorSalary(Professor professor){
        System.out.println("Professor --> "+professor);
        professor.setSalary(2400);
    }
}