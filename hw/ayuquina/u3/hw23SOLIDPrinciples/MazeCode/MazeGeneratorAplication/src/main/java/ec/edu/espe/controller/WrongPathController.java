/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.controller;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class WrongPathController implements PathGenerator {

    @Override
    public void findPathRoute() {
        System.out.println("Finding wrong path..");
    }

    @Override
    public void validatePath() {
        System.out.println("Wrong path found.");
    }

}
