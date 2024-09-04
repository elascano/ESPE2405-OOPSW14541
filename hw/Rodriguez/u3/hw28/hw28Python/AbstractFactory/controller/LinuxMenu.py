import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.Menu import Menu

class LinuxMenu(Menu):
    def display(self):
        print(f"I'm a LinuxMenu: {self.caption}")
