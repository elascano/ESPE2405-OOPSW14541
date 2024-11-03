class InsertionSort:
    
    def sort(self, data):
        print("\tInsertion Sort")
        n = len(data)
        for i in range(1, n):
            key = data[i]
            j = i - 1

            while j >= 0 and data[j] > key:
                data[j + 1] = data[j]
                j -= 1

            data[j + 1] = key
        return data

