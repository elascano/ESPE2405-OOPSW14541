export class CaffeineBeverage {
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

    brew() {
        throw new Error("This method should be overridden");
    }

    pourInCup() {
        console.log("Pouring into cup");
    }

    addCondiments() {
        throw new Error("This method should be overridden");
    }

    wantsCondiments() {
        throw new Error("This method should be overridden");
    }
}
