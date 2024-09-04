
import CalculatorController from '../controller/CalculatorController.js';

class CalculatorView {
  start() {
    const saleAmount = parseFloat(prompt("Enter sale amount: "));
    const controller = new CalculatorController();
    const total = controller.getTotalSale(saleAmount);
    console.log(`Total sale amount including tax: $${total.toFixed(2)}`);
  }
}

const view = new CalculatorView();
view.start();
