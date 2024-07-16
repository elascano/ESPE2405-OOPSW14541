import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_cyberplaneta_model.price_list import price_list

class ComputeIncome:
    @staticmethod
    def calculate_total_price(selected_process, num_documentation):
        additional_cost = ((num_documentation / 10) * 0.50)
        base_price = selected_process.precio
        total_price_without_tax = base_price + additional_cost
        tax = (total_price_without_tax * (selected_process.impuesto / 100))
        return total_price_without_tax + tax
    
    @staticmethod
    def get_process_by_id(process_id, price_list):
        for process in price_list:
            if process.id == process_id:
                return process
        return None
