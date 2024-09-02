import sys
import os
# Saray Cañarte, codecreators, DCCO - ESPE

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.IInvestor import IInvestor


class Investor(IInvestor):
    def __init__(self, name):
        self._name = name
        self._observer_state = None
        self._stock = None

    def update(self, stock, args):
        print(f"Notified observer {self._name}:")
        if isinstance(args, str):
            print(f"The symbol of {stock.symbol} changed to: {args}")
        elif isinstance(args, float):
            print(f"The price of {stock.symbol} changed to: {args}")
