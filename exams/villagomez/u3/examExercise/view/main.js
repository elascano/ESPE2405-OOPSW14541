import { SortingContext } from '../controller/SortingContext.js';

async function startSorting() {
    const elementsInput = document.getElementById('elements').value;
    const elements = elementsInput.split(',').map(e => parseInt(e.trim())).filter(e => !isNaN(e));

    if (elements.length <= 1) {
        alert('Please enter more than one number.');
        return;
    }

    const sortingContext = new SortingContext();
    const sortedData = sortingContext.sort(elements);
    
    const algorithm = sortingContext.ss.constructor.name;

    const resultText = `Unsorted Data: ${elements.join(', ')}\n` +
                       `Size of Array: ${elements.length}\n` +
                       `Chosen Algorithm: ${algorithm}\n` +
                       `Sorted Data: ${sortedData.join(', ')}`;
    alert(resultText);
    document.getElementById('result').innerText = resultText;

    // Save to MongoDB
    await saveToDatabase({
        unsortedArray: elements,
        size: elements.length,
        algorithm: algorithm,
        sortedArray: sortedData
    });
}

async function saveToDatabase(data) {
    try {
        const response = await fetch('/save', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
        });
        if (!response.ok) throw new Error('Failed to save data');
    } catch (error) {
        console.error('Error saving data:', error);
    }
}
