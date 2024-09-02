export class InsertionSort {
    sort(numbers) {
        const n = numbers.length;
        for (let i = 1; i < n; ++i) {
            let key = numbers[i];
            let j = i - 1;

            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
    }

    getStrategyName() {
        return "Insertion Sort";
    }
}
