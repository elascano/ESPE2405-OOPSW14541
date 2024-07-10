import sys
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_q27_model.B import B

class C:
    def __init__(self, b: B):
        self.b = b
      
