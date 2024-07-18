package ec.edu.espe.zoo.comtroller;

import ec.edu.espe.zoo.model.Animal;
import utils.MongoDBUtils;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class AnimalController {

    public static boolean create(Animal animal) {
        MongoDBUtils.saveAnimal(animal);
        System.out.println("calling the method to save");
        return true;
    }
}
