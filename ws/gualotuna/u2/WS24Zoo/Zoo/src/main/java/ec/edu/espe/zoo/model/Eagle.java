/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public class Eagle extends Bird{

    public Eagle(int id, String description, Date bornOnDate, char gender, Cage cage, int numberOfBones, int numberOfLegs) {
        super(id, description, bornOnDate, gender, cage, numberOfBones, numberOfLegs);
    }

   

    @Override
    public void feed(int food) {
        System.out.println("feeding an eagle with "); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
