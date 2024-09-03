class CaffeineBeverage {
    prepareRecipe() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        if (this.customerWantsCondiments()) {
            this.addCondiments();
        }
    }

    boilWater() {
        console.log("Boiling water");
    }

    pourInCup() {
        console.log("Pouring into cup");
    }

    brew() {
        throw new Error("This method must be overridden!");
    }

    addCondiments() {
        throw new Error("This method must be overridden!");
    }

    customerWantsCondiments() {
        return true; 
    }
}
