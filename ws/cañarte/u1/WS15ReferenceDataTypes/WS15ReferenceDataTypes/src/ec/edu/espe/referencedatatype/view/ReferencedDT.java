
package ec.edu.espe.referencedatatype.view;

import ec.edu.espe.referencedatatype.model.Professor;

/**
 *
 * @author Saray Canarte, Code Creators, DCCO - ESPE
 */
public class ReferencedDT {
    public static void main (String []args){
        System.out.println("Saray Canarte");
        float salary;
        Professor professor = new Professor(1, "edison",4878, 53);
        salary = 2851;
        
        float salaries[] = new float [3];
        salaries[0]=1;
        salaries[1]=2;
        salaries[2]=3;
        
        System.out.println("Salary from main aftter calling method --> " + salary);
        changeSalary(salary);
        System.out.println("Salary from main aftter calling method --> " + salary);        
        
        System.out.println("Salary from main before calling method "  + salary);
        for (float s : salaries){
            System.out.println("salary "+ s);
        }
        
        changeSalaries(salaries);
          System.out.println("Salary from main aftter calling method --> " + salary);
        for (float s : salaries){
            System.out.println("salary "+ s);
        }
    
        System.out.println("professor in the main-->" + professor);
        changeProfessorSalary(professor);
        System.out.println("professor in the main after calling -->" + professor);
    
    }
    
    public static void changeSalary (float salary){
        System.out.println("Salary inside method before change --> " + salary);
        salary = 2000;
        System.out.println("Salary inside method after change --> " + salary);
    }
    
    public static void changeSalaries (float salaries[]){
        System.out.println("Salaries inside the funciton before change");
        for (float s : salaries){
             System.out.println("salary "+ s);
        }
        
        salaries[0]= 1000;
        salaries[1]=2000;
        salaries[2]=3000;
        
        System.out.println("Salaries inside the function after change");
        for (float s : salaries){
             System.out.println("salary "+ s);
        }
        
    }
    
    public static void changeProfessorSalary (Professor professor){
        System.out.println("Professor-->" + professor);
        
        professor.setSalary(1000);
    }
}
