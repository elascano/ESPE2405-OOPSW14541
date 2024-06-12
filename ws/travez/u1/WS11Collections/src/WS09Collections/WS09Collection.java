/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WS09Collections;

import ec.edu.espe.collection.model.Persona;
import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.ArrayList;
import java.util.Collection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Ismael Travez, The Java Bandits, DCCO-ESPE
 */
public class WS09Collection {

    public static void main(String[] args) {
        Collection things;
        Persona persona = new Persona(1, "Ismael");
        
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        Chicken chicken = new Chicken(1, "Lucy", "Black", true, LocalDate.parse("21/10/2020", dateFormat));

        things = new ArrayList();

        System.out.println("Sise of the thing --> " + things.size());

        things.add(18000);
        things.add("hello Quito");
        things.add(5000.25F);
        things.add(persona);
        things.add(chicken);
        
        System.out.println("List of the thing --> " + things);
        System.out.println("Sise of the thing --> " + things.size());
        things.remove(persona);
        System.out.println("Sise of the thing --> " + things.size());
    }
}
