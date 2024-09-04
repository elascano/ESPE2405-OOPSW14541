import { CaffeineBeverage } from './CaffeineBeverage.js';

export class Coffee extends CaffeineBeverage {
    brew() {
        console.log("Dripping coffee through filter");
    }

    addCondiments() {
        console.log("Adding sugar and milk");
    }

    wantsCondiments() {
        const answer = this.getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    getUserInput() {
        const answer = "n"; // Simulación de entrada de usuario
        console.log("Would you like milk and sugar with your coffee (y/n)?");
        return answer;
    }
}
