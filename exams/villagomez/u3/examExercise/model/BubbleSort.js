export class BubbleSort {
    sort(array) {
        let n = array.length;
        let swapped;
        for (let i = 0; i < n - 1; i++) {
            swapped = false;
            for (let j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    [array[j], array[j + 1]] = [array[j + 1], array[j]]; // Swap
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return array;
    }
}
