import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.Button import Button
class LinuxButton(Button):
    def paint(self):
        print(f"I'm a LinuxButton {self.caption}")
