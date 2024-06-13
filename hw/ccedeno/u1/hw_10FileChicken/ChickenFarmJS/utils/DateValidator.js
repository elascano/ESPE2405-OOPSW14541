const readline = require('readline');
const { DateTime } = require('luxon');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

class DateValidator {

    static async getValidDate() {
        let year, month, day;
        
        while (true) {
            try {
                year = await this.askQuestion("Enter the born year of the chicken: ");
                year = parseInt(year);
                if (isNaN(year) || year > DateTime.now().year) {
                    throw new Error("The year can't be higher than the current year.");
                }
                break;
            } catch (e) {
                console.log(e.message);
            }
        }
        
        while (true) {
            try {
                month = await this.askQuestion("Enter the born month of the chicken (1-12): ");
                month = parseInt(month);
                if (isNaN(month) || month < 1 || month > 12) {
                    throw new Error("The number of the month has to be between 1 and 12.");
                }
                break;
            } catch (e) {
                console.log(e.message);
            }
        }
        
        while (true) {
            try {
                day = await this.askQuestion("Enter the born day of the chicken: ");
                day = parseInt(day);

                if (isNaN(day)) {
                    throw new Error("Invalid entry. Please type an entire number for the day.");
                }

                if ([1, 3, 5, 7, 8, 10, 12].includes(month) && (day < 1 || day > 31)) {
                    throw new Error("The number of the day has to be between 1 and 31.");
                } else if ([4, 6, 9, 11].includes(month) && (day < 1 || day > 30)) {
                    throw new Error("The number of the day has to be between 1 and 30.");
                } else if (month === 2 && (day < 1 || day > 29)) {
                    throw new Error("The number of the day has to be between 1 and 29.");
                }

                const birthDate = DateTime.local(year, month, day);
                return birthDate.toISODate(); // Returns date in ISO format (YYYY-MM-DD)
            } catch (e) {
                console.log(e.message);
            }
        }
    }

    static async getValidOption() {
        while (true) {
            try {
                const option = await this.askQuestion("In what type of file you want to save this data?\n1 for TXT \n2 for CSV \n3 for JSON\n");
                const parsedOption = parseInt(option);
                if (isNaN(parsedOption) || parsedOption < 1 || parsedOption > 3) {
                    throw new Error("The option can't be lower than 1 or higher than 3.");
                }
                return parsedOption;
            } catch (e) {
                console.log(e.message);
            }
        }
    }

    static askQuestion(query) {
        return new Promise(resolve => rl.question(query, resolve));
    }
}
module.exports = DateValidator