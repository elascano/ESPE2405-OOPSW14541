/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.ws21zoo.model;

import java.util.Date;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */
public abstract class Bird extends Animal {

    public Bird(int id, String description, Date bornOnDate, char gender, Cage cage, int numberOfBones) {
        super(id, description, bornOnDate, gender, cage, numberOfBones);
    }

    @Override
    public void feed(int food) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
