import sys
import os
import pickle

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from ec_edu_espe_objectinfilepy_model.AutoMobile import AutoMobile

class Object_To_File():

    def writeObject(file_name, auto_mobiles):
    
        with  open(file_name+".bin", 'wb') as object_File:
            pickle.dump(auto_mobiles, object_File)
                
    def readObject(file_name, auto_mobiles):
         
        with open("./"+file_name+".bin", 'rb') as object_File:
            auto_mobiles = pickle.load(object_File)
            return auto_mobiles
        