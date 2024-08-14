/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.hw23_solid.model;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class Path implements IPath {
    private boolean clear;

    public Path() {
        System.out.println("Creando camino...");
        this.clear = false;
    }

    @Override
    public boolean isClear() {
        return clear;
    }

    @Override
    public void setClear(boolean clear) {
        this.clear = clear;
    }
}