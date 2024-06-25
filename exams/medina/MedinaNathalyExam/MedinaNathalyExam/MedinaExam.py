import json

class Hotel:
    def __init__(self, id, name, location, rating):
        self.id = id
        self.name = name
        self.location = location
        self.rating = rating
    
    def to_dict(self):
        return {
            'id': self.id,
            'name': self.name,
            'location': self.location,
            'rating': self.rating
        }
    
    @classmethod
    def from_dict(cls, data):
        return cls(data['id'], data['name'], data['location'], data['rating'])

    def __str__(self):
        return f"Hotel ID: {self.id}, Name: {self.name}, Location: {self.location}, Rating: {self.rating}"

# Inicializar  
hotels = []

for i in range(3):
    print(f"\nIngrese los datos del hotel {i + 1}:")
    id = input("ID hotel: ")
    name = input("Nombre hotel: ")
    location = input("Ubicación hotel: ")
    rating = (input("Rating hotel: "))
    
    hotel = Hotel(int(id), name, location, rating)
    hotels.append(hotel)

# Guardar la lista de hoteles en un archivo JSON
hotel_data = [hotel.to_dict() for hotel in hotels]

with open('hotels.json', 'w') as f:
    json.dump(hotel_data, f, indent=4)


with open('hotels.json', 'r') as f:
    data = json.load(f)
    hotels_from_json = [Hotel.from_dict(item) for item in data]

print("\nHoteles cargados desde el archivo JSON:")
for hotel in hotels_from_json:
    print(hotel)