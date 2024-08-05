module.exports = {
    addTwoNumbers: function (addend1, addend2) {
        let sum = addend1 + addend2;
        // Round to 2 decimal places
        sum = Math.round((sum + Number.EPSILON) * 100) / 100;
        return sum;
    }
};
