/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.event.computeaceleration.model;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class Aceleration {
    protected float force;
    protected float mass;
    protected float aceleration;

    public Aceleration(float force, float mass, float aceleration) {
        this.force = force;
        this.mass = mass;
        this.aceleration = aceleration;
    }

    /**
     * @return the force
     */
    public float getForce() {
        return force;
    }

    /**
     * @param force the force to set
     */
    public void setForce(float force) {
        this.force = force;
    }

    /**
     * @return the mass
     */
    public float getMass() {
        return mass;
    }

    /**
     * @param mass the mass to set
     */
    public void setMass(float mass) {
        this.mass = mass;
    }

    /**
     * @return the aceleration
     */
    public float getAceleration() {
        return aceleration;
    }

    /**
     * @param aceleration the aceleration to set
     */
    public void setAceleration(float aceleration) {
        this.aceleration = aceleration;
    }
    
    
}
