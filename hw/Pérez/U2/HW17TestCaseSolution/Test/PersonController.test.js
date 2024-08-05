import PersonController from '../ec.edu.espe.complexoperations.controller/PersonController.js';

test('computeAgeInDays returns correct age in days', () => {
    const birthDate = '2003-02-22';
    const result = PersonController.computeAgeInDays(birthDate);
    expect(result).toBe(7807); 
});

test('computeAgeInYears returns correct age in years', () => {
    const birthDate = '2003-02-22';
    const result = PersonController.computeAgeInYears(birthDate);
    expect(result).toBe(21); 
});
