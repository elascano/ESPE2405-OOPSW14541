/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Utils.DataBase;
import model.Animal;

/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class AnimalController {
    public static boolean create(Animal animal){
        //Save this information in in the cloud
        System.out.println("Calling method");
        DataBase dataBase=new DataBase();
        dataBase.sendInDataBase(animal);
        return true;
    }
}
