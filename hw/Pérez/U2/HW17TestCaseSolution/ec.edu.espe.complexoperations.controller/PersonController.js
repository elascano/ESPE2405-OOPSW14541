import { differenceInYears, differenceInMonths, differenceInDays } from 'date-fns';

class PersonController {
    static computeAgeInDays(birthDate) {
        const today = new Date();
        const birthDateObj = new Date(birthDate);

        const numberOfDaysOfYears = differenceInYears(today, birthDateObj) * 365;
        const numberOfDaysOfMonths = differenceInMonths(today, birthDateObj) % 12 * 30;
        const numberOfDays = differenceInDays(today, birthDateObj) % 30;

        const days = numberOfDaysOfYears + numberOfDaysOfMonths + numberOfDays;
        return days;
    }

    static computeAgeInYears(birthDate) {
        const today = new Date();
        const birthDateObj = new Date(birthDate);
        const numberOfDaysOfYears = differenceInYears(today, birthDateObj);
        return numberOfDaysOfYears;
    }
}

export default PersonController;
