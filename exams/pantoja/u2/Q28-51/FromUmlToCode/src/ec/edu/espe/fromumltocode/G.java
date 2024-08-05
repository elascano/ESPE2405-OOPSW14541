/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.fromumltocode;

/**
 *
 * @author G406
 */
public class G implements H {
    private String nombre;
    private J j;

    public G(String nombre, J j) {
        this.nombre = nombre;
        this.j = j;
    }

    @Override
    public void realizarAccion() {
        System.out.println("Realizando acción en G.");
    }

    @Override
    public String toString() {
        return "Clase G: " + nombre + ", J: " + j.toString();
    }
}

