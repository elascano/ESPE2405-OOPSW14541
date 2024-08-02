import { Operation } from '../ec.edu.espe.complexoperations.controller/Operation.js';


test('addTwoNumbers adds positive numbers', () => {
    const addend1 = 4.09;
    const addend2 = 3.2;
    const result = Operation.addTwoNumbers(addend1, addend2);
    expect(result).toBeCloseTo(7.29);
});

test('addTwoNumbers adds one negative number and one positive', () => {
    const addend1 = 1.2;
    const addend2 = -2.3;
    const result = Operation.addTwoNumbers(addend1, addend2);
    expect(result).toBeCloseTo(-1.1);
});