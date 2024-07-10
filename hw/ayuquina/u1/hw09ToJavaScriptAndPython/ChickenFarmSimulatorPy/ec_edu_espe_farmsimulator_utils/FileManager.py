from datetime import datetime
class FileManager():

    #Constructor
    def __init__(self, object_Data):
        self.__object_Data=object_Data

    #Métodos
    def create_File(self):
        pass

    def save(self):

        object_File = open("./chickenData.txt", 'a')
        object_File.write(self.__object_Data+ '\n')
        object_File.close()

    def delete_File(self):
        pass
    
    