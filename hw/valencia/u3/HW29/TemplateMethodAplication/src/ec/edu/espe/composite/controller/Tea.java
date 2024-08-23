package ec.edu.espe.composite.controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Yuliana Valencia, DCCO-ESPE
 */
public class Tea extends CaffeineBeverage implements ButtonObserver{

    private boolean userWantsCondiments = false;

    @Override
    public void brew() {
        JOptionPane.showMessageDialog(null, "Steep the tea");
    }

    @Override
    public void addCondiments() {
        if (userWantsCondiments = true) {
            JOptionPane.showMessageDialog(null, "Adding lemon");
            JOptionPane.showMessageDialog(null, "Enjoy your tea");
        } else {
            JOptionPane.showMessageDialog(null, "Enjoy your black tea");
        }
    }

    @Override
    public void onButtonClicked(boolean wantsCondiments) {
        userWantsCondiments = wantsCondiments;
    }

}
