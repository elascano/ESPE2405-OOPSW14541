/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.composite.model;

/**
 *
 * @author David Morillo, JavaSquad, DCCO-ESPE
 */
public class Client {
    public static Employee employee;
    
    public static void doClientTasks(){
        System.out.println("Creando las tareas de los clientes...");
        employee.stateName();
    }
}
