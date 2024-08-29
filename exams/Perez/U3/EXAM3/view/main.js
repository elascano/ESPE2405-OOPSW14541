import BubbleSort from '../controller/BubbleSort.js';
import QuickSort from '../controller/QuickSort.js';
import InsertionSort from '../controller/InsertionSort.js';
import SortingStrategy from '../controller/SortingStrategy.js';

document.getElementById('sortButton').addEventListener('click', function() {
    const input = document.getElementById('arrayInput').value;
    const arr = input.split(',').map(Number);

    const strategy = new SortingStrategy();

    if (arr.length < 2) {
        alert("El array debe contener más de 1 elemento");
        return;
    } else if (arr.length <= 5) {
        strategy.setStrategy(new BubbleSort());
    } else if (arr.length <= 10) {
        strategy.setStrategy(new InsertionSort());
    } else {
        strategy.setStrategy(new QuickSort());
    }

    const sortedArr = strategy.sort(arr);
    document.getElementById('sortedArray').innerText = sortedArr.join(', ');
});
