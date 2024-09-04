# Nahomi Cedeño, codecreators, DCCO - ESPE
class Stock:
    def __init__(self, symbol='', price=0.0):
        self._symbol = symbol
        self._price = price
        self._investors = []

    @property
    def symbol(self):
        return self._symbol

    @symbol.setter
    def symbol(self, symbol):
        self._symbol = symbol

    @property
    def price(self):
        return self._price

    @price.setter
    def price(self, price):
        self._price = price

    def add_observer(self, investor):
        self._investors.append(investor)

    def delete_observer(self, investor):
        self._investors.remove(investor)

    def notify_observers(self, args):
        for investor in self._investors:
            investor.update(self, args)
