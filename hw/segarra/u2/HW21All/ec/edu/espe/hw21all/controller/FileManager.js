import fs from 'fs';

export default class FileManager {
    static saveDinners(dinnersList) {
        return new Promise((resolve, reject) => {
            fs.writeFile('dinners.json', JSON.stringify(dinnersList, null, 2), (err) => {
                if (err) {
                    reject(err);
                } else {
                    resolve();
                }
            });
        });
    }
    
    static saveDayList(bookDaysList) {
        return new Promise((resolve, reject) => {
            fs.writeFile('reservedDays.json', JSON.stringify(bookDaysList, null, 2), (err) => {
                if (err) {
                    reject(err);
                } else {
                    resolve();
                }
            });
        });
    }

    static loadDinners(dinnersList) {
        return new Promise((resolve, reject) => {
            fs.readFile('dinners.json', 'utf8', (err, data) => {
                if (err) {
                    if (err.code === 'ENOENT') {
                        resolve();
                    } else {
                        reject(err);
                    }
                } else {
                    try {
                        const loadedData = JSON.parse(data);
                        dinnersList.push(...loadedData);
                        resolve();
                    } catch (parseErr) {
                        reject(parseErr);
                    }
                }
            });
        });
    }

    static loadDayList(bookDaysList) {
        return new Promise((resolve, reject) => {
            fs.readFile('reservedDays.json', 'utf8', (err, data) => {
                if (err) {
                    if (err.code === 'ENOENT') {
                        resolve();
                    } else {
                        reject(err);
                    }
                } else {
                    try {
                        const loadedData = JSON.parse(data);
                        bookDaysList.push(...loadedData);
                        resolve();
                    } catch (parseErr) {
                        reject(parseErr);
                    }
                }
            });
        });
    }

    static theBookDayIsAlreadyBooked(bookDaysList, newBookDay) {
        return bookDaysList.includes(newBookDay);
    }

    static updateAccountBalance(balance, priceOfTheBook) {
        return balance - priceOfTheBook;
    }
}