/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;
import model.Chicken;
import model.Person;
import java.util.ArrayList;
import java.util.Collection;
/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class Collections {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection things;
        Person person = new Person(9, "Alexis Viteri");
        Chicken chicken = new Chicken(2, "Pablo");
        things = new ArrayList();

        System.out.println("Size of things --> " + things.size());

        things.add(100);
        things.add(8.8F);
        things.add(false);
        things.add("OPP 14541");
        things.add(person);
        things.add(chicken);

        System.out.println("things --->" + things);
        System.out.println("size of things --> " + things.size());
        things.remove(person);
        System.out.println("Size of things -->" + things.size());
    }
}
