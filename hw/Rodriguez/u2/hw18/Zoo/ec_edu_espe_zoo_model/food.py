class Food:
    def __init__(self, id, description):
        self.id = id
        self.description = description

    def __str__(self):
        return f"Food(id={self.id}, description={self.description})"
