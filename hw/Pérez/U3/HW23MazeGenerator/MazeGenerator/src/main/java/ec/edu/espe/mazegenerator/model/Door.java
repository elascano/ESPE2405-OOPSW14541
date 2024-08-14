/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerator.model;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class Door {
    private Room leadsTo;

    public Door(Room leadsTo) {
        this.leadsTo = leadsTo;
    }

    
    
    /**
     * @return the leadsTo
     */
    public Room getLeadsTo() {
        return leadsTo;
    }

    /**
     * @param leadsTo the leadsTo to set
     */
    public void setLeadsTo(Room leadsTo) {
        this.leadsTo = leadsTo;
    }
    
}
