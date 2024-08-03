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


public class B extends A {
    private List<H> hList = new ArrayList<>(); 
    public void addH(H h) {
        hList.add(h);
    }

    public List<H> getHList() {
        return hList;
    }
}
