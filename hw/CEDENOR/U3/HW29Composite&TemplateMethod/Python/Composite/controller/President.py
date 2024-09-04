import sys
import os
# Nahomi Cedeño, codecreators, DCCO - ESPE

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.Supervisor import Supervisor


class President(Supervisor):
    _instance = None

    def __new__(cls, name=None):
        if cls._instance is None:
            cls._instance = super(President, cls).__new__(cls)
        if name is not None:
            cls._instance.name = name
        return cls._instance

    def __init__(self, name=None):
        super().__init__()
        if name is not None:
            self.name = name
        self.title = "President"
