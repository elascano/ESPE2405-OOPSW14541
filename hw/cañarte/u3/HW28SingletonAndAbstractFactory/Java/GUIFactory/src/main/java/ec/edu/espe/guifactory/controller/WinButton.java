package ec.edu.espe.guifactory.controller;

/**
 *
 * @author Saray Canarte, Code Creators, DCCO-ESPE
 */
public class WinButton extends Button {
    @Override
    public void paint() {
        System.out.println("I'm a WinButton " + caption);
    }
}
