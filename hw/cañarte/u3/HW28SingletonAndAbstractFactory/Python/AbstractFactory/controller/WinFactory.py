import sys
import os
# Saray Cañarte, codecreators, DCCO - ESPE

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.GUIFactory import GUIFactory
from controller.WinButton import WinButton
from controller.WinMenu import WinMenu
class WinFactory(GUIFactory):
    def create_button(self) -> WinButton:
        return WinButton()

    def create_menu(self) -> WinMenu:
        return WinMenu()
