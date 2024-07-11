/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.HW15Code.view;

import ec.edu.espe.HW15Code.controller.MongoDBConection;
import ec.edu.espe.HW15Code.model.Student;
import java.util.Scanner;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class HW15MongoShellAndCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String id, name;
        boolean male;
        int siblings;
        
        System.out.println("Type your ID: ");
        id = scanner.nextLine();
        System.out.println("Type your name: ");
        name = scanner.nextLine();
        System.out.println("Are you a male? (true or false):");
        male = scanner.nextBoolean();
        System.out.println("How many siblings do you have?: ");
        siblings = scanner.nextInt();
        
        Student student = new Student(id, name, male, siblings);
        
        MongoDBConection.createConection(student);
    }
    
}