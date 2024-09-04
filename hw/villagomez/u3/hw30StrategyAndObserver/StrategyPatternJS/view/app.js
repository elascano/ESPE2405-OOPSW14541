import { BubbleSort } from './controller/BubbleSort.js';
import { InsertionSort } from './controller/InsertionSort.js';
import { QuickSort } from './controller/QuickSort.js';

class SortingApp {
    constructor() {
        this.sortingMethods = {
            'BubbleSort': new BubbleSort(),
            'InsertionSort': new InsertionSort(),
            'QuickSort': new QuickSort()
        };

        // Set the default sorting method here
        this.defaultSortMethod = 'BubbleSort';
    }

    // Method to handle the sorting operation
    sortAndDisplay() {
        const inputElement = document.getElementById('inputNumbers');
        const outputElement = document.getElementById('outputNumbers');

        const numbers = this.parseInput(inputElement.value);
        if (!numbers) {
            outputElement.textContent = 'Invalid input.';
            return;
        }

        // Choose sorting method automatically
        const sorter = this.sortingMethods[this.defaultSortMethod];
        const sortedNumbers = sorter.sort(numbers);

        // Display the sorted numbers
        outputElement.textContent = `Sorted numbers using ${this.defaultSortMethod}: ${sortedNumbers.join(', ')}`;
    }

    // Method to parse the input into an array of numbers
    parseInput(input) {
        return input.split(',').map(num => {
            const parsed = parseInt(num.trim(), 10);
            return isNaN(parsed) ? null : parsed;
        }).filter(num => num !== null);
    }
}

// Initialize and use the app
const app = new SortingApp();
document.getElementById('sortButton').addEventListener('click', () => app.sortAndDisplay());
