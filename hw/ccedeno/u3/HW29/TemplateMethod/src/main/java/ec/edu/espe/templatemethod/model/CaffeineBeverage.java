
package ec.edu.espe.templatemethod.model;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public abstract class CaffeineBeverage {
    
    
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) { 
            addCondiments();
        }
    }

    
    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    
    protected abstract void brew();
    protected abstract void addCondiments();

    
    protected boolean customerWantsCondiments() {
        return true; // Las subclases pueden sobrescribir este método si no quieren condimentos
    }
}
