/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.compositepattern;

/**
 *
 * @author Cristian Lisintuña
 */
public class Setup {

    public static void main(String[] args) {
        
        Teller alex = new Teller("Alex");
        Manager brad = new Manager("Brad");
        brad.add(alex);
        
        
        Teller mariana = new Teller("Mariana");
        Teller sophie = new Teller("Sophie");
        Teller lucy = new Teller("Lucy");
        Manager charlie = new Manager("Charlie");
        charlie.add(mariana);
        charlie.add(sophie);
        charlie.add(lucy);
        
        
        President david = President.getPresident("David");
        david.add(brad);
        david.add(charlie);
        
       
        Client.employee = david;
        Client.doClientTask();
    }
}
