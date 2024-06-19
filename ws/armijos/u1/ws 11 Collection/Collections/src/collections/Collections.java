
package collections;

import ec.edu.espe.collections.Chicken;
import ec.edu.espe.collections.Persona;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Enzo Armijos , Logic Legion DCCO-ESPE
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Collection things;
        things= new ArrayList();
        Persona person= new Persona(1, "Enzo");
     
        Chicken chicken =new Chicken(2, "Lucy","White",5,true);
        
        System.out.println("size of things --->"+ things.size());
        
        things.add(40);
        things.add(3.4F);
        things.add(true);
        things.add("OOP 14541");
        things.add(person);
        
        System.out.println("things --->" +things);
        System.out.println("size of things-->"+things.size());
        things.remove(person);
        System.out.println("Size of things--->"+things.size());
        
        things.add(12);
        things.add(1.6F);
        things.add(true);
        things.add("is a move");
        things.add(chicken);
        
        System.out.println("things --->" +things);
        System.out.println("size of things-->"+things.size());
        things.remove(person);
        System.out.println("Size of things--->"+things.size());
        
        
        
    }
    
}
