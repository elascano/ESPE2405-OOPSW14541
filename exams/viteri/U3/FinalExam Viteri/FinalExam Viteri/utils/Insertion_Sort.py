class Insertion_Sort:
    def insertion_sort(list)
        n=10
        for int i = 1; i < n; ++i: 
            int key = list[i]
            int j = i - 1
            while j >= 0 && list[j] > key: 
                list[j + 1] = list[j]
                j = j - 1
            
            list[j + 1] = key