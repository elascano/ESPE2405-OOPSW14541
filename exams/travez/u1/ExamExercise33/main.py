import json
from doll import Doll

class Main:
    def main():
        id = int(input("Enter ID: "))
        color = input("Enter color: ")
        size = input("Enter size: ")
        brand = input("Enter brand: ")

        doll = Doll(id=id, color=color, size=size, brand=brand)
        print(doll)

        doll_data = {
            "id": doll.id,
            "color": doll.color,
            "size": doll.size,
            "brand": doll.brand
        }

        with open("doll_data.json", "w") as json_file:
            json.dump(doll_data, json_file, indent=4)
            print(f"Created doll_data.json:\n{json.dumps(doll_data, indent=4)}")
        

if __name__ == "__main__":
    Main.main()
