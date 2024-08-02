class Cage:
    def __init__(self, id, type):
        self.id = id
        self.type = type

    def __str__(self):
        return f"Cage(id={self.id}, type={self.type})"
