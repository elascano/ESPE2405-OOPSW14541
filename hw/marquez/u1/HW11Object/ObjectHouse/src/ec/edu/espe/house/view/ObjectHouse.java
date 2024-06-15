/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.house.view;
import ec.edu.espe.house.model.House;
/**
 *
 * @author Jenniffer Marquez, Javasquad, DCCO-ESPE
 */
public class ObjectHouse {
    public static void main(String[] args) {
        House house = new House("Blue", 0, "Eden del valle", 0, "concrete");
        System.out.println("House---> " + house);
    }
}
