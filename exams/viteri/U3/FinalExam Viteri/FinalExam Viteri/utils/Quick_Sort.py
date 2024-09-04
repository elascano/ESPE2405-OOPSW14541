class Quick_Sort:
    def quick_sort(list):
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (list[j] > list[j+1]) 
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                