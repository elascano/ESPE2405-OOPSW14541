class Processor:
    def __init__(self, name: str, price: float, core: int):
        self.name = name
        self.price = price
        self.core = core

    def __repr__(self):
        return f"Processor(name={self.name}, price={self.price}, core={self.core})"
