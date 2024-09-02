class QuickSort {
    sort(arr) {
        if (arr.length <= 1) return arr;

        let pivot = arr[Math.floor(arr.length / 2)];
        let left = arr.filter(x => x < pivot);
        let right = arr.filter(x => x > pivot);
        let middle = arr.filter(x => x === pivot);

        return [...this.sort(left), ...middle, ...this.sort(right)];
    }
}

export default QuickSort;
