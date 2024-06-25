import json

class Province:
    def __init__(self, id, name, population, capital):
        self.id = id
        self.name = name
        self.population = population
        self.capital = capital
    
    def to_dict(self):
        return {
            "id": self.id,
            "name": self.name,
            "population": self.population,
            "capital": self.capital
        }
    
    @classmethod
    def from_dict(cls, data):
        return cls(data['id'], data['name'], data['population'], data['capital'])

def read_provinces_from_json(file_name):
    try:
        with open(file_name, 'r') as file:
            data = json.load(file)
            provinces = [Province.from_dict(province_data) for province_data in data]
            return provinces
    except FileNotFoundError:
        return []

def write_provinces_to_json(provinces, file_name):
    data = [province.to_dict() for province in provinces]
    with open(file_name, 'w') as file:
        json.dump(data, file, indent=4)

def enter_province_information():
    print("Enter Province Information:")
    id = input("ID: ")
    name = input("Name: ")
    population = input("Population: ")
    capital = input("Capital: ")
    return Province(id, name, population, capital)

def main():
    json_file = 'provinces.json'
    provinces = read_provinces_from_json(json_file)
    
    # Option to enter new province information
    new_province = enter_province_information()
    provinces.append(new_province)
    
    # Write updated provinces list to JSON file
    write_provinces_to_json(provinces, json_file)
    
    # Print all provinces read from JSON file (for verification)
    print("\nProvinces:")
    for province in provinces:
        print(f"ID: {province.id}, Name: {province.name}, Population: {province.population}, Capital: {province.capital}")

if __name__ == "__main__":
    main()
