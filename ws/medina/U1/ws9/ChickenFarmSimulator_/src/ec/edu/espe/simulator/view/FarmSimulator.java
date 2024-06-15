/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulator.view;

import static com.sun.org.apache.xalan.internal.lib.ExsltSets.difference;
import ec.edu.espe.farmsimulator.model.Chicken;
import static java.lang.Double.sum;
import java.util.Date;

/**
 *
 * @author Simone Medina, JavaSquad, DCCO-ESPE
 */
public class FarmSimulator{ 
        public static void main (String[] args){
            System.out.println("Simone's Chicken Farm Simulator V 0.5");
            Chicken chicken= new Chicken(1,"Lucy", "white and brown",0, true, new Date());
            Chicken chicken1= new Chicken(3,"Josefina", "brown",3, false, new Date());
            System.out.println("chicken--> \n"+ chicken);
            
            int id=2;
            String name="Maruja";
            String color="black";
            int age=1;
            boolean molting=false;
            Date bornOnDate= new Date();
            
            
            chicken = new Chicken(id, name, color, age, molting,bornOnDate);
            System.out.println("chicken 2--> \n"+ chicken);
            System.out.println("chicken 2--> \n"+ chicken1);
    
    
}
Short minuend; 
    short subtrahend;
    short difference;
    

}
