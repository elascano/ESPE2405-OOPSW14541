export class QuickSort {
    sort(array) {
        this.quickSort(array, 0, array.length - 1);
        return array;
    }

    quickSort(array, low, high) {
        if (low < high) {
            let pi = this.partition(array, low, high);
            this.quickSort(array, low, pi - 1);
            this.quickSort(array, pi + 1, high);
        }
    }

    partition(array, low, high) {
        let pivot = array[high];
        let i = low - 1;
        for (let j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                [array[i], array[j]] = [array[j], array[i]]; // Swap
            }
        }
        [array[i + 1], array[high]] = [array[high], array[i + 1]]; // Swap
        return i + 1;
    }
}
