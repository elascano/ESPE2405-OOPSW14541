
package ec.edu.espe.abstractfactory.controller;

/**
 *
 * @author MSI-PULSE
 */

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button painted.");
    }
}

