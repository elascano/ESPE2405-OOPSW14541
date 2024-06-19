import { DateTimeFormatter, LocalDate, Period } from 'js-joda';

export class AgeCalculator {
    static AgeCalculator(bornOnDate) {
        const formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            const birthDate = LocalDate.parse(bornOnDate, formatter);
            const currentDate = LocalDate.now();
            return Period.between(birthDate, currentDate).years();
        } catch (error) {
            console.log("Invalid date format");
            return -1;
        }
    }
}

export default AgeCalculator; // Línea de exportación

