/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.event.computeaceleration.controller;

/**
 *
 * @author Eduardo Segarra, TheJavaBandits, DCCO-ESPE
 */
public class ComputeAcelearation {

    public static float computeAceleration(float force, float mass) {
        float aceleration;
        if (mass > 0 && force > 0) {
            aceleration = force / mass;

            return aceleration;
        }else{
            return 0;
        }
    }
}
