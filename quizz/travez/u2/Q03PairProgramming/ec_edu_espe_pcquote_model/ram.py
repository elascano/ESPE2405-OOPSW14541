class Ram:
    def __init__(self, name: str, price: float, velocity: int):
        self.name = name
        self.price = price
        self.velocity = velocity
        
    def __repr__(self):
        return f"Processor(name={self.name}, price={self.price}, core={self.velocity})"