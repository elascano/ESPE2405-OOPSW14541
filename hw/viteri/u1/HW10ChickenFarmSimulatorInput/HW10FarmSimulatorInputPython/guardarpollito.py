import os

class GuardarPollito:
    def __init__(self):
        self.pollito = None
        self.text = ""
        self.id = 0
        self.numerito = 0
        self.name = ""
        self.color = ""
        self.molting = False
        self.age = 0.0
        self.num1 = 0

    def create_file(self):
        self.pollito = "pollito.txt"
        try:
            with open(self.pollito, 'w'):
                print("File created successfully")
        except IOError as e:
            print("!!Error!!:", e)

    def delete_file(self):
        try:
            os.remove(self.pollito)
            print("File deleted successfully")
        except OSError as e:
            print("!!Error!!:", e)

    def write_to_file(self):
        try:
            with open(self.pollito, 'a') as write:
                self.id = int(input("Id:\t"))
                self.name = input("Name:\t")
                self.color = input("Color:\t")
                self.age = float(input("Age:\t"))
                print("Is molting?\n1.-Yes\t\tOther Number.-No")
                self.numerito = int(input())
                self.molting = self.numerito == 1
                write.write(f"{self.id}\t{self.name}\t{self.color}\t{self.age}\t{self.molting}\n")
            print("Text added successfully")
        except IOError as e:
            print("!!Error!!:", e)

    def read_file(self):
        try:
            with open(self.pollito, 'r') as reader:
                for line in reader:
                    print(line.strip())
        except IOError as e:
            print("!!Error!!:", e)

if __name__ == "__main__":
    archivo = GuardarPollito()
    archivo.create_file()
    while True:
        archivo.write_to_file()
        num2 = int(input("Do you want to continue writing?\n1.- No\t\tother number.- yes\n"))
        if num2 == 1:
            break
    archivo.read_file()