import sys
import os
# Saray Cañarte, codecreators, DCCO - ESPE

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.Employee import Employee

class Client:
    employee = None

    @staticmethod
    def do_client_tasks():
        if Client.employee:
            Client.employee.state_name()
