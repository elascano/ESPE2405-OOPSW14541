/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoo.view;

import java.util.ArrayList;
import java.util.Date;
import model.Animal;
import model.Cage;
import model.Food;
import model.Lion;
import model.Monkey;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class Zoo {
    public static void main(String[] args) {
        System.out.println("Alexis's Zoo");
        Food food=new Food(3, "fish");
        Cage cageFelines= new Cage(1,"felinesCage");
        Cage cageMonkeys= new Cage(2,"monkeysCage");
        Cage cageBirds= new Cage(3,"birdsCage");
        Cage pool= new Cage(4,"SharkCage");
       // ArrayList;
        Animal animal = null;
       // lion.register();
       Lion lion=new Lion(1, "Alex el Leon", new Date(2024,10,10),'m', 0,cageFelines , 0, true);
       lion.register(cageFelines);
       //animals.add(Lion);
       lion.feed(5);
        System.out.println("animal(lion)--->"+animal);
       animal=new Monkey(2, "Pancho" ,new Date(2024,10,10),'m', 2, cageMonkeys, 0, true);
       animal.register(pool);
       animal.feed(4);
        System.out.println("animal(Monkey)---->"+ animal);
        
       
    }
}
