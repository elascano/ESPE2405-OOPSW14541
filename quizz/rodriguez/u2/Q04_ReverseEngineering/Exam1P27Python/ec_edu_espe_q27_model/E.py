from ec_edu_espe_q27_model.A import A
from ec_edu_espe_q27_model.B import B
from ec_edu_espe_q27_model.C import C

class E:
    def __init__(self):
        self.a = A()  
        self.b = [B() for _ in range(10)]  
    
    def m2(self, z):
        print("Executing method m2 of class E")
