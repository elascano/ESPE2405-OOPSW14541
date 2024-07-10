import sys
import os

# Agrega el directorio principal del proyecto al path
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from ec_espe_edu_1P27_model.A import A
from ec_espe_edu_1P27_model.B import B
from ec_espe_edu_1P27_model.C import C
from ec_espe_edu_1P27_model.E import E

class POOExam1P27:
    @staticmethod
    def main(args):
        e = E()
        c = C()
        e.m2(c)

        a = A()
        b1 = B()
        b2 = B()
        a.m1(b1, b2)

if __name__ == "__main__":
    POOExam1P27.main([])