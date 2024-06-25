# microphone.py
import json

class Microphone:
    def __init__(self, id, brand, model, frequency_response):
        self.id = id
        self.brand = brand
        self.model = model
        self.frequency_response = frequency_response

    def to_dict(self):
        return {
            "id": self.id,
            "brand": self.brand,
            "model": self.model,
            "frequency_response": self.frequency_response
        }

    @staticmethod
    def from_dict(data):
        return Microphone(
            id=data["id"],
            brand=data["brand"],
            model=data["model"],
            frequency_response=data["frequency_response"]
        )

    def __str__(self):
        return f"Microphone(id={self.id}, brand={self.brand}, model={self.model}, frequency_response={self.frequency_response})"
