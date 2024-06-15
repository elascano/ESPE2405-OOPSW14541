package ec.edu.espe.mouse.view;

import ec.edu.espe.mouse.model.Mouse;

/**
 * 
 * @autor MSI-PULSE
 */
public class ObjectInFile {

    public static void main(String[] args) {
        Mouse myMouse = new Mouse("Logitech", "Mediano", true, 49.99);

        
        System.out.println("Mouse --> " + myMouse);
    }
}
