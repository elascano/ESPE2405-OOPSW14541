
import USTax from '../model/USTax.js';

class CalculatorController {
  getTotalSale(saleAmount) {
    const tax = new USTax();
    return saleAmount + tax.calculateTax(saleAmount);
  }
}

export default CalculatorController;
