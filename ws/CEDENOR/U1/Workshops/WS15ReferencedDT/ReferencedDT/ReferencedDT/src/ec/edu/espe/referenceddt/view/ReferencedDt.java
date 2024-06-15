
package ec.edu.espe.referenceddt.view;

import ec.edu.espe.referenceddt.model.Professor;
/**
 *
 * @author Nahomi Cedeño, CODE CREATORS, DCCO-ESPE
 */
public class ReferencedDt {
    
    public static void main(String[] args) {
        
        System.out.println("Nahomi Cedeno primitive and referenced data types");
        
        float salary;
        Professor professor = new Professor(1, "Edison", 4078, 53);
        salary = 2851;
        
        float salaries[] = new float [3];
        salaries[0] = 1;
        salaries[1] = 2;
        salaries[2] = 3;
        
        for (float s : salaries)
            System.out.println("salary " + s);
      
        System.out.println("salary from m" + salary);
        
        changeSalary(salary);
        
        System.out.println("Salary from main after calling method --->" + salary);
        
        
        for (float s : salaries)
            System.out.println("salary " + s);
        
        changeSalaries(salaries); 

        System.out.println("professor in the main ..> " + professor);
        changeProfessorSalary(professor);
        System.out.println("professor in the main after calling --> " + professor);
      
    }
    
    public static void changeSalary(float salary){
        System.out.println("salary inside method before change -->" + salary);
        salary = 2000;
        System.out.println("salary inside method after change --> " + salary);
    }
    
    public static void changeSalaries(float[] salaries){
        
        System.out.println("salaries inside the funtion before changes -> ");
        for (float s : salaries)
            System.out.println("salary " + s);
        
        salaries[0] = 1000;
        salaries[1] = 2000;
        salaries[2] = 3000;
        
        System.out.println("salaries inside the funcion after changes ->");
        for (float s : salaries)
            System.out.println("salary " + s);
        
    }
    
    public static void changeProfessorSalary(Professor professor){
            System.out.println("Professor ---> " + professor);
            
            professor.setSalary(1000);
    }

}
