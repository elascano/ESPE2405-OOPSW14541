package ec.edu.espe.guifactory.controller;

/**
 *
 * @author Nahomi Cedeño, Code Creators, DCCO-ESPE
 */
public class LinuxButton extends Button {
    @Override
    public void paint() {
        System.out.println("I'm a LinuxButton " + caption);
    }
}
