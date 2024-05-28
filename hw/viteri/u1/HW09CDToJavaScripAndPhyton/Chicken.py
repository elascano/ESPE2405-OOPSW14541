class Chicken:
    def __init__(self, id, name, color, age, molting, bornOnDate):
        self.id=id
        self.name=name
        self.color=color
        self.age=age
        self.molting=molting
        self.bornOnDate=bornOnDate
        
chichen1=Chicken("1","Lucy","White and brown","0",True,None)
chichen2=Chicken("2","Matilda","Yellow",1,True,None)

print("These are "+chichen1.name+"'s details:")
print("ID:\t\t",chichen1.id)
print("NAME:\t\t",chichen1.name)
print("COLOR:\t\t",chichen1.color)
print("AGE:\t\t",chichen1.age)
print("MOLTING:\t",chichen1.molting)
print("BORN OF DATE:\t",chichen1.bornOnDate)