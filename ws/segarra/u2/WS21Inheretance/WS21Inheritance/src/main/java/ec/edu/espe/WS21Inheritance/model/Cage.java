/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.WS21Inheritance.model;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 * @version 1.0.0
 */
public class Cage {
    protected int id;
    protected String type;

    public Cage(int id, String type) {
        this.id = id;
        this.type = type;
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cage{" + "id=" + id + ", type=" + type + '}';
    }
    
}
