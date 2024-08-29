from ec_edu_espe_examp3_controller.SortingStrategy import SortingStrategy

class BubbleSort(SortingStrategy):
    def sort(self, numbers):
        sorted_numbers = numbers[:]
        n = len(sorted_numbers)
        for i in range(n):
            for j in range(0, n-i-1):
                if sorted_numbers[j] > sorted_numbers[j+1]:
                    sorted_numbers[j], sorted_numbers[j+1] = sorted_numbers[j+1], sorted_numbers[j]
        return sorted_numbers