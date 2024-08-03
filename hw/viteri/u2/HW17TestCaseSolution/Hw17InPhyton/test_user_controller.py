import unittest
import sys
import os

# Agrega el directorio principal del proyecto al path
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from datetime import date

class PersonController:

    @staticmethod
    def compute_age_in_days(birth_date):
        today = date.today()
        days = (today - birth_date).days
        return days

    @staticmethod
    def compute_age_in_years(birth_date):
        today = date.today()
        years = today.year - birth_date.year - ((today.month, today.day) < (birth_date.month, birth_date.day))
        return years


class TestPersonController(unittest.TestCase):

    def test_compute_age_in_days(self):
        print("compute_age_in_days")
        birth_date = date(2007, 3, 5)
        today = date.today()
        exp_result = (today - birth_date).days
        result = PersonController.compute_age_in_days(birth_date)
        self.assertEqual(exp_result, result)

    def test_compute_age_in_years(self):
        print("compute_age_in_years")
        birth_date = date(2007, 3, 5)
        today = date.today()
        exp_result = today.year - birth_date.year - ((today.month, today.day) < (birth_date.month, birth_date.day))
        result = PersonController.compute_age_in_years(birth_date)
        self.assertEqual(exp_result, result)

if __name__ == '__main__':
    unittest.main()