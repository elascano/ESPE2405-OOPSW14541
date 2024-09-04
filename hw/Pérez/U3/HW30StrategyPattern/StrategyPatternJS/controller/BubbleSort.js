export class BubbleSort {
    sort(data) {
        let aux;
        let changes;
        while (true) {
            changes = false;
            for (let i = 1; i < data.length; i++) {
                if (data[i] < data[i - 1]) {
                    aux = data[i];
                    data[i] = data[i - 1];
                    data[i - 1] = aux;
                    changes = true;
                }
            }
            if (!changes) {
                break;
            }
        }
        return data;
    }
}
