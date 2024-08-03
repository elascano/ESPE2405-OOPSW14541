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
public class Monkey extends Primate{
    
    public Monkey(int id, String description, Date bornOnDate, char gender, int numberOfBones, Cage cage, int par2, boolean vertebrate) {
        super(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate);
    }
    
}
