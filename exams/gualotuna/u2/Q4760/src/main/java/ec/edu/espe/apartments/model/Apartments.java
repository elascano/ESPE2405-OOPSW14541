/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.apartments.model;

/**
 *
 * @author G406
 */
public class Apartments {
    private int numDep;
    private int size;
    private int time;
    private int price;

    public Apartments(int numDep, int size, int time, int price) {
        this.numDep = numDep;
        this.size = size;
        this.time = time;
        this.price = price;
    }
    
    

    /**
     * @return the numDep
     */
    public int getNumDep() {
        return numDep;
    }

    /**
     * @param numDep the numDep to set
     */
    public void setNumDep(int numDep) {
        this.numDep = numDep;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
}
