/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taxes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Brayan Gualotuña, Dev Dynasty, DCCO-ESPE
 */
public class SaveObject {
    
    public static void saveObjects(Object objetc, String nameFile) {
        try (FileOutputStream fileOut = new FileOutputStream(nameFile);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(objetc);
            System.out.println("El objeto ha sido guardado en " + nameFile);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
    
    
     public static Object readObejcts(String nameFile) {
        Object objetc = null;
        try (FileInputStream fileIn = new FileInputStream(nameFile);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            objetc = in.readObject();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Clase no encontrada");
            c.printStackTrace();
        }
        return objetc;
    }
}
