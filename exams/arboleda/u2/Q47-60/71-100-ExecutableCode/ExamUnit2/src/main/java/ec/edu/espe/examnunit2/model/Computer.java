/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.examnunit2.model;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public class Computer {
    private String id;
    private String name;
    private double processorSpeed;
    private int ramSize;

    public Computer(String id, String name, double processorSpeed, int ramSize) {
        this.id = id;
        this.name = name;
        this.processorSpeed = processorSpeed;
        this.ramSize = ramSize;
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
     * @return the processorSpeed
     */
    public double getProcessorSpeed() {
        return processorSpeed;
    }

    /**
     * @param processorSpeed the processorSpeed to set
     */
    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    /**
     * @return the ramSize
     */
    public int getRamSize() {
        return ramSize;
    }

    /**
     * @param ramSize the ramSize to set
     */
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
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
    
}
