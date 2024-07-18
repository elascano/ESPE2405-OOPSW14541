class VideoCard:
    def __init__(self, name: str, price: float, vram: int):
        self.name = name
        self.price = price
        self.vram = vram
    def __repr__(self):
        return f"Processor(name={self.name}, price={self.price}, core={self.vram})"