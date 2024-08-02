
package ec.edu.espe.zoo.model;


/**
 *
 * @author Marcelo Acuña, LogicLegion, DCCO-ESPE 
 *
 */
public abstract class Animal {

    public abstract void Feed(int food);
    
    public void register(){
        System.out.println("Registerin the animal"+this.getClass().getSimpleName());
    }
    
}