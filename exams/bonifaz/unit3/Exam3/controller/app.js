
import { BubbleSort } from '../model/bubbleSort.js';
import { InsertionSort } from '../model/insertionSort.js';
import { QuickSort } from '../model/quickSort.js';

document.getElementById('sortButton').addEventListener('click', async function() {
    const input = document.getElementById('numberInput').value;
    const algorithm = document.getElementById('algorithmSelect').value;
    const resultDiv = document.getElementById('result');

    let numbers = input.split(',').map(Number);

    if (numbers.some(isNaN)) {
        resultDiv.innerText = 'Please enter valid numbers.';
        return;
    }

    let strategy;

    switch (algorithm) {
        case 'bubble':
            strategy = new BubbleSort();
            break;
        case 'insertion':
            strategy = new InsertionSort();
            break;
        case 'quick':
            strategy = new QuickSort();
            break;
        default:
            resultDiv.innerText = 'Unknown sorting algorithm.';
            return;
    }

    let sortedNumbers = strategy.sort(numbers);


    resultDiv.innerText = `Sorted Numbers: ${sortedNumbers.join(', ')}`;


    try {
        const response = await fetch('/api/sort', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({
                unsorted: input,
                size: numbers.length,
                sortAlgorithm: algorithm,
                sorted: sortedNumbers.join(',')
            })
        });

        if (!response.ok) throw new Error('Network response was not ok');

        console.log('Document inserted successfully');
    } catch (error) {
        console.error('Error inserting document:', error);
    }
});
