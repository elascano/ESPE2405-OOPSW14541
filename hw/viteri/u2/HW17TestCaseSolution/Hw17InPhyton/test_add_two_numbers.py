import unittest
import sys
import os

# Agrega el directorio principal del proyecto al path
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from complex_operations import add_two_numbers

class TestAddTwoNumbers(unittest.TestCase):

    def test_positive_numbers(self):
        self.assertEqual(add_two_numbers(4, 7), 11)

    def test_negative_numbers(self):
        self.assertEqual(add_two_numbers(-1, 1), 0)

    def test_positive_and_negative_numbers(self):
        self.assertEqual(add_two_numbers(-1, -8), -9)

    def test_floats(self):
        self.assertAlmostEqual(add_two_numbers(11, 7.5), 18.5)

if __name__ == '__main__':
    unittest.main()