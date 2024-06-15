from datetime import date 


class Chicken:
    def __init__(self, id, name, color, age, molting, born_on_date):
        self.id = id
        self.name = name
        self.color = color
        self.age = age
        self.molting = molting
        self.born_on_date = born_on_date

    def __str__(self):
        return f"Chicken(id={self.id}, name={self.name}, color={self.color}, age={self.age}, molting={self.molting}, bornOnDate={self.born_on_date})"
    

    def get_id(self):
        return self.__id
    def get_name (self):
        return self.__name
    def get_color (self):
        return self.__color
    def get_age (self):
        return self.__age
    def get_molting (self):
        return self.__molting
    def get_born_on_date (self):
        return self.__born_on_date

    
    
    
