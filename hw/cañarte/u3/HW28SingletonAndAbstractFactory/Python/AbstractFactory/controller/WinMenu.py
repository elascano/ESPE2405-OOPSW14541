import sys
import os
# Saray Cañarte, codecreators, DCCO - ESPE

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.Menu import Menu

class WinMenu(Menu):
    def display(self):
        print(f"I'm a WinMenu: {self.caption}")
