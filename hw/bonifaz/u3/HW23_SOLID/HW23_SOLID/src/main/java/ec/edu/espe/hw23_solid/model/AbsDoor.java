/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.hw23_solid.model;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public abstract class AbsDoor implements IDoor {
    protected boolean open;

    public AbsDoor() {
        System.out.println("Creando puerta...");
    }

    @Override
    public boolean isOpen() {
        return open;
    }

    @Override
    public void setOpen(boolean open) {
        this.open = open;
    }
}