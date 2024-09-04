import sys
import os
# Nahomi Cedeño, codecreators, DCCO - ESPE

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.Supervisor import Supervisor


class Manager(Supervisor):
    def __init__(self, name):
        super().__init__(name)
        self.title = "Manager"
