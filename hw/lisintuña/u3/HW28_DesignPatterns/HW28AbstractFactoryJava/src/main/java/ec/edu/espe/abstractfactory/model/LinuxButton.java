
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Cristian Mateo lisintuña
 */

public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("Linux Button painted.");
    }
}

