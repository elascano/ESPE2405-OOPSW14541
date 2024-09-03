import { SortingContext } from './sortingContext.js';
import { BubbleSort } from '../controller/BubbleSort.js';
import { InsertionSort } from '../controller/InsertionSort.js';
import { QuickSort } from '../controller/QuickSort.js';

const sortingContext = new SortingContext();
const bubbleSort = new BubbleSort();
const insertionSort = new InsertionSort();
const quickSort = new QuickSort();

document.addEventListener('DOMContentLoaded', () => {
  document.getElementById('sortButton').addEventListener('click', sortArray);
});

function sortArray() {
  const input = document.getElementById('arrayInput').value;
  const arr = input.split(',').map(Number);
  const size = arr.length;

  if (size <= 1) {
    alert('Array must have more than 1 element.');
    return;
  }

  let chosenAlgorithm;
  if (size >= 2 && size <= 5) {
    sortingContext.setSortStrategy(bubbleSort);
    chosenAlgorithm = 'BubbleSort';
  } else if (size >= 6 && size <= 10) {
    sortingContext.setSortStrategy(insertionSort);
    chosenAlgorithm = 'InsertionSort';
  } else {
    sortingContext.setSortStrategy(quickSort);
    chosenAlgorithm = 'QuickSort';
  }

  const sortedArray = sortingContext.sort(arr);
  displayResult(input, size, chosenAlgorithm, sortedArray);
  saveToBackend(input, size, chosenAlgorithm, sortedArray);
}

function displayResult(unsorted, size, algorithm, sorted) {
  const resultDiv = document.getElementById('result');
  resultDiv.innerHTML = `
    <p>Unsorted Array: ${unsorted}</p>
    <p>Size: ${size}</p>
    <p>Algorithm: ${algorithm}</p>
    <p>Sorted Array: ${sorted.join(', ')}</p>
  `;
  alert(`Unsorted Array: ${unsorted}\nSize: ${size}\nAlgorithm: ${algorithm}\nSorted Array: ${sorted.join(', ')}`);
}

async function saveToBackend(unsorted, size, algorithm, sorted) {
  const data = {
    unsorted: unsorted,
    size: size,
    sortAlgorithm: algorithm,
    sorted: sorted.join(', ')
  };

  try {
    const response = await fetch('/save', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(data)
    });
    const result = await response.json();
    console.log('Saved to backend:', result);
  } catch (error) {
    console.error('Error saving to backend:', error);
  }
}

