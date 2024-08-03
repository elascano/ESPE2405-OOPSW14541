/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public class Zoo {
    public static void main(String[] args) {
        System.out.println("Brayan's Zoo");
        Cage cageFelines = new Cage(1,"felineCage");
        Cage cageMonkeys = new Cage(2, "monkeysCage");
        Cage cageBirds = new Cage(3, "BirdsCage");
        Cage pool = new Cage(4,"pool of Sharks");
        Food food = new Food(1, "fish");
        ArrayList<Animal> animals = new ArrayList<>();
        
        
        Lion lion = new Lion(true, 1, "Lion Juancho", new Date(2000, 2, 3), 'm', cageFelines, 0, 0);
        lion.register();
        lion.feed(2);
        lion.feed(3, food);
        System.out.println("lion --->" + lion);
       
        
        Animal animal;
        //animal = new Animal();
        
        animal = new Monkey(2, "bear", new Date(2000, 2, 3), 'm', cageMonkeys,0 , 0);
        animal.feed(5);
        animal.register();
        
        
        
        animal.feed(4);
        
        Shark shark = new Shark(4, "baby shark", new Date(2000, 2, 3), 'm', pool, 0, 0);
        shark.feed(1);
        //animals.add(shark);
        System.out.println("Shark ---> " + shark);
        
        System.out.println("animals in Brayan's Zoo --->" + animals);
        
        for (Animal ani : animals) {
            System.out.println(ani);
        }
        
    }
}
