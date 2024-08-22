/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.singleton.model;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class InterfaceCreator {

    private static InterfaceCreator instance;
    private static String typeOfOS;

    private InterfaceCreator(String typeOfOS) {
        this.typeOfOS = typeOfOS;
    }

    public static InterfaceCreator getInstance(String typeOfOS) {
        if (instance == null) {
            instance = new InterfaceCreator(typeOfOS);
        }

        return instance;
    }

    public static void createButton() {
        System.out.println("Creating a button for the operating system " + typeOfOS);
    }

    public static void createInterface() {
        System.out.println("Creating an interface for the operating system " + typeOfOS);
    }
}
