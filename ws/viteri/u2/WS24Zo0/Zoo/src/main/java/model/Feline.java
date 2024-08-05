/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class Feline extends Mammal{
    
    public Feline(int id, String description, Date bornOnDate, char gender, Cage cage, int numberOfBones, boolean vertebrate) {
        super(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate);
    }
    
}
