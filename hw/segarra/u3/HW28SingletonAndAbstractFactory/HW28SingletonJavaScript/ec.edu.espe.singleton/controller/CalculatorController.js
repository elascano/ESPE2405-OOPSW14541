class CalculatorController {
    constructor(model, view) {
        this.model = model;
        this.view = view;
    }

    calculateTotalWithTax(amount) {
        const tax = this.model.calculateTax(amount);
        const total = amount + tax;
        this.view.displayTotal(total);
    }
}