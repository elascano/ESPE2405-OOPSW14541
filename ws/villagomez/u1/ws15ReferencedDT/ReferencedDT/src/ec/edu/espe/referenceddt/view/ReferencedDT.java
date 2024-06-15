/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.referenceddt.view;

import ec.edu.espe.referenceddt.model.Professor;

/**
 *
 * @author Doménica Villagómez, CommitCrew, DCCO-ESPE
 */
public class ReferencedDT {

    public static void main(String[] args) {
        System.out.println("Domenica Villagomez");
        float salary;
        Professor professor = new Professor(1, "Edison Lascano", 53, 4078);
        salary = 2851;

        float salaries[] = new float[3];
        salaries[0] = 1;
        salaries[1] = 2;
        salaries[2] = 3;

        System.out.println("Salary from main before calling -->" + salary);
        changeSalary(salary);
        System.out.println("Salary from main after calling -->" + salary);

        for (float s : salaries) {
            System.out.println("salary " + s);
        }

        changeSalaries(salaries);

        System.out.println("Salaries after calling: " + salary);

        System.out.println("Professor in the main --> " + professor);
        changeProfessor(professor);
        System.out.println("Professor after the calling" + professor);
    }

    public static void changeSalary(float salary) {
        System.out.println("Salary inside method before change: --> " + salary);
        salary = 2000;
        System.out.println("Salary inside method after change --> " + salary);

    }

    public static void changeSalaries(float salaries[]) {
        System.out.println("Salaries inside the function before change: ");
        for (float s : salaries) {
            System.out.println("salary " + s);
        }
        salaries[0] = 1000;
        salaries[1] = 2000;
        salaries[2] = 3000;

        //System.out.println("Salaries inside after calling: " + s);
        for (float s : salaries) {
            System.out.println("salaries inside after calling " + s);
        }
    }

    public static void changeProfessor(Professor professor) {
        System.out.println("Professor " + professor);
        professor.setSalary(1000);
    }

}
