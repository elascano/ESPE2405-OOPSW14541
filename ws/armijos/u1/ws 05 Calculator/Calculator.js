function calculateTableOfTwo() {
    const tableOfTwo = [];
    for (let i = 1; i <= 10; i++) {
        tableOfTwo.push(`2 x ${i} = ${2 * i}`);
    }
    return tableOfTwo;
}

function displayTableOfTwo() {
    const table = calculateTableOfTwo();
    table.forEach(row => console.log(row));
}

displayTableOfTwo();
