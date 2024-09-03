class BubbleSort extends SortingStrategy {
    sort(data) {
        console.log("Sorting using Bubble Sort");
        return data.sort((a, b) => a - b);
    }
}