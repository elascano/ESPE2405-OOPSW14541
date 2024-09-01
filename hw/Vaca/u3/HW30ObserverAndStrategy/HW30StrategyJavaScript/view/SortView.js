export class SortView {
    getInputNumbers() {
        const input = prompt("Enter the number of elements:");
        const n = parseInt(input);
        const numbers = [];

        for (let i = 0; i < n; i++) {
            const element = parseInt(prompt(`Enter element ${i + 1}:`));
            numbers.push(element);
        }

        return numbers;
    }

    displaySortedNumbers(numbers, strategy) {
        console.log(`Sorted using ${strategy}:`);
        console.log(numbers.join(" "));
    }
}
