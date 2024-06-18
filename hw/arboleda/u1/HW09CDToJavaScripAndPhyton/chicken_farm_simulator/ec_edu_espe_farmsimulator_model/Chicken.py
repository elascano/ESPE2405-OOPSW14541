from datetime import datetime

class Chicken():
    #Constructor
    def __init__(self, id, name, color, age, molting, born_on_date):
   
        self.__id = id
        self.__name = name
        self.__color = color
        self.__age = age
        self.__molting = molting
        self.__born_on_date = born_on_date

    #toString()
    def __str__(self):
        return f"Chicken (id={self.__id}, name={self.__name}, color={self.__color}, age={self.__age}, molting={self.__molting}, born_on_date={self.__born_on_date})"

    #Getters
    def get_Id(self):
        return self.__id
    
    def get_Name(self):
        return self.__name
    
    def get_Color(self):
        return self.__color
    
    def get_Age(self):
        return self.__age
    
    def get_Molting(self):
        return self.__molting
    
    def get_Born_on_date(self):
        return self.__born_on_date
    
    #Setters
    def set_Id(self, id):
        self.__id=id
    
    def set_Name(self, name):
        self.__name=name
    
    def set_Color(self, color):
        self.__color=color
    
    def set_Age(self, age):
        self.__age=age
    
    def set_Molting(self, molting):
        self.__molting=molting
    
    def set_Born_on_date(self, born_on_date):
        self.__born_on_date=born_on_date
