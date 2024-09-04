def get_fish_details():
    name = input("Enter fish name: ")
    species = input("Enter fish species: ")
    age = int(input("Enter fish age: "))
    return name, species, age

def show_fish_added(fish_id):
    print(f"Fish added with ID: {fish_id}")