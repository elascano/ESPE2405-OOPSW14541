const { updateAccountBalance, theBookDayIsAlreadyBooked, saveDinners: saveDayList, loadDinners } = require('../controller/FileManager.js');

export default class Commensal {
    constructor(id, name, email, password, grade, type, balance, bookedDays) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.grade = grade;
        this.type = type;
        this.balance = balance;
        this.bookedDays = bookedDays;
    }

    bookADay(newDay) {
        let bookDays = [];

        loadDinners(bookDays);

        const bookDaysList = bookDays.map(bookDay => bookDay.bookedDays);

        if (!theBookDayIsAlreadyBooked(bookDaysList, newDay)) {
            bookDaysList.push(newDay);
            saveDayList(bookDaysList);
            alert('The booking of your day was succesfull');
        } else {
            alert('The day is already booked');
        }
    }

    unbookADay(dayToUnbook) {
        let bookDays = [];
        let newBookDayList = [];

        loadDinners(bookDays);

        const bookDaysList = bookDays.map(bookDay => bookDay.bookedDays);

        if (theBookDayIsAlreadyBooked(bookDaysList, dayToUnbook)) {
            newBookDayList = bookDaysList.filter(day => day !== dayToUnbook);
            saveDayList(newBookDayList);
            alert('The unbooking of your day was succesfull');
        } else {
            alert('The day is not booked yet');
        }
    }

    reduceBalanceAccount() {
        const priceOfTheBook = 7.5;
        const newAccountBalance = updateAccountBalance(this.balance, priceOfTheBook);
        this.balance = newAccountBalance;
    }
}
