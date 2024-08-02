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
public class A {
    private List<B> bInstances;
    private List<C> cInstances;

    public A() {
        bInstances = new ArrayList<>();
        cInstances = new ArrayList<>();
    }

    public void addB(B bInstance) {
        bInstances.add(bInstance);
    }

    public void addC(C cInstance) {
        cInstances.add(cInstance);
    }

    public int getBCount() {
        return bInstances.size();
    }
}
