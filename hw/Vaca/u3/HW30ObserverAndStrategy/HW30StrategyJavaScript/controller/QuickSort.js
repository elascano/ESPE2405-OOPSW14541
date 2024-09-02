export class QuickSort {
    sort(numbers) {
        this.quickSort(numbers, 0, numbers.length - 1);
    }

    quickSort(array, low, high) {
        if (low < high) {
            const pivotIndex = this.partition(array, low, high);
            this.quickSort(array, low, pivotIndex - 1);
            this.quickSort(array, pivotIndex + 1, high);
        }
    }

    partition(array, low, high) {
        const pivot = array[high];
        let i = low - 1;
        for (let j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                [array[i], array[j]] = [array[j], array[i]];
            }
        }
        [array[i + 1], array[high]] = [array[high], array[i + 1]];
        return i + 1;
    }

    getStrategyName() {
        return "Quick Sort";
    }
}
