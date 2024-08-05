class Food:
    def __init__(self, id, description):
        self._id = id
        self._description = description

    def __str__(self):
        return f"Food{{id={self._id}, description='{self._description}'}}"

    @property
    def id(self):
        return self._id

    @id.setter
    def id(self, value):
        self._id = value

    @property
    def description(self):
        return self._description

    @description.setter
    def description(self, value):
        self._description = value