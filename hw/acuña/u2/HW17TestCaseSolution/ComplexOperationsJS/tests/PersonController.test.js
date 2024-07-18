const PersonController = require('../ec.edu.espe.complexoperations.controler/PersonController');

test('computeAgeInDays', () => {
    const birthDate = new Date("2001-08-07");
    const expResult = 8373; // La edad exacta puede variar ligeramente debido a diferencias en el cálculo exacto de días
    const result = PersonController.computeAgeInDays(birthDate);
    expect(result).toEqual(expResult);
});

test('computeAgeInYears', () => {
    const birthDate = new Date("2001-08-07");
    const expResult = 22;
    const result = PersonController.computeAgeInYears(birthDate);
    expect(result).toEqual(expResult);
});
