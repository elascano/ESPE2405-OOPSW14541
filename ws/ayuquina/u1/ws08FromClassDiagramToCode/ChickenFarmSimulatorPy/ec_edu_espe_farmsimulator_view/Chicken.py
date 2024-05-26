class Chicken():
    def __init__(self, id, name, color, age, molting, born_on_date) -> None:

        self.__id=id
        self.__name=name
        self.__color=color
        self.__age=age
        self.__molting=molting
        self.__born_on_date=born_on_date

    #toString
    def __str__(self) -> str:
        return f"Chicken (if={self.__id}, name= {self.__name}, color={self.__color}, age={self.__age}, molting={self.__molting}, birth={self.__born_on_date} )"
    
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
    
    def get_Born_On_Date(self):
        return self.__born_on_date