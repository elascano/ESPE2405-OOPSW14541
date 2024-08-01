/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.distancecalculation.model;

/**
 *
 * @author Carlos Perez, The Javas, DCCO-ESPE
 */
public class Distance {
    private float value;

    public Distance(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Distance{" + "value=" + value + "}";
    }
}
