class A:
    def __init__(self):
        self.b1 = B()
        self.b2 = B()

    def m1(self, x, y):
        pass

class B:
    pass

class C:
    def __init__(self):
        self.b = B()

class E:
    def __init__(self):
        self.a = A()
        self.b = [B() for _ in range(10)]

    def m2(self, z):
        pass

if __name__ == "__main__":
    e = E()
    c = C()
    e.m2(c)

    a = A()
    b1 = B()
    b2 = B()
    a.m1(b1, b2)
