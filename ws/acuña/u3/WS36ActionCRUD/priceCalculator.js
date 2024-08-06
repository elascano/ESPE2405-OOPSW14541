class PriceCalculator {
    constructor() {}

    calculatePrice(year) {
        const currentYear = new Date().getFullYear();
        const vehicleYear = parseInt(year);
        const age = currentYear - vehicleYear;
        const basePrice = 20000;
        const depreciationRate = 0.05;
        const price = basePrice * Math.pow((1 - depreciationRate), age);
        return Math.max(price, 1000);
    }
}

module.exports = PriceCalculator;
