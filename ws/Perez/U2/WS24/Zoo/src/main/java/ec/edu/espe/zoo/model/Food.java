/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class Food {
    private int id;
    private String descrption;

    @Override
    public String toString() {
        return "Food{" + "id=" + id + ", descrption=" + descrption + '}';
    }

    public Food(int id, String descrption) {
        this.id = id;
        this.descrption = descrption;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the descrption
     */
    public String getDescrption() {
        return descrption;
    }

    /**
     * @param descrption the descrption to set
     */
    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }
}
