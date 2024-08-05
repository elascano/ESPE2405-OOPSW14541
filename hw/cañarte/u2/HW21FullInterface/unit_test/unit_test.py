import unittest
import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_cyberplaneta_model.price_list import price_list
from ec_edu_espe_cyberplaneta_controller.compute_income import ComputeIncome

class TestComputeIncome(unittest.TestCase):
    def test_calculate_total_price1(self):
        total_price = ComputeIncome.calculate_total_price(ComputeIncome.get_process_by_id(5, price_list), 200)
        expected_total_price = 17.25
        self.assertAlmostEqual(total_price, expected_total_price, places=2, msg=f"El precio total debería ser {expected_total_price} pero fue {total_price}")
    
    def test_calculate_total_price2(self):
        total_price = ComputeIncome.calculate_total_price(ComputeIncome.get_process_by_id(4, price_list), 89)
        expected_total_price = 9.14
        self.assertAlmostEqual(total_price, expected_total_price, places=2, msg=f"El precio total debería ser {expected_total_price} pero fue {total_price}")
    
    def test_calculate_total_price3(self):
        total_price = ComputeIncome.calculate_total_price(ComputeIncome.get_process_by_id(1, price_list), 47)
        expected_total_price = 8.45
        self.assertAlmostEqual(total_price, expected_total_price, places=2, msg=f"El precio total debería ser {expected_total_price} pero fue {total_price}")
    
    def test_calculate_total_price4(self):
        total_price = ComputeIncome.calculate_total_price(ComputeIncome.get_process_by_id(3, price_list), 500)
        expected_total_price = 86.25
        self.assertAlmostEqual(total_price, expected_total_price, places=2, msg=f"El precio total debería ser {expected_total_price} pero fue {total_price}")
    


if __name__ == '__main__':
    unittest.main()
