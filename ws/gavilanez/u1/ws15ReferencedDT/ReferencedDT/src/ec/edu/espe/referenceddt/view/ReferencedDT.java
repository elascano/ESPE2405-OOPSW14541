/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.referenceddt.view;
import ec.edu.espe.referenceddt.model.Professor;
/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class ReferencedDT {
    public static void main(String[] args) {
        System.out.println("Kenny Gavilanez primitive and reference data type");
        float salary;
        Professor professor = new Professor(1,"Kenny",4078,20);
        salary = 2851;
        float salaries[]=new float[3];
        salaries [0]=1;
        salaries [1]=2;
        salaries [2]=3;
        
        System.out.println("Salary from main before calling method -->"+ salary);
        changeSalary(salary);
        System.out.println("Salary from main after calling method -->"+salary);
        for (float s : salaries)
            System.out.println("salary " +s);
        
        changeSalaries(salaries);
    }
    public static void changeSalary(float salary){
        System.out.println("Salary inside method before change -->"+ salary);
        salary=2000;
        System.out.println("Salary inside method before change -->"+ salary);
    }
    
    public static void changeSalaries(float salaries[]){
        for (float s : salaries)
            System.out.println("salary " +s);
        
        salaries[0]=1000;
        salaries[1]=2000;
        salaries[2]=3000;
        
        for (float s : salaries)
            System.out.println("salary " +s);
        
        System.out.println("professor ");
        
    }
    
    public static void changeProfessorSalary(Professor professor){
        System.out.println("Professor -->" + professor);
        
        professor.setSalary(1000);
    }
}
