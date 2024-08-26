package ec.edu.espe.templatemethod.model;

/**
 *
 * @author Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourlnCup();
        if (wantsCondiments()) {
            addCondiments();
        }
    }
    
    void boilWater(){
        System.out.println("Boiling water");
    }
    
    abstract void brew();
    
    void pourlnCup(){
        System.out.println("Pourling into cup");
    }
    
    abstract void addCondiments();
    
    abstract boolean wantsCondiments();
}
