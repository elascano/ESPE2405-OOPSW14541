from ec_edu_espe_examp3_controller.SortingStrategy import SortingStrategy

class SortingContext:
    def __init__(self):
        self._strategy = None

    def set_sort_strategy(self, strategy: SortingStrategy):
        self._strategy = strategy

    def sort(self, numbers):
        return self._strategy.sort(numbers)
