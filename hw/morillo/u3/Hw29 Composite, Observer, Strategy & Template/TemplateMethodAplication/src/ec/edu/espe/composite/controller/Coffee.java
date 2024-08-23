package ec.edu.espe.composite.controller;

import javax.swing.JOptionPane;

/**
 *
 * @author David Morillo, JavaSquad, DCCO-ESPE
 */
public class Coffee extends CaffeineBeverage implements ButtonObserver {

    public boolean userWantsCondiments;

    @Override
    public void onButtonClicked(boolean wantsCondiments) {
        userWantsCondiments = wantsCondiments;
    }

    @Override
    public void brew() {
        JOptionPane.showMessageDialog(null, "Dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        if (userWantsCondiments = true) {
            JOptionPane.showMessageDialog(null, "Adding sugar and milk");
            JOptionPane.showMessageDialog(null, "Enjoy your coffee");
        } else {
            JOptionPane.showMessageDialog(null, "Enjoy your black coffee");
        }
    }

}
