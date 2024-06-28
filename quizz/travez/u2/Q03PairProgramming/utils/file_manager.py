import json
import pickle

class FileManager:
    @staticmethod
    def load(file_name: str):
        with open(file_name, 'r') as f:
            return json.load(f)
        
    @staticmethod
    def save_obj(pc, file_path):
        try:
            with open(file_path, 'wb') as file:
                pickle.dump(pc, file)
            print(f"PC data saved to " + file_path)
        except IOError as e:
            print(f"Error saving file " + file_path)
