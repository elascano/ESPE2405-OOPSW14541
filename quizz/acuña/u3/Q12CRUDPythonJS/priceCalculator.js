class PriceCalculator {
    constructor() {}

    calculatePrice(year) {
        const currentYear = new Date().getFullYear();
        const vehicleYear = parseInt(year);
        const age = currentYear - vehicleYear;
        const basePrice = 500;
        const depreciationRate = 0.05;
        const price = basePrice * Math.pow((1 - depreciationRate), age);
        return Math.max(price, 100);
    }
}

module.exports = PriceCalculator;
