class InsertionSort {
    sort(data) {
        for (let i = 1; i < data.length; i++) {
            let key = data[i];
            let j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
        return data;
    }
}