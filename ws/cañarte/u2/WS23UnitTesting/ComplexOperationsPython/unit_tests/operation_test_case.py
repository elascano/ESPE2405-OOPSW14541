import unittest
import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_complexoperations_controller.operation import operation

# @author Saray Cañarte, codecreators, DCCO - ESPE

class TestOperation(unittest.TestCase):
    def test_add_two_numbers(self):
        print("test_add_two_numbers")
        addend1 = 1
        addend2 = 2
        exp_result = 3.0
        result = operation.add_two_numbers(addend1, addend2)
        self.assertEqual(exp_result, result)

    def test_add_two_numbers_one_negative(self):
        print("test_add_two_numbers_one_negative")
        addend1 = 1.8
        addend2 = -2.4
        exp_result = -0.6
        result = operation.add_two_numbers(addend1, addend2)
        self.assertEqual(exp_result, result)

    def test_add_two_numbers_positive(self):
        print("test_add_two_numbers_positive")
        addend1 = 1.2
        addend2 = 2.4
        exp_result = 3.6
        result = operation.add_two_numbers(addend1, addend2)
        self.assertEqual(exp_result, result)

if __name__ == '__main__':
    unittest.main()