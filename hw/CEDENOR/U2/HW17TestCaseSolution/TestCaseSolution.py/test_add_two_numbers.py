import unittest
import sys
import os

# Agrega el directorio principal del proyecto al path
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from operations import add_two_numbers

class TestAddTwoNumbers(unittest.TestCase):

    def test_positive_numbers(self):
        self.assertEqual(add_two_numbers(1, 2), 3)

    def test_negative_numbers(self):
        self.assertEqual(add_two_numbers(-1, -1), -2)

    def test_positive_and_negative_numbers(self):
        self.assertEqual(add_two_numbers(-1, 1), 0)

    def test_floats(self):
        self.assertAlmostEqual(add_two_numbers(1.5, 2.5), 4.0)

if __name__ == '__main__':
    unittest.main()
