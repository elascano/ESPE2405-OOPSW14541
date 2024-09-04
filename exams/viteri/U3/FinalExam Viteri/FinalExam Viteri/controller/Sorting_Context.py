class Sorting_Context:
    def set_sort_strategy(size):
        if size>=2 && size<=5 :
            bubble_sort()
        else:
            if size>=6 && size<= 10:
                insertion_sort()
            else
                quick_sort()