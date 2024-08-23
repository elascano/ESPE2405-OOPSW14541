package ec.edu.espe.beverageapp.controller;

/**
 *
 * @author Saray Cañarte
 */
public abstract class CoffeeinBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (wantsCondiments()) {
            addCondiments();
        }
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void brew();

    abstract void addCondiments();

    boolean wantsCondiments() {
        return true;
    }
}
