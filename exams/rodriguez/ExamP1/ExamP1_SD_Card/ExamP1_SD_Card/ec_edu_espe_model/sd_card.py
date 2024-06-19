class SDCard:
    def __init__(self, id, capacity, brand, speed_class):
        self.id = id
        self.capacity = capacity
        self.brand = brand
        self.speed_class = speed_class

    def to_dict(self):
        return {
            "id": self.id,
            "capacity": self.capacity,
            "brand": self.brand,
            "speed_class": self.speed_class
        }

    @staticmethod
    def from_dict(data):
        return SDCard(
            id=data["id"],
            capacity=data["capacity"],
            brand=data["brand"],
            speed_class=data["speed_class"]
        )