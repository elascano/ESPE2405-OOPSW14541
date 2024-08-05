/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.fromumltocode;

/**
 *
 * @author G406
 */
import java.util.ArrayList;
import java.util.List;

public class C extends A {
    private List<E> listaE;

    public C(String nombre) {
        super(nombre);
        listaE = new ArrayList<>();
    }

    public void agregarE(E e) {
        if (listaE.size() < 3) {
            listaE.add(e);
        } else {
            System.out.println("No se pueden agregar más de 3 objetos E.");
        }
    }

    @Override
    public String toString() {
        return "Clase C: " + getNombre() + ", Lista de E: " + listaE.toString();
    }
}

