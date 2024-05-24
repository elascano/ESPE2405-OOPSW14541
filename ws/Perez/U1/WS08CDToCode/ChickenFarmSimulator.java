package chickenfarmsimulator;

/**
 *
 * @author Carlos Pérez, The Javas, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello chickens from Carlos Perez");
        Chicken chicken = new Chicken(args);
        System.out.println("Chicken --> \n" + chicken);
        int id=2;
        String name="Maruja";
        String color="black";
        int age=1;
        boolean molting = false;
        Date bornOnDate = new Date();
    }
    
}
