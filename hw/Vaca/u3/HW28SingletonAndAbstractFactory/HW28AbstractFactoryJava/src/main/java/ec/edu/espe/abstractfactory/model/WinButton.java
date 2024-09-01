
package ec.edu.espe.abstractfactory.model;

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

