/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.WS21Inheritance.model;

import java.util.Date;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public abstract class Mammal extends Animal{
    
    public Mammal(int id, String description, Date bornOnDate, char gender, Cage cage, int numberOfBones, boolean vetebrate) {
        super(id, description, bornOnDate, gender, cage, numberOfBones, vetebrate);
    }
    
}
