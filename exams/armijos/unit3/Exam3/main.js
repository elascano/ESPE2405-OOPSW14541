async function sortNumbers() {
    const inputNumbers = document.getElementById('inputNumbers').value;

    let numberArray = inputNumbers.split(',').map(num => parseFloat(num.trim()));

    if (numberArray.some(isNaN)) {
        alert('Please enter valid numbers separated by commas.');
        return;
    }

    const sortedNumbers = sortWithStrategy(numberArray);

    document.getElementById('outputNumbers').value = sortedNumbers.join(', ');

    try {
        const response = await fetch('/sort', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                numbers: numberArray,
                sortedNumbers: sortedNumbers
            })
        });

        const data = await response.json();
        console.log(data.message);
    } catch (error) {
        console.error('Error:', error);
    }
}


function sortWithStrategy(numbers) {
    let sortedNumbers;
    const size = numbers.length;

    // Seleccionar el algoritmo de clasificación basado en el tamaño del array
    if (size > 0 && size < 30) {
        sortedNumbers = bubbleSort(numbers);
    } else if (size >= 30 && size < 100) {
        sortedNumbers = insertionSort(numbers);
    } else if (size >= 100) {
        sortedNumbers = quickSort(numbers);
    }

    return sortedNumbers;
}

// Implementación del algoritmo Bubble Sort
function bubbleSort(data) {
    console.log("Using BubbleSort");
    let n = data.length;
    for (let i = 0; i < n - 1; i++) {
        for (let j = 0; j < n - i - 1; j++) {
            if (data[j] > data[j + 1]) {
                let temp = data[j];
                data[j] = data[j + 1];
                data[j + 1] = temp;
            }
        }
    }
    return data;
}

// Implementación del algoritmo Insertion Sort
function insertionSort(data) {
    console.log("Using InsertionSort");
    let n = data.length;
    for (let i = 1; i < n; i++) {
        let key = data[i];
        let j = i - 1;
        while (j >= 0 && data[j] > key) {
            data[j + 1] = data[j];
            j--;
        }
        data[j + 1] = key;
    }
    return data;
}

// Implementación del algoritmo Quick Sort
function quickSort(data) {
    console.log("Using QuickSort");

    function partition(arr, low, high) {
        let pivot = arr[high];
        let i = low - 1;
        for (let j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                [arr[i], arr[j]] = [arr[j], arr[i]];
            }
        }
        [arr[i + 1], arr[high]] = [arr[high], arr[i + 1]];
        return i + 1;
    }

    function quickSortRecursive(arr, low, high) {
        if (low < high) {
            let pi = partition(arr, low, high);
            quickSortRecursive(arr, low, pi - 1);
            quickSortRecursive(arr, pi + 1, high);
        }
    }

    quickSortRecursive(data, 0, data.length - 1);
    return data;
}
