/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ws15ReferencedDT.view;

import ec.edu.espe.ws15ReferencedDT.moldel.Profesor;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class RefrencedDT {
    public static void main(String [] args){
        System.out.println("Andres Cedeno primitive and Referenced data types");
        
        float salary;
        Profesor profesor = new Profesor(1,53,"edison",4078);
        salary = 2851;
        
        float salaries[]= new float[3];
        salaries[0]=1;
        salaries[1]=2;
        salaries[2]=3;
        
        
        changeSalary(salary);
        
        
        for (float s: salaries){
        System.out.println("salary" + s);
        }
        System.out.println("salaries from main before calling method -->" );
        
        changeSalaries(salaries);
        for (float s: salaries){
        System.out.println("salary" + s);
        }
        System.out.println("salaries from main after calling method -->");
        for (float s: salaries){
        System.out.println("salary" + s);
        }
        
        System.out.println("profesor in the main --> "+profesor);
        changeProfesorSalary(profesor);
        System.out.println("profesor in the main after calling -->"+profesor);
    }
    
    public static void changeSalary(float salary){
        
        System.out.println("salary inside method before change -->"+salary);
        salary = 2000;
        System.out.println("salary inside method after change -->"+salary);
    }
    public static void changeSalaries(float salaries[]){
        System.out.println("salaries inside the funtion before change");
        
        for (float s: salaries){
        System.out.println("salary" + s);   
        }
        salaries[0]=1000;
        salaries[1]=2000;
        salaries[2]=3000;
    }
    public static void changeProfesorSalary(Profesor profesor){
        System.out.println("profesor -->" +profesor);
        
        profesor.setSalary(1000);
    }
}
