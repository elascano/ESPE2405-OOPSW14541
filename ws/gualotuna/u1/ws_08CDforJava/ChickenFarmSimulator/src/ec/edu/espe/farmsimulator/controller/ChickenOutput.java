/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.controller;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public class ChickenOutput {
    public static void saveFile (Chicken chicken){
        
        try (PrintWriter writer = new PrintWriter(new FileWriter("Chicken.txt"))){
            writer.println("Brayan's Chicken Farm Simulator V 0.5");
                           
            writer.println("Chicken --> \n" + chicken);
            
            
            
        }catch (IOException e){
    e.printStackTrace();
        }
        
    }
}
