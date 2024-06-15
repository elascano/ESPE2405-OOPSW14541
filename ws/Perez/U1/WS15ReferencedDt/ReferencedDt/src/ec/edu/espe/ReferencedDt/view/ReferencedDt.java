package ec.edu.espe.ReferencedDt.view;

import ec.edu.espe.ReferencedDt.model.Professor;
import java.util.Arrays;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class ReferencedDt {
    public static void main(String [] args){
        System.out.println("Carlos Perez primitive anda Data");
        float salary;
        Professor professor = new Professor(1,"Edison",4078,53);
        salary=2871;
        float salaries[]=new float[3];
        salaries [0]=1;
        salaries [1]=2;
        salaries [2]=3;
        System.out.println("salary from main before calling method .->" + salary);
        changeSalary(salary);
        System.out.println("salary from main after calling method ->" + salary);
        System.out.println("Salaries from main before change -->" + Arrays.toString(salaries));
        changeSalaries(salaries);
        System.out.println("Salaries from main after change -->" + Arrays.toString(salaries));
        System.out.println("Professor in the main -->" + professor);
        changeProfessorSalary(professor);
        System.out.println("professor in the main after calling -->" + professor);
    }
    
    public static void changeSalary(float salary){
        System.out.println("salary inside method before changed -->" + salary);
        salary=2000;
        System.out.println("salary inside method after changed -->" + salary);
        
    }
        
    public static void changeSalaries(float salaries[]){
        System.out.println("salaries inside the function before the change");
        for (float s : salaries){
            System.out.println("salary"+s);
        }
        salaries [0]=1000;
        salaries [1]=2000;
        salaries [2]=3000;
        System.out.println("salaries inside the function after the change");
        for (float s : salaries){
            System.out.println("salary"+s);
        }
    }
    public static void changeProfessorSalary(Professor professor){
        System.out.println("Professor -->" + professor);

        professor.setSalary(1000);
    }
        
}
