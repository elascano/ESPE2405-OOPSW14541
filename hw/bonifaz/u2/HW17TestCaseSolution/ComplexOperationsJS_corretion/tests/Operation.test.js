const Operation = require('../ec.edu.espe.complexoperations.controler/Operation');

test('addTwoNumbers', () => {
    const addend1 = 1;
    const addend2 = 2;
    const expResult = 3.0;
    const result = Operation.addTwoNumbers(addend1, addend2);
    expect(result).toBeCloseTo(expResult, 1);
});

test('addTwoNumbersOneNegative', () => {
    const addend1 = 1.8;
    const addend2 = -2.4;
    const expResult = -0.6;
    const result = Operation.addTwoNumbers(addend1, addend2);
    expect(result).toBeCloseTo(expResult, 1); 
});
