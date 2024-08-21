/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author David Rodriguez,THEJAVABANDITS DCCO-ESPE
 */
public abstract class GUIFactory {

    // Método para obtener la fábrica adecuada en función del sistema operativo especificado manualmente
    public static GUIFactory getFactory(String osType) {
        if (osType.equalsIgnoreCase("Windows")) {
            System.out.println("Windows OS selected. Creating WinFactory.");
            return new WinFactory();
        } else if (osType.equalsIgnoreCase("Linux")) {
            System.out.println("Linux OS selected. Creating LinuxFactory.");
            return new LinuxFactory();
        } else {
            System.out.println("Unknown OS type. Please specify 'Windows' or 'Linux'.");
            return null; // o lanzar una excepción según convenga
        }
    }

    // Métodos abstractos que las fábricas concretas deben implementar
    public abstract Button createButton();
    public abstract Menu createMenu();
}
