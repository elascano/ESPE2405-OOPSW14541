class Bubble_Sort:
    def bubble_sort(list):

        for n in range(len(list)-1, 0, -1):
            for i in range(n):
                if list[i] > list[i + 1]:
                    temp = list[i]
                    list[i] = list[i + 1]
                    list[i + 1] = temp


