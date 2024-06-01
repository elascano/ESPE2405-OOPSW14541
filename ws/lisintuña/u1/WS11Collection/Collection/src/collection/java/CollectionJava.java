/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection.java;

import ec.edu.espe.collection.model.chicken;
import ec.edu.espe.collection.model.person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author DELL
 */
public class CollectionJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        Collection things;
        person person=new person(1,"Luis");
        chicken pollo=new chicken(1,"BLue","´Pedro","13",false,2019,12,3);
        things=new ArrayList<>();
        
        System.out.println("size of things -->"+things.size());
        
        
        things.add(400);
        things.add(3.4F);
        things.add(true);
        things.add("opp 14541");
        things.add(person);
        things.add(pollo);
     
        
        System.out.println("things --> "+ things);
        
        System.out.println("size of things -->"+things.size());
        
        things.remove(person);
        things.remove(pollo);
        System.out.println("size of things -->"+things.size());
    }

    
    }
    

