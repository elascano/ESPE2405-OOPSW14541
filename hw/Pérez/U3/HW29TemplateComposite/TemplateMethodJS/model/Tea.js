import { CaffeineBeverage } from './CaffeineBeverage.js';

export class Tea extends CaffeineBeverage {
    brew() {
        console.log("Steeping the tea");
    }

    addCondiments() {
        console.log("Adding lemon");
    }

    wantsCondiments() {
        const answer = this.getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    getUserInput() {
        const answer = "y"; // Simulación de entrada de usuario
        console.log("Would you like lemon with your tea (y/n)?");
        return answer;
    }
}
