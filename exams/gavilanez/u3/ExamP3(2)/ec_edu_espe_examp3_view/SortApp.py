import sys
sys.path.append(r'C:\KennyPOO\ESPE2405-OOPSW14541\exams\gavilanez\u3\ExamP3')

from ec_edu_espe_examp3_controller.MongoBD import MongoDB
from ec_edu_espe_examp3_model.BubbleSort import BubbleSort 
from ec_edu_espe_examp3_model.InsertionSort import InsertionSort
from ec_edu_espe_examp3_model.QuickSort import QuickSort
from ec_edu_espe_examp3_model.SortingContext import SortingContext


def main():
    input_string = input("Enter numbers to sort, separated by commas: ")
    numbers = list(map(int, input_string.split(',')))

    if len(numbers) <= 1:
        print("Array must have more than 1 element.")
        return

    context = SortingContext()
    db_handler = MongoDB()

    if 2 <= len(numbers) <= 5:
        context.set_sort_strategy(BubbleSort())
        chosen_algorithm = "BubbleSort"
    elif 6 <= len(numbers) <= 10:
        context.set_sort_strategy(InsertionSort())
        chosen_algorithm = "InsertionSort"
    else:
        context.set_sort_strategy(QuickSort())
        chosen_algorithm = "QuickSort"

    sorted_numbers = context.sort(numbers)
    print(f"Unsorted: {numbers}")
    print(f"Sorted: {sorted_numbers}")
    print(f"Algorithm used: {chosen_algorithm}")

    db_handler.save_sort_result(numbers, len(numbers), chosen_algorithm, sorted_numbers)

if __name__ == "__main__":
    main()
