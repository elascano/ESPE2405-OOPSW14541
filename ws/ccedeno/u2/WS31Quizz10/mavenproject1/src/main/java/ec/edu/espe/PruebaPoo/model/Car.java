/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.PruebaPoo.model;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class Car {
    
    private float speedF;
    private float speedI;
    private float time;
    private float acceleration;    

    public Car(float speedF, float speedI, float time, float acceleration) {
        this.speedF = speedF;
        this.speedI = speedI;
        this.time = time;
        this.acceleration = acceleration;
    }
    
    

    /**
     * @return the speedF
     */
    public float getSpeedF() {
        return speedF;
    }

    /**
     * @param speedF the speedF to set
     */
    public void setSpeedF(float speedF) {
        this.speedF = speedF;
    }

    /**
     * @return the speedI
     */
    public float getSpeedI() {
        return speedI;
    }

    /**
     * @param speedI the speedI to set
     */
    public void setSpeedI(float speedI) {
        this.speedI = speedI;
    }

    /**
     * @return the time
     */
    public float getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(float time) {
        this.time = time;
    }

    /**
     * @return the acceleration
     */
    public float getAcceleration() {
        return acceleration;
    }

    /**
     * @param acceleration the acceleration to set
     */
    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }
}


