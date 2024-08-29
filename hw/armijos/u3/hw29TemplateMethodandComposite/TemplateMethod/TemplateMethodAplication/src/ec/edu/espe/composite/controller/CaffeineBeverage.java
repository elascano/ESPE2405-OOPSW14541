package ec.edu.espe.composite.controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Enzo Armijos, LogicLegion, DCCO-ESPE
 */
public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

    }

    void boilWater() {
        JOptionPane.showMessageDialog(null, "Boiling Water");
    }

    abstract void brew();

    public void pourInCup() {
        JOptionPane.showMessageDialog(null, "Pouring into cup");

    }
    abstract void addCondiments();
    boolean wantsCondiments(){
        return wantsCondiments();
    }
}
