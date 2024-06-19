class Doll:
    def __init__(self, id, color, size, brand):
        self.id = id
        self.color = color
        self.size = size
        self.brand = brand
    def __str__(self):
        return f"Doll(id={self.id}, color='{self.color}', size='{self.size}', brand='{self.brand}')"
