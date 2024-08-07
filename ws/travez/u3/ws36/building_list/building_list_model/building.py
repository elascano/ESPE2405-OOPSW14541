class Building:
    def __init__(self, id, name, year):
        self._id = id
        self._name = name
        self._year = year

    @property
    def id(self):
        return self._id

    @id.setter
    def id(self, value):
        self._id = value

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, value):
        self._name = value

    @property
    def year(self):
        return self._year

    @year.setter
    def year(self, value):
        self._year = value
