/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.controller;

/**
 *
 * @author G406
 */
import ec.edu.espe.model.House;

public class HouseController {

    public House createHouse(String id, String name, double area, double pricePerSquareMeter) {
        House house = new House(id, name, area, pricePerSquareMeter);
        
        // Display the created house information
        System.out.println("House created: " + house.toString());
        
        return house;
    }
}