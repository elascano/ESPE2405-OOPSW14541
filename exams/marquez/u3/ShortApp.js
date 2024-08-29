document.getElementById('sortButton').addEventListener('click', () => {
    const input = document.getElementById('inputArray').value;
    const arr = input.split(',').map(Number);

    if (arr.length <= 1) {
        alert("Introducir al menos dos números para ordenar.");
        return;
    }

    const context = new SortingContext();
    let selectedAlgorithm = "";

    if (arr.length >= 2 && arr.length <= 5) {
        context.setStrategy(new BubbleSort());
        selectedAlgorithm = "BubbleSort";
    } else if (arr.length >= 6 && arr.length <= 10) {
        context.setStrategy(new InsertionSort());
        selectedAlgorithm = "InsertionSort";
    } else {
        context.setStrategy(new QuickSort());
        selectedAlgorithm = "QuickSort";
    }

    const sortedArray = context.sortArray(arr);

    document.getElementById('result').innerText = `Original: ${input}\nOrdenado: ${sortedArray.join(', ')}\nAlgoritmo: ${selectedAlgorithm}`;

    saveToDatabase(input, arr.length, selectedAlgorithm, sortedArray.join(', '));
});

function saveToDatabase(unsorted, size, algorithm, sorted) {
    const data = {
        unsorted: unsorted,
        size: size,
        algorithm: algorithm,
        sorted: sorted
    };

    fetch('mongodb+srv://Jenni:Jenni@cluster0.tjpvdfr.mongodb.net/', {
        method: 'POST',
        body: JSON.stringify({
            collection: 'ordenar', 
            database: 'Quizz_Strategy', 
            document: data
        })
    })
    .then(response => response.json())
    .then(data => console.log('Guardado con éxito:', data))
    .catch(error => console.error('Error:', error));
}

