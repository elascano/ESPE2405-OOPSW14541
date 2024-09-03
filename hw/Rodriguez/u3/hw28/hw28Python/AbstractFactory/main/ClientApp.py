import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.GUIFactory import GUIFactory

if __name__ == "__main__":
    a_factory = GUIFactory.get_factory()
    
    a_button = a_factory.create_button()
    a_button.caption = "Play"
    a_button.paint()

    a_menu = a_factory.create_menu()
    a_menu.caption = "Start"
    a_menu.display()
