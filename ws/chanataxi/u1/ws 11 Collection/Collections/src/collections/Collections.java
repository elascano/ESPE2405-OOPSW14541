package collections;

import ec.edu.espe.collections.model.Chicken;
import ec.edu.espe.collections.model.Person;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Marco Chanataxi, Dev Dynasty, DCCO-ESPE
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Collection things;
        Person person = new Person (9, "Marco");
        things = new ArrayList();
        
        System.out.println("Size of things --> " +things.size());
        
        things.add(250);
        things.add(6.5F);
        things.add(false);
        things.add("OPP 14541");
        things.add(person);
        
        
        
        System.out.println("things --->" + things);
        
        System.out.println("size of things --> " + things.size());
        
        things.remove(person);
        System.out.println("Size of things -->" + things.size());
        
        
        Chicken chicken = new Chicken(12,"Enzo","Green", true);
        
        System.out.println("Size of things --> " +things.size());
        
        things.add(403);
        things.add(5.3F);
        things.add(true);
        things.add("OPP 14541");
        things.add(chicken);
        
        
        
        System.out.println("things --->" + things);
        
        System.out.println("size of things --> " + things.size());
        
        things.remove(chicken);
        System.out.println("Size of things -->" + things.size());
        
        
        
    }
        
    
}
