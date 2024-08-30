package ec.edu.espe.abstractmethod.controller;

/**
 *
 * @author Marcelo Acuña, LogicLegion, DCCO-ESPE
 */
public class MacButton extends Button{

    public MacButton() {
        super("MacOS button");
    }

    @Override
    public void paint() {
        System.out.println("MacOSButton: " + caption);
    }
    
}
