from ec_edu_espe_q27_model.A import A
from ec_edu_espe_q27_model.B import B
from ec_edu_espe_q27_model.C import C
from ec_edu_espe_q27_model.E import E

class POOExam1P27:
    def __init__(self):
        self.a_instance = A()
        self.b_instance = B()
        self.c_instance = C()
        self.e_instance = E()

    def run_example(self):
        # Example of using the classes and methods
        b1 = B()
        b2 = B()
        self.a_instance.m1(b1, b2)
        self.e_instance.m2(self.c_instance)
        
        print("Methods m1 and m2 executed successfully.")

# Example usage of the code
if __name__ == "__main__":
    exam_instance = POOExam1P27()
    exam_instance.run_example()
