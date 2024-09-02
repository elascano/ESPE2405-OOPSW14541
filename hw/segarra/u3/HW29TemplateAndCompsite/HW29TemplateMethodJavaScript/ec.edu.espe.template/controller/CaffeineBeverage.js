class CaffeineBeverage {
    prepareRecipe() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        if (this.wantsCondiments()) {
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
        throw new Error("This method should be overridden!");
    }

    addCondiments() {
        throw new Error("This method should be overridden!");
    }

    wantsCondiments() {
        return true;
    }
}