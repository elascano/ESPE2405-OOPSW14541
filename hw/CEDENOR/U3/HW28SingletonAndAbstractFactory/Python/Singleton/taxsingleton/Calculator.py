import sys
import os
# Nahomi Cedeño, codecreators, DCCO - ESPE

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from taxsingleton.UStax import USTax

def main():
    tax = USTax()  
    try:
        sale_amount = float(input("Enter the amount of sales: "))
        
        sale_tax = tax.calculate_sales_tax(sale_amount)
        sale_total = tax.calculate_tax_plus_sale(sale_amount, sale_tax)
        
        print(f"Taxes for the amount of sales: {sale_tax:.2f}")
        print(f"Total sale: {sale_total:.2f}")
    except ValueError:
        print("Invalid input. Please enter a valid number.")

if __name__ == "__main__":
    main()
