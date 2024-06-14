/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ReferenceDT.view;

import ec.edu.espe.ReferenceDT.model.Professor;

/**
 *
 * @author Simone Medina, JavaSquad, DCCO-ESPE
 */
public class ReferenceDT {
    public static void main(String[] args) {
        System.out.println("Simoné Medina primative and referenced data type");
        float salary;
        Professor professor = new Professor(1, "Edison", 4078.f, 53);
        salary =2851;
        
        float salaries []= new float[3];
        salaries[0]=1;
        salaries[1]=2;
        salaries[2]=3;
        System.out.println("Salary from main before calling method---> " + salary);
        
        changeSalary(salary);
        System.out.println("Salary from main before calling method---> " + salary);
        
        changeSalaries(salaries);
        
        for (float s:salaries)
        System.out.println("Salary from main after calling method-->  " + salary);
        
    }
    public static void changeSalary(float salary) {
        System.out.println("Salay inside method before change---> " + salary);
        salary =2000;
        System.out.println("Salry inside method after chande-->" + salary);
        
    }
    public static void changeSalaries(float salaries[]) {
        for (float s: salaries){
            System.out.println("salary "+ s);
                }
         
        salaries[0] = 1000;
        salaries[1] = 2000;
        salaries[2] = 3000;
        
        System.out.println("salaries inside the funcion after changes ->");
        for (float s : salaries)
            System.out.println("salary " + s);
        
    }
   
    public static void changeProfessorSalry(Professor professor) {
        System.out.println("Profesor-->" + professor);
        professor.setSalary(1000);
        
    }
    
}
