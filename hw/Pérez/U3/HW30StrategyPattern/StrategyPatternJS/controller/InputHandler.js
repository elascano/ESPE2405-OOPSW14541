import { SortingApp } from './SortingApp.js';
import { SortingController } from './SortingController.js';

export class InputHandler {
    sortAndDisplay() {
        const numbers = [3, 5, 1, 4, 2];  // Simulación de entrada de usuario
        const app = new SortingApp();
        const controller = new SortingController();

        controller.sortAndDisplay(numbers, app);
    }
}
