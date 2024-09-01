const SortingStrategy = require('./SortingStrategy');

class QuickSort extends SortingStrategy {
    sort(array) {
        if (array.length <= 1) {
            return array;
        }
        let pivot = array[Math.floor(array.length / 2)];
        let left = [];
        let right = [];
        let equal = [];

        for (let num of array) {
            if (num < pivot) left.push(num);
            else if (num > pivot) right.push(num);
            else equal.push(num);
        }

        return [...this.sort(left), ...equal, ...this.sort(right)];
    }
}

module.exports = QuickSort;
