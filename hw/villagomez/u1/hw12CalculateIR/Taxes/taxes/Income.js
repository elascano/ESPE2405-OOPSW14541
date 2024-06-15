function computeIR(salary) {
    const anualSalary = salary * 12;
    let irTaxPerYear;

    if (anualSalary >= 0 && anualSalary < 11902) {
        irTaxPerYear = 0;
    } else if (anualSalary >= 11902 && anualSalary < 15159) {
        irTaxPerYear = ((anualSalary - 11902) * 0.05);
    } else if (anualSalary >= 15159 && anualSalary < 19682) {
        irTaxPerYear = (((anualSalary - 15159) * 0.10) + 163);
    } else if (anualSalary >= 19682 && anualSalary < 26031) {
        irTaxPerYear = (((anualSalary - 19682) * 0.12) + 615);
    } else if (anualSalary >= 26031 && anualSalary < 34255) {
        irTaxPerYear = (((anualSalary - 26031) * 0.10) + 1377);
    } else if (anualSalary >= 34255 && anualSalary < 45407) {
        irTaxPerYear = (((anualSalary - 34255) * 0.10) + 2611);
    } else if (anualSalary >= 45407 && anualSalary < 60450) {
        irTaxPerYear = (((anualSalary - 45407) * 0.10) + 4841);
    } else if (anualSalary >= 60450 && anualSalary < 80605) {
        irTaxPerYear = (((anualSalary - 60450) * 0.10) + 8602);
    } else if (anualSalary >= 80605 && anualSalary < 107199) {
        irTaxPerYear = (((anualSalary - 80605) * 0.10) + 14648);
    } else {
        irTaxPerYear = (((anualSalary - 107199) * 0.10) + 23956);
    }

    return irTaxPerYear;
}

module.exports = { computeIR };