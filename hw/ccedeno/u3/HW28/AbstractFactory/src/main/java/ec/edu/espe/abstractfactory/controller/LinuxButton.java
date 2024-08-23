
package ec.edu.espe.abstractfactory.controller;

/**
 *
 * @author MSI-PULSE
 */

public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("Linux Button painted.");
    }
}

