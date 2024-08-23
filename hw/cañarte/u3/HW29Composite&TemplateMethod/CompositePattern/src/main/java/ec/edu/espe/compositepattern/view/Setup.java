package ec.edu.espe.compositepattern.view;
import ec.edu.espe.compositepattern.controller.*;

/**
 *
 * @author Saray Cañarte
 */
public class Setup {
    
    public static void main(String[] args) {
        Teller tommy = new Teller("Tommy");
        Clerk carl = new Clerk("Carl");
        Manager able = new Manager("Able");
        able.add(carl);
        able.add(tommy);

        Teller juanita = new Teller("Juanita");
        Teller therma = new Teller("Therma");
        Manager becky = new Manager("Becky");
        becky.add(juanita);
        becky.add(therma);


        President pete = President.getPresident("Pete");
        pete.add(able);
        pete.add(becky);

        // Initiate client
        Client.employee = pete;
        Client.doClientTasks();
    }
}

