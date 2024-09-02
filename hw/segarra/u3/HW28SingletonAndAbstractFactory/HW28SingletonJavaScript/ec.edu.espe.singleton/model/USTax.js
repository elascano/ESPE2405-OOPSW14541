class USTax {
    constructor() {
        if (USTax.instance) {
            return USTax.instance;
        }
        this.taxRate = 0.07; // Example tax rate
        USTax.instance = this;
    }

    calculateTax(amount) {
        return amount * this.taxRate;
    }

    setTaxRate(rate) {
        this.taxRate = rate;
    }
}