/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.edu.espe.collection.model;

/**
 *
 * @author David Rodriguez,THEJAVABANDITS,DCCO-ESPE
 */
   public class Person {
    private int ID;
    private String nombre;

    public Person(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Person{" + "ID=" + ID + ", nombre=" + nombre + '}';
    }
    

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
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
   }
