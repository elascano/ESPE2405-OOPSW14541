/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.objectinfile.view;

import ec.edu.espe.objectinfile.model.Backpack;
import ObjectsManager.ObjectManager;
import java.io.IOException;

/**
 *
 * @author David Pantoja, Java Squad, DCCO-ESPE
 */
public class ObjectFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        Backpack backpack = new Backpack(1,"black", "Totto", "School", "Medium");
        ObjectManager.saveObject(backpack, "backpack.obj");
        Backpack loadBackpack = (Backpack) ObjectManager.loadObject("backpack.obj");
        System.out.println(backpack);
    }
}
