class InsertionSort extends SortingStrategy {
    sort(data) {
        console.log("Sorting using Insertion Sort");
        return data.sort((a, b) => a - b);
    }
}