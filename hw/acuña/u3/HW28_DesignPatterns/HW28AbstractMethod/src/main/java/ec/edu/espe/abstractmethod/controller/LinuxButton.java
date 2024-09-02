package ec.edu.espe.abstractmethod.controller;

/**
 *
 * @author Marcelo Acuña, LogicLegion, DCCO-ESPE
 */
public class LinuxButton extends Button{

    public LinuxButton() {
        super("Linux button");
    }

    @Override
    public void paint() {
        System.out.println("LinuxButton: " + caption);
    }
    
}
