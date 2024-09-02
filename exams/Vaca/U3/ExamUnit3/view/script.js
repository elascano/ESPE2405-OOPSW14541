const SortingContext = require('../controller/SortingContext');

function sortArray() {
    const arrayInput = document.getElementById('arrayInput').value;
    const array = arrayInput.split(',').map(Number);

    const context = new SortingContext();
    const { sortedArray, sortType } = context.sort(array);

    document.getElementById('result').innerHTML = `
        Sorted Array: ${sortedArray}<br>
        Sorting Algorithm Used: ${sortType}
    `;
}
