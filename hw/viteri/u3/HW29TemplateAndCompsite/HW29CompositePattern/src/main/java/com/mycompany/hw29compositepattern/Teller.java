/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw29compositepattern;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class Teller extends Employee {

    public Teller(String aName) {
        this();
        name = aName;
    }

    public void stateName() {
        super.stateName();
    }

    public Teller() {
        title = "Teller";
    }
}