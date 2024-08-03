/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2.pkg1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G406
 */
public class C {
    private List<E> eInstances;

    public C() {
        eInstances = new ArrayList<>();
    }

    public void addE(E eInstance) {
        eInstances.add(eInstance);
    }

    public int getECount() {
        return eInstances.size();
    }
}
