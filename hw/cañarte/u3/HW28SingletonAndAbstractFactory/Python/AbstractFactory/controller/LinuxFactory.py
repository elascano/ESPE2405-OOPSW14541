import sys
import os
# Saray Cañarte, codecreators, DCCO - ESPE

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.GUIFactory import GUIFactory
from controller.LinuxButton import LinuxButton
from controller.LinuxMenu import LinuxMenu


class LinuxFactory(GUIFactory):
    def create_button(self) -> LinuxButton:
        return LinuxButton()

    def create_menu(self) -> LinuxMenu:
        return LinuxMenu()
