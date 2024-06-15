class AutoMobile():    
    def __init__ (self, id, type_of_automobile, wheels, is_running):

        self.id = id
        self.type_of_automobile = type_of_automobile
        self.wheels = wheels
        self.is_running = is_running

    #toString    
    def __str__(self) -> str:
        return f"AutoMobile (id={self.id}, Type Of Automobile= {self.type_of_automobile}, Wheels={self.wheels}, Is running={self.is_running} )"

    def get_Id(self):
        return self.__id

    def get_type_of_automobile(self):
        return self.__type_of__automobile
    
    def get_is_running(self):
        return self.__is_running

    def get_wheels(self):
        return self.__wheels