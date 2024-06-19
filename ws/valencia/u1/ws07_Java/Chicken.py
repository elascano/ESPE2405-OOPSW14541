class Chicken:
    def __init__(self, id, name, color, age, molting, born_on_date):
        self.id = id
        self.name = name
        self.color = color
        self.age = age
        self.molting = molting
        self.born_on_date = born_on_date

    def __str__(self):
        return f"Chicken(id={self.id}, color={self.color}, age={self.age}, molting={self.molting}, born_on_date={self.born_on_date})"
    
    def get_id(self):
        return self.id
    
    def set_id(self, id):
        self.id = id
    
    def get_name(self):
        return self.name
    
    def set_name(self, name):
        self.name = name
    
    def get_color(self):
        return self.color
    
    def set_color(self, color):
        self.color = color
    
    def get_age(self):
        return self.age
    
    def set_age(self, age):
        self.age = age
    
    def is_molting(self):
        return self.molting
    
    def set_molting(self, molting):
        self.molting = molting
    
    def get_born_on_date(self):
        return self.born_on_date
    
    def set_born_on_date(self, born_on_date):
        self.born_on_date = born_on_date
