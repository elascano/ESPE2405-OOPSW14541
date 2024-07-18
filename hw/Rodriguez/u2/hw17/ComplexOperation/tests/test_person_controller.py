import unittest
from datetime import datetime
from ec_edu_espe_complexoperation_controller.person_controller import PersonController

class TestPersonController(unittest.TestCase):

    def test_compute_age_in_days(self):
        birth_date = datetime(2004, 11, 10).date()
        # Ajusta el valor esperado al cálculo correcto
        self.assertEqual(PersonController.compute_age_in_days(birth_date), 7182)

if __name__ == '__main__':
    unittest.main()
