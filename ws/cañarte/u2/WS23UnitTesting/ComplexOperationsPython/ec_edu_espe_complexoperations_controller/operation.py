from decimal import Decimal, ROUND_HALF_UP


class operation:
    @staticmethod
    def add_two_numbers(addend1, addend2):
        bd1 = Decimal(str(addend1))
        bd2 = Decimal(str(addend2))
        sum_result = bd1 + bd2
        return float(sum_result.quantize(Decimal('0.00'), rounding=ROUND_HALF_UP))