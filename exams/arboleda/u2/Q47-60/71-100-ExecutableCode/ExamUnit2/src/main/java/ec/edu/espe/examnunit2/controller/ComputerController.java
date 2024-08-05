/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.examnunit2.controller;

import ec.edu.espe.examnunit2.model.Computer;

/**
 *
 * @author Abner Arboleda, Logic Legion, DCCO-ESPE
 */
public class ComputerController {
    public double computePerformanceIndex(Computer computer) {
        double processorSpeed = computer.getProcessorSpeed();
        int ramSize = computer.getRamSize();

        return processorSpeed * ramSize;
    }
}
