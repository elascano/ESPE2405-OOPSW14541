import sys
import os
# Nahomi Cedeño, codecreators, DCCO - ESPE

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.IBM import IBM
from controller.Investor import Investor

def main():
    
    s = Investor("Sorros")
    b = Investor("Berkshire")

    ibm = IBM("IBM", 120.0)

    ibm.add_observer(s)
    ibm.add_observer(b)

    ibm.price = 120.10
    ibm.price = 121.00
    ibm.price = 120.50
    ibm.price = 120.75

    ibm.symbol = "IBMTEST"

if __name__ == "__main__":
    main()
