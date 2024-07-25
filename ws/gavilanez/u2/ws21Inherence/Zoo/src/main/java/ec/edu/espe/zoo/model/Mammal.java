/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public abstract class Mammal extends Animal {
    
    public Mammal(int id, String description, Date dateOnborn, char gender, int numberOfBones, Cage cage) {
        super(id, description, dateOnborn, gender, numberOfBones, cage);
    }
    
    
    
}
