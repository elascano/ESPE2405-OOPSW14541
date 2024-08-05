import unittest
from datetime import datetime, timedelta
import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_complexoperations_controller.person_controller import PersonController

# @author Saray Cañarte, codecreators, DCCO - ESPE

class TestPersonController(unittest.TestCase):
    def test_compute_age_in_days(self):
        print("test_compute_age_in_days")
        birth_date = datetime.strptime("2004-09-17", "%Y-%m-%d").date()
        exp_result = 7235
        result = PersonController.compute_age_in_days(birth_date)
        self.assertEqual(exp_result, result)

    def test_compute_age_in_years(self):
        print("test_compute_age_in_years")
        birth_date = datetime.strptime("2004-09-17", "%Y-%m-%d").date()
        exp_result = 19
        result = PersonController.compute_age_in_years(birth_date)
        self.assertEqual(exp_result, result)

if __name__ == '__main__':
    unittest.main()