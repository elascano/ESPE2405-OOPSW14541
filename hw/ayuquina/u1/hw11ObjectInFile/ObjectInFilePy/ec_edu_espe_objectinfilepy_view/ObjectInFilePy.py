import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from ec_edu_espe_objectinfilepy_model.AutoMobile import AutoMobile
from ec_edu_espe_objectinfilepy_controller.ObjectToFIle import Object_To_File

def main():
    
    automobile_list = []

    motor_cycle = AutoMobile(12,"Motorcycle",2,False)
    car = AutoMobile(13,"Car",4,True)
    bus = AutoMobile(14,"Bus",4,False)

    automobile_list.append(motor_cycle)
    automobile_list.append(car)
    automobile_list.append(bus)  

    object_File = Object_To_File

    object_File.writeObject("WriteObjects", automobile_list)

    automobile_list=object_File.readObject("WriteObjects", automobile_list)

    for auto in automobile_list:
        print(auto)

if __name__ == "__main__":
    main()