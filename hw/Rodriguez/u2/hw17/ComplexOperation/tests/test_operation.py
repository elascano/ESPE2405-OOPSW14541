import unittest
from ec_edu_espe_complexoperation_controller.operation import Operation

class TestOperation(unittest.TestCase):

    def test_add_two_numbers(self):
        # Utiliza assertAlmostEqual con una precisión de 7 decimales
        self.assertAlmostEqual(Operation.add_two_numbers(1.2, 2.4), 3.6, places=7)

if __name__ == '__main__':
    unittest.main()
