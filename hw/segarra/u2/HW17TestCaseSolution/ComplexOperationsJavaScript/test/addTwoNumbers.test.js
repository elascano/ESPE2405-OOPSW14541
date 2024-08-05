const addTwoNumbers = require("./Operation");

test('testAddTwoNumbers', () => {
    expect(addTwoNumbers(1, 2)).toBe(3.0);
});

test('testAddOneNegativeNumberAndOnePositive1', () => {
    expect(addTwoNumbers(1.2, -2.3)).toBe(-1.1);
});

test('testAddOneNegativeNumberAndOnePositive2', () => {
    expect(addTwoNumbers(5.4, -3.6)).toBe(1.8);
});

test('testAddOneNegativeNumberAndOnePositive3', () => {
    expect(addTwoNumbers(-6.2, 7.7)).toBe(1.5);
});

test('testAddTwoNegativeNumbers1', () => {
    expect(addTwoNumbers(-0.9, -5.1)).toBe(-6.0);
});

test('testAddTwoNegativeNumbers2', () => {
    expect(addTwoNumbers(-16.3, -1.8)).toBe(-18.1);
});

test('testAddTwoNegativeNumbers3', () => {
    expect(addTwoNumbers(-16.2, -5.9)).toBe(-22.1);
});

test('testAddTwoPositiveNumbers1', () => {
    expect(addTwoNumbers(3.2, 5.3)).toBe(8.5);
});

test('testAddTwoPositiveNumbers2', () => {
    expect(addTwoNumbers(1.2, 2.3)).toBe(3.5);
});

test('testAddTwoPositiveNumbers3', () => {
    expect(addTwoNumbers(10.2, 0.3)).toBe(10.5);
});
