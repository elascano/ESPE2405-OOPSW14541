const SortingStrategy = require('./SortingStrategy');

class BubbleSort extends SortingStrategy {
    sort(array) {
        // Implementación del algoritmo BubbleSort
        for (let i = 0; i < array.length - 1; i++) {
            for (let j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    [array[j], array[j + 1]] = [array[j + 1], array[j]];
                }
            }
        }
        return array;
    }
}

module.exports = BubbleSort;
