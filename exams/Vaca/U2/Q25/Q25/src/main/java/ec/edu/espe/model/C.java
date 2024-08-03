/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G406
 */

public class C extends A {
    private List<E> eList = new ArrayList<>(); 

    public void addE(E e) {
        if (eList.size() < 3) {
            eList.add(e);
        } else {
            System.out.println("No se pueden agregar más de 3 instancias de E.");
        }
    }

    public List<E> getEList() {
        return eList;
    }
}
