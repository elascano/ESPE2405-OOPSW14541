/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.referenced.view;

import ec.edu.espe.reference.model.Professor;

/**
 *
 * @author Enzo Armijos , Logic Legion DCCO-ESPE
 */
public class ReferenceDT {

    public static void main(String[] args) {
        System.out.println("Enzo Armijos primitive and referenced data types");
        float salary;
        Professor professor = new Professor(1, "Edison", 4078, 53);
        salary = 2851;

        float salaries[] = new float[3];
        salaries[0] = 1;
        salaries[1] = 2;
        salaries[2] = 3;
        
        System.out.println("professor in the main---->"+professor);
        changedProfessorSalary(professor);
        System.out.println("professor");

        System.out.println("salary form main before calling ---->" + salary);
        changeSalary(salary);
        System.out.println("Salary from main after calling method ---->" + salary);

        for (float s : salaries) {
            System.out.println("salary" + s);
        }
        changedSalaries(salaries);
        System.out.println("Salaries from main after calling method --->"+salary);
        for (float s : salaries) {
            System.out.println("salary" + s);
        }
        System.out.println("salary now" + salary);
        

    }

    public static void changeSalary(float salary) {
        System.out.println("salary inside method before changed ----->" + salary);
        salary = 2000;
        System.out.println("salary inside method after changed --->" + salary);

    }

    public static void changedSalaries(float salaries[]) {
        salaries[0] = 1000;
        salaries[0] = 2000;
        salaries[0] = 3000;

        System.out.println("salaries inside the finction after changed");

        changedSalaries(salaries);
        
        for (float s : salaries) {
            System.out.println("salary" + s);
        }
        System.out.println("salary now" +salaries);

    }

    public static void changedProfessorSalary(Professor professor) {

        System.out.println("Professor------->" + professor);
        professor.setSalario(1000);
    }
}
