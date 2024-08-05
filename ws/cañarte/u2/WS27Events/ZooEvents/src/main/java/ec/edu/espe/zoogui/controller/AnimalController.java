package ec.edu.espe.zoogui.controller;

import ec.edu.espe.zoogui.model.Animal;
import utils.MongoDBUtil;

public class AnimalController {
    public static boolean create(Animal animal) {
        return MongoDBUtil.create(animal);
    }
}
