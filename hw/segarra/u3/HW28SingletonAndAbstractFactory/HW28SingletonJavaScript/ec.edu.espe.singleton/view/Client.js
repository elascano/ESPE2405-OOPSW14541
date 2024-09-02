const ustaxModel = new USTax();
const calculatorView = new CalculatorView();
const calculatorController = new CalculatorController(ustaxModel, calculatorView);

// Example of calculation
calculatorController.calculateTotalWithTax(100);