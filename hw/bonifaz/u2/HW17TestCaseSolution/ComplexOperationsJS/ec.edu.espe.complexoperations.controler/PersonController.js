const { differenceInDays, differenceInYears } = require('date-fns');

module.exports = {
    computeAgeInDays: function (birthDate) {
        const today = new Date();
        const birth = new Date(birthDate);
        const oneDay = 1000 * 60 * 60 * 24;
        const diffTime = today.getTime() - birth.getTime();
        const days = Math.floor(diffTime / oneDay);
        return days;
    },
    computeAgeInYears: function (birthDate) {
        const today = new Date();
        const birth = new Date(birthDate);
        let age = today.getFullYear() - birth.getFullYear();
        const m = today.getMonth() - birth.getMonth();
        if (m < 0 || (m === 0 && today.getDate() < birth.getDate())) {
            age--;
        }
        return age;
    }
};
