import sys
import os

# Nahomi Cedeño, codecreators, DCCO - ESPE

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.Stock import Stock

class IBM(Stock):
    def __init__(self, symbol, price):
        super().__init__(symbol, price)

    @property
    def price(self):
        return self._price

    @price.setter
    def price(self, price):
        self._price = price
        self.notify_observers(price)

    @Stock.symbol.setter
    def symbol(self, symbol):
        self._symbol = symbol
        self.notify_observers(symbol)
