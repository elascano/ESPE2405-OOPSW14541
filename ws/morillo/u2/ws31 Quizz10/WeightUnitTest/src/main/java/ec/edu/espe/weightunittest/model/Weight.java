/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.weightunittest.model;

/**
 *
 * @author ASUS
 */
public class Weight {
    private double mass;
    private double gravity;
    private double weight;

    public Weight(double mass, double gravity, double weight) {
        this.mass = mass;
        this.gravity = gravity;
        this.weight = weight;
    }

    /**
     * @return the mass
     */
    public double getMass() {
        return mass;
    }

    /**
     * @param mass the mass to set
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * @return the gravity
     */
    public double getGravity() {
        return gravity;
    }

    /**
     * @param gravity the gravity to set
     */
    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
