/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Domenica Villagomez, CommitCrew, DCCO-ESPE
 */
public abstract class Button {
    protected String caption;

    public Button(String caption) {
        this.caption = caption;
        System.out.println("Creating Button: " + caption);
    }

    public abstract void paint();
}
