import json

class song_mixer:
    def __init__(self, id, name, color, number_of_levels):
        self.id = id
        self.name = name
        self.color = color
        self.number_of_levels = number_of_levels

    def __str__(self):
        return f"Song Mixer(id={self.id}, name={self.name}, color={self.color}, number of levels={self.number_of_levels})"

    @property
    def get_id(self):
        return self.id
    
    @property
    def get_name(self):
        return self.name
    
    @property
    def get_color(self):
        return self.color
    
    @property
    def get_number_of_levels(self):
        return self.number_of_levels
    
    def to_dict(self):
        return {
            "id": self.id,
            "name": self.name,
            "color": self.color,
            "number_of_levels": self.number_of_levels
        }

mixer_json = json.dumps(mixer.to_dict(), indent=4)
print(mixer_json)
