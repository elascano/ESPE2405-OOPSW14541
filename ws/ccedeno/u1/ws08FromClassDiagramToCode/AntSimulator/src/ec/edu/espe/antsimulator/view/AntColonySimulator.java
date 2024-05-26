package ec.edu.espe.antsimulator.view;

import ec.edu.espe.antsimulator.model.*;

/**
 *
 * @author Andres Cedeño, Code creators, DCCO-ESPE
 */
public class AntColonySimulator {
    public static void main(String[] args) {
        System.out.println("Andre's Ant Colony Simulator");
        Ant ants[] = new Ant[3];
        Cell cell = new Cell(1, 1);
        Colony colony;
        Food food = new Food(3);
        FoodPile foodPile = new FoodPile(cell, 1);
        Nest nest;
        Food[] stockPile = new Food[5];
        
        Ant ant = new Ant(cell, 1);
        ants[0] = new Ant(cell, 2);
        ants[1] = ant;
        ants[2] = new Ant(cell, 3);
        
        ants[0].run();
        
        nest = new Nest(cell, stockPile);
        colony = new Colony(nest, ants);
        
        System.out.println("Colony --> " + colony);
        System.out.println("Food --> " + food);
        System.out.println("Cell --> " + cell);
        System.out.println("FoodPile --> " + foodPile);
        System.out.println("Ants --> " + ants[1]);
    }
}
