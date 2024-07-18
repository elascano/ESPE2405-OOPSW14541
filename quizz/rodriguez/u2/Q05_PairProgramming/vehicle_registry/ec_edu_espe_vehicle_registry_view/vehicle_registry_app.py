import sys
import os


sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from utils.console_app import ConsoleApp

if __name__ == "__main__":
    ConsoleApp.run()
