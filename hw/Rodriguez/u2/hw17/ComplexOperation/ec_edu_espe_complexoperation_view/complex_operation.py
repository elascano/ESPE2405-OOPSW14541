# complex_operation.py
from ec_edu_espe_complexoperation_controller.operation import Operation
from ec_edu_espe_complexoperation_controller.person_controller import PersonController
from ec_edu_espe_complexoperation_view.operation_printing import OperationPrinting
from datetime import date

def main():
    print("Welcome to Complex Operation! \nDavid Rodriguez")

    addend1 = 1
    addend2 = 2
    sum = Operation.add_two_numbers(addend1, addend2)
    OperationPrinting.print_addition(addend1, addend2, sum)

    addend1 = 1.2
    addend2 = 2.4
    sum = Operation.add_two_numbers(addend1, addend2)
    OperationPrinting.print_addition(addend1, addend2, sum)

    addend1 = 2.2
    addend2 = -1.8
    sum = Operation.add_two_numbers(addend1, addend2)
    OperationPrinting.print_addition(addend1, addend2, sum)

    birth_date = date(2004, 11, 10)
    days = PersonController.compute_age_in_days(birth_date)
    years = PersonController.compute_age_in_years(birth_date)

    print(f"David is {days} days old")
    print(f"He was born on {birth_date}")
    print(f"David is {years} years old")

if __name__ == "__main__":
    main()
