import sys
import os


sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_q27_model.A import A
from ec_edu_espe_q27_model.B import B
from ec_edu_espe_q27_model.C import C
from ec_edu_espe_q27_model.E import E

class POOExam1P27:
    print("Saray Canarte Main \n")
    c = C()
    a = A()
    b1= B()
    b2 = B()
    # continue main (in class diagram was empty, so the lines 13 -16 are examples)


if __name__ == "__main__":
    POOExam1P27.main()