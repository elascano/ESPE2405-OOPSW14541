class Cage:
    def __init__(self, id, type):
        self._id = id
        self._type = type

    def __str__(self):
        return f'Cage(id={self._id}, type={self._type})'

    @property
    def id(self):
        return self._id

    @id.setter
    def id(self, id):
        self._id = id

    @property
    def type(self):
        return self._type

    @type.setter
    def type(self, type):
        self._type = type
