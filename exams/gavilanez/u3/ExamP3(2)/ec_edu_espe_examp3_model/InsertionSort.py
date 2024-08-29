from ec_edu_espe_examp3_controller.SortingStrategy import SortingStrategy

class InsertionSort(SortingStrategy):
    def sort(self, numbers):
        sorted_numbers = numbers[:]
        for i in range(1, len(sorted_numbers)):
            key = sorted_numbers[i]
            j = i-1
            while j >= 0 and key < sorted_numbers[j]:
                sorted_numbers[j + 1] = sorted_numbers[j]
                j -= 1
            sorted_numbers[j + 1] = key
        return sorted_numbers