class QuickSort {
    sort(data) {
        if (data.length <= 1) {
            return data;
        }
        let pivot = data[Math.floor(data.length / 2)];
        let left = data.filter(x => x < pivot);
        let middle = data.filter(x => x === pivot);
        let right = data.filter(x => x > pivot);
        return [...this.sort(left), ...middle, ...this.sort(right)];
    }
}