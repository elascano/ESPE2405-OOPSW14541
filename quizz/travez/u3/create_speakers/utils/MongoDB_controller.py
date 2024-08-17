import os
import sys
from pymongo import MongoClient

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from espe_edu_ec_speakers_controller.speaker_controller import speaker_controller
from espe_edu_ec_speakers_model.speaker import speaker

class MongoDB_controller():
    def create_speaker(self, speaker):
        client = MongoClient("mongodb+srv://ismael:ismael@cluster0.tayl6re.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")
        database = client["oop"]
        collection = database["speakers"]
        
        document = {
            "id": speaker.id,
            "name": speaker.name,
            "price": speaker.price,
            "iva": speaker_controller.calculate_iva(speaker.price)
        }
        collection.insert_one(document)
        client.close()
