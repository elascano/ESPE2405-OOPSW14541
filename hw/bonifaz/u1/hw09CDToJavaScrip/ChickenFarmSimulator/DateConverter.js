export class DateConverter {
    static convertToDate(dateString) {
        const formatter = new Intl.DateTimeFormat('en-US', { year: 'numeric', month: '2-digit', day: '2-digit' });
        const parts = dateString.split('/');
        const formattedDate = new Date(parts[2], parts[1] - 1, parts[0]);
        
        if (isNaN(formattedDate.getTime())) {
            console.log("Invalid date format, use dd/MM/yyyy.");
            return null;
        } else {
            return formattedDate;
        }
    }
}

export default DateConverter; // Línea de exportación
