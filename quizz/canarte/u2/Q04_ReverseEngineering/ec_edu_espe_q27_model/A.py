import sys
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_q27_model.B import B

class A: 
    def __init__(self, b1: B, b2 :B):
        self.b1 = b1
        self.b2 = b2
    def m1(self, x: B, y: B):
        self.x = x
        self.y = y
        print(f"x: {x.value}, y: {y.value}")
    

    
