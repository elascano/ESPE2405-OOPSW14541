
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class LinuxButton extends Button{

    public LinuxButton() {
        super("Linux button");
    }

    @Override
    public void paint() {
        System.out.println("I'm a LinuxButton: " + caption);
    }
    
}
