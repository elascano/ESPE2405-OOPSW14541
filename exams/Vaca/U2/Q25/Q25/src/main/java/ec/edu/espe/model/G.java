/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

/**
 *
 * @author G406
 */
public class G implements H {
    private J j; 

    public G(J j) {
        this.j = j;
    }

    public J getJ() {
        return j;
    }

    public void performAction() {
        System.out.println("Acción realizada por G.");
    }

    @Override
    public String toString() {
        return "Instancia de G";
    }
}

