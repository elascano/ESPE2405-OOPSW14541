class QuickSort extends SortingStrategy {
    sort(data) {
        console.log("Sorting using Quick Sort");
        return data.sort((a, b) => a - b);
    }
}