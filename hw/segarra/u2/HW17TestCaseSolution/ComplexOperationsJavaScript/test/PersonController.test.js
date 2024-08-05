const { computeAgeInDays, computeAgeInYears } = require('../ec.edu.espe.complexoperationsjavascript.model/PersonController.js');

test('computes age in days correctly', () => {
    const birthDate = '31-01-2004';
    const result = computeAgeInDays(birthDate);
    expect(result).toBeGreaterThan(0);
});

test('computes age in years correctly', () => {
    const birthDate = '31-01-2004';
    const result = computeAgeInYears(birthDate);
    expect(result).toBe(20);
});
