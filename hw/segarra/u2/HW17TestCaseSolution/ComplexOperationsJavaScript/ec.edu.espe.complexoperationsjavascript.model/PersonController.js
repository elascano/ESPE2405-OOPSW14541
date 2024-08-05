const { differenceInDays, differenceInYears } = require('date-fns');

function computeAgeInDays(birthDate) {
    const today = new Date(2024, 7, 11, 0, 1);
    const [day, month, year] = birthDate.split('-').map(Number);
    const birth = new Date(year, month - 1, day, 0, 1);
    return differenceInDays(today, birth);
}

function computeAgeInYears(birthDate) {
    const today = new Date(2024, 7, 11, 0, 1);
    const [day, month, year] = birthDate.split('-').map(Number);
    const birth = new Date(year, month - 1, day, 0, 1);
    return differenceInYears(today, birth);
}

module.exports = computeAgeInDays
module.exports = computeAgeInYears