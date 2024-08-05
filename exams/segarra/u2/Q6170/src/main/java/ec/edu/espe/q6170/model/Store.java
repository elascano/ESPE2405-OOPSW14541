/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q6170.model;

/**
 *
 * @author G406
 */
public class Store {
    private String id;
    private String name;
    private float inventory;
    private float sales;

    public Store(String id, String name, float inventory, float sales) {
        this.id = id;
        this.name = name;
        this.inventory = inventory;
        this.sales = sales;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the inventory
     */
    public float getInventory() {
        return inventory;
    }

    /**
     * @param inventory the inventory to set
     */
    public void setInventory(float inventory) {
        this.inventory = inventory;
    }

    /**
     * @return the sales
     */
    public float getSales() {
        return sales;
    }

    /**
     * @param sales the sales to set
     */
    public void setSales(float sales) {
        this.sales = sales;
    }
    
    public static float storeEfcienty(float inventory, float sales){
        return sales/inventory;
    }
}
