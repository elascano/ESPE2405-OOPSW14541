import sys
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_q27_model.B import B
from ec_edu_espe_q27_model.A import A
from ec_edu_espe_q27_model.C import C

class E:
    def __init__(self, a: A):
        self.a = a

    def __init__(self):
     self.b = [B(0) for _ in range(10)]

    def m2(self, z: C):
     self.z = z
    

