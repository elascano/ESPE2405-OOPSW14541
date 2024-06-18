from datetime import datetime

class Chicken:
    def __init__(self, id, name, color, age, molting, born_on_date):
        self._id = id
        self._name = name
        self._color = color
        self._age = age
        self._molting = molting
        self._born_on_date = born_on_date

    # Getters and setters
    def get_id(self):
        return self._id

    def set_id(self, id):
        self._id = id

    def get_name(self):
        return self._name

    def set_name(self, name):
        self._name = name

    def get_color(self):
        return self._color

    def set_color(self, color):
        self._color = color

    def get_age(self):
        return self._age

    def set_age(self, age):
        self._age = age

    def is_molting(self):
        return self._molting

    def set_molting(self, molting):
        self._molting = molting

    def get_born_on_date(self):
        return self._born_on_date

    def set_born_on_date(self, born_on_date):
        self._born_on_date = born_on_date

    def __str__(self):
        return (f"Chicken{{id={self._id}, name={self._name}, color={self._color}, "
                f"age={self._age}, molting={self._molting}, bornOnDate={self._born_on_date.strftime('%Y-%m-%d')}}}")

# Example usage
if __name__ == "__main__":
    chicken = Chicken(1, "Lucy", "brown", 1, True, datetime.now())
    print(chicken)
    chicken.set_name("Maruja")
    print(chicken)
