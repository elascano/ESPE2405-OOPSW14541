import sys
import os


sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.Manager import Manager
from controller.Clerk import Clerk
from controller.Teller import Teller
from controller.President import President
from controller.Client import Client


def main():
    
    tommy = Teller("Tommy")
    carl = Clerk("Carl")
    able = Manager("Able")
    able.add(carl)
    able.add(tommy)

    juanita = Teller("Juanita")
    therma = Teller("Therma")
    becky = Manager("Becky")
    becky.add(juanita)
    becky.add(therma)

    pete = President("Pete")
    pete.add(able)
    pete.add(becky)

    
    Client.employee = pete
    Client.do_client_tasks()

if __name__ == "__main__":
    main()
