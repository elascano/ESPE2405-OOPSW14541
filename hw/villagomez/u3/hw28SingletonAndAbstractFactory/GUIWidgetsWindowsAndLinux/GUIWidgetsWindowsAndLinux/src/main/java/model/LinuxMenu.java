/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */
public class LinuxMenu extends Menu {
    public LinuxMenu() {
        super("LinuxMenu 1");
    }

    @Override
    public void paint() {
        System.out.println("I'm a LinuxMenu: " + caption);
    }
}