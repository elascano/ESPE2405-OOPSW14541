export class InsertionSort {
    sort(data) {
        let aux;
        for (let i = 1; i < data.length; i++) {
            aux = data[i];
            let j = i - 1;
            while (j >= 0 && data[j] > aux) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = aux;
        }
        return data;
    }
}
