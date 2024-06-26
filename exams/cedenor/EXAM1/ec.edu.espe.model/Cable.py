
import json

class Cable:
    def __init__(self, id, type, length, usage):
        self.id = id
        self.type = type
        self.length = length
        self.usage = usage

    def to_dict(self):
        return {
            "id": self.id,
            "type": self.type,
            "length": self.length,
            "usage": self.usage
        }

    @staticmethod
    def from_dict(cable_dict):
        return Cable(cable_dict["id"], cable_dict["type"], cable_dict["length"], cable_dict["usage"])