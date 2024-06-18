/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.ReferencedDT.view;

import ec.edu.espe.ReferencedDT.model.Professor;

/**
 *
 * @author luis Vaca, TheJavaBandits, DCCO-ESPE
 */
public class ReferencedDT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Luis Vaca primitives and referenced data types");
        float salary;
        Professor professor = new Professor(1,"Edison",4078.0F, 53  );
        salary = 2851;

        System.out.println("Salary from main before calling --> " + salary);

        changeSalary(salary);

        System.out.println("Salary form main after calling --> " + salary);

        float salaries[] = new float[3];
        salaries[0] = 1;
        salaries[1] = 2;
        salaries[2] = 3;

        for (float s : salaries) {
            System.out.println("salaries " + s);
        }

        changeSalaries(salaries);

        changeProfessor(professor);
        System.out.println("Professor salary --> " + professor.getSalary());
    }

    public static void changeSalary(float salary) {
        System.out.println("Salary inside method before changing --> " + salary);
        salary = 2000;
        System.out.println("Salary inside method after changing --> " + salary);

    }

    public static void changeSalaries(float salaries[]) {
        System.out.println("Salaries inside the function before change");

        for (float s : salaries) {
            System.out.println("salary " + s);
        }

        salaries[0] = 1000;
        salaries[1] = 2000;
        salaries[2] = 3000;

        System.out.println("Salaries inside the function after change");

        for (float s : salaries) {
            System.out.println("salary " + s);
        }
    }

    public static void changeProfessor(Professor professor) {
        System.out.println("Professor --> " + professor.getSalary());

        professor.setSalary(1000);
    }
}