/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.referencedatatype.view;

import ec.edu.espe.referencedatatype.model.Professor;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class ReferenceDataType {

    public static void main(String[] args) {
        System.out.println("Danny Ayuquina primitive and referenced data types");
        
        float salary;
        Professor professor = new Professor(1, "Edison", 4078, 53);
        salary = 2851;

        float salaries[] = new float[3];
        salaries[0] = 1;
        salaries[1] = 2;
        salaries[2] = 3;

        System.out.println("Salary from main before calling --> " + salary);
        
        changeSalary(salary);
        
        System.out.println("Salary from main after calling method --> " + salary);

        //For each
        System.out.println("Salaries before calling --> ");
        for (float s : salaries) {
            System.out.println("Salary " + s);
        }

        changeSalaries(salaries);

        System.out.println("Salaries after calling --> ");
        for (float s : salaries) {
            System.out.println("Salary " + s);
        }

        System.out.println("Professor in the main --> " + professor);
        changeProfessorSalary(professor);
        System.out.println("Professor in the main after calling --> " + professor);

    }

    public static void changeSalary(float salary) {
        System.out.println("Salary inside methode before change --> " + salary);
        salary = 2000;
        System.out.println("Salary inside methode after the change --> " + salary);
    }

    public static void changeSalaries(float salaries[]) {

        System.out.println("Salaries inside before the method -->");
        for (float s : salaries) {
            System.out.println("Salary " + s);
        }
        
        salaries[0] = 1000;
        salaries[1] = 2000;
        salaries[2] = 3000;

        System.out.println("Salary inside the method -->");
        for (float s : salaries) {
            System.out.println("Salary " + s);
        }
    }

    public static void changeProfessorSalary(Professor professor) {
        System.out.println("Professor --> " + professor);

        professor.setSalary(1000);

    }
}
