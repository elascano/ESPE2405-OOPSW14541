
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Cristian Mateo lisintuña
 */

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button painted.");
    }
}

