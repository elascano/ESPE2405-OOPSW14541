const PersonController = require('../ec.edu.espe.complexoperations.controler/PersonController');

test('computeAgeInDays', () => {
    const birthDate = new Date("2001-11-13");
    const expResult = 8274; 
    const result = PersonController.computeAgeInDays(birthDate);
    expect(result).toEqual(expResult);
});

test('computeAgeInYears', () => {
    const birthDate = new Date("2001-11-13");
    const expResult = 22;
    const result = PersonController.computeAgeInYears(birthDate);
    expect(result).toEqual(expResult);
});
