import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.Button import Button
from controller.Menu import Menu
from controller.WinFactory import WinFactory
from controller.LinuxFactory import LinuxFactory
from abc import ABC, abstractmethod


class GUIFactory(ABC):
    @staticmethod
    def get_factory():
        sys = GUIFactory.read_from_config_file("OS_TYPE")
        if sys == 0:
            return WinFactory()
        else:
            return LinuxFactory()

    @abstractmethod
    def create_button(self) -> Button:
        pass

    @abstractmethod
    def create_menu(self) -> Menu:
        pass

    @staticmethod
    def read_from_config_file(key: str) -> int:
        if key == "OS_TYPE":
            # Assuming 0 represents Windows and 1 represents Linux
            return 1
        return -1
