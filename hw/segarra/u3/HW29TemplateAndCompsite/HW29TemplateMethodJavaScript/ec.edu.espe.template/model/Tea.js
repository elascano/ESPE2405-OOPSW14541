class Tea extends CaffeineBeverage {
    brew() {
        console.log("Steeping the tea");
    }

    addCondiments() {
        console.log("Adding lemon");
    }

    wantsCondiments() {
        return true;
    }
}