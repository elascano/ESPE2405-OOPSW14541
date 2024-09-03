from ec_edu_espe_examp3_controller.SortingStrategy import SortingStrategy

class QuickSort(SortingStrategy):
    def sort(self, numbers):
        return self.quick_sort(numbers)

    def quick_sort(self, array):
        if len(array) <= 1:
            return array
        pivot = array[len(array) // 2]
        left = [x for x in array if x < pivot]
        middle = [x for x in array if x == pivot]
        right = [x for x in array if x > pivot]
        return self.quick_sort(left) + middle + self.quick_sort(right)
