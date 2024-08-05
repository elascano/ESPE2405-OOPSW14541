//import Dinner from "../model/Dinner.js";

document.addEventListener('DOMContentLoaded', function () {
    const yearSelect = document.getElementById('year');
    const monthSelect = document.getElementById('month');
    const daySelect = document.getElementById('day');

    const currentYear = new Date().getFullYear();
    const endYear = 2030;

    for (let year = currentYear; year <= endYear; year++) {
        let option = document.createElement('option');
        option.value = year;
        option.text = year;
        yearSelect.appendChild(option);
    }

    for (let month = 1; month <= 12; month++) {
        let option = document.createElement('option');
        option.value = month;
        option.text = month;
        monthSelect.appendChild(option);
    }

    function populateDays(year, month) {
        daySelect.innerHTML = '';

        const daysInMonth = new Date(year, month, 0).getDate();

        for (let day = 1; day <= daysInMonth; day++) {
            let option = document.createElement('option');
            option.value = day;
            option.text = day;
            daySelect.appendChild(option);
        }
    }

    yearSelect.addEventListener('change', function () {
        populateDays(yearSelect.value, monthSelect.value);
    });

    monthSelect.addEventListener('change', function () {
        populateDays(yearSelect.value, monthSelect.value);
    });

    populateDays(currentYear, 1);
});

document.getElementById('bookButton').addEventListener('click', function () {

    const yearSelect = document.getElementById('year');
    const monthSelect = document.getElementById('month');
    const daySelect = document.getElementById('day');

    const selectedYear = yearSelect.value;
    const selectedMonth = monthSelect.value;
    const selectedDay = daySelect.value;

    const newDay = new Date(selectedYear, selectedMonth - 1, selectedDay);
    const dinner = new Dinner(1516141917, "Maria Diaz", "maria@gmail.com", "Lola", "publicServant", "commensals", 65.0, [
        "2024-06-15T05:00:00.00Z",
        "2024-07-12T05:00:00.00Z",
        "2024-08-11T05:00:00.00Z",
        "2024-09-15T05:00:00.00Z"
        ]);

    dinner.bookADay(newDay)
        .then(() => {
            window.location.href = 'CommensalUI.html';
        })
        .catch((error) => {
            console.error('Error booking the day:', error);
            alert('Error booking the day. Please try again.');
        });
});

document.getElementById('exitButton').addEventListener('click', function () {
    window.location.href = 'CommensalUI.html';
});
