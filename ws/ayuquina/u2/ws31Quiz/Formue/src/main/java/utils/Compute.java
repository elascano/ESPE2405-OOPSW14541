/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class Compute {

    public static double computeVolumeOfCone(double radio, double height) {
        double PI = Math.PI;

        double powRadio = Math.pow(radio, 2);
        if (radio != 0.0 || height != 0.0) {
            double volume = ((0.3333333333333333333333333) * PI * powRadio * height);
            return volume;
        } else {
            return 0.0;
        }
    }
}
