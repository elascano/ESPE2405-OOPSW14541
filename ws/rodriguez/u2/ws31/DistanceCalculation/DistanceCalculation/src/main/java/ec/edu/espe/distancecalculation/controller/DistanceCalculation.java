/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.distancecalculation.controller;

import ec.edu.espe.distancecalculation.model.Distance;

/**
 *
 * @author David Rodriguez,THEJAVABANDITS DCCO-ESPE
 */
public class DistanceCalculation {

    public static Distance calculateDistance(float speed, float time) {
        float distance = speed * time;
        return new Distance(distance);
    }
}
