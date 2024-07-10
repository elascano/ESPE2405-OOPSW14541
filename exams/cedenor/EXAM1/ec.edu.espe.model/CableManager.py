class CableManager:
    def __init__(self):
        self.cables = []

    def add_cable(self, cable):
        self.cables.append(cable)

    def save_to_json(self, filename):
        with open(filename, 'w') as file:
            json.dump([cable.to_dict() for cable in self.cables], file, indent=4)

    def load_from_json(self, filename):
        with open(filename, 'r') as file:
            cables_data = json.load(file)
            self.cables = [Cable.from_dict(cable_dict) for cable_dict in cables_data]

    def print_cables(self):
        for cable in self.cables:
            print(f"ID: {cable.id}, Type: {cable.type}, Length: {cable.length}, Usage: {cable.usage}")