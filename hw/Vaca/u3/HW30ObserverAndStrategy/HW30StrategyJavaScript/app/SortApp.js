import { SortController } from './controller/SortController.js';
import { SortModel } from './model/SortModel.js';
import { SortView } from './view/SortView.js';

class SortApp {
    static main() {
        const view = new SortView();
        const numbers = view.getInputNumbers();

        const model = new SortModel(numbers);
        const controller = new SortController(model, view);

        controller.sortNumbers();
    }
}

SortApp.main();
