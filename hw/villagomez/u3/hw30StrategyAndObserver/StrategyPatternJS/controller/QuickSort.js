export class QuickSort {
    sort(data) {
        return this.quicksort(data, 0, data.length - 1);
    }

    quicksort(array, left, right) {
        if (left >= right) {
            return array;
        }

        const pivotIndex = left;
        let i = left;
        let j = right;
        let temp;

        while (i < j) {
            while (i < j && array[j] >= array[pivotIndex]) {
                j--;
            }
            while (i < j && array[i] < array[pivotIndex]) {
                i++;
            }
            if (i < j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        temp = array[pivotIndex];
        array[pivotIndex] = array[i];
        array[i] = temp;

        this.quicksort(array, left, i - 1);
        this.quicksort(array, i + 1, right);

        return array;
    }
}
