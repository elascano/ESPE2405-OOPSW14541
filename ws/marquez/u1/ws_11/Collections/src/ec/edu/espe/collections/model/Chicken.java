/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.collections.model;

/**
 *
 * @author Jenniffer Marquez, Javasquad, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String nombre;

    /**
     * @return the id
     */
    
    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", nombre=" + nombre + '}';
    }

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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Chicken(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    
}
