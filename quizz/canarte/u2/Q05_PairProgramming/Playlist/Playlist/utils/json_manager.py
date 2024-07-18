import os
import json

class json_manager:
    @staticmethod
    def save_to_file(file_path, obj):
        if os.path.exists(file_path):
            with open(file_path, 'r') as file:
                try:
                    data = json.load(file)
                except json.JSONDecodeError:
                    data = []
        else:
            data = []

        data.append(obj.to_dict())

        with open(file_path, 'w') as file:
            json.dump(data, file, indent=4)

    @staticmethod
    def load_from_file(file_path):
        if os.path.exists(file_path):
            with open(file_path, 'r') as file:
                try:
                    return json.load(file)
                except json.JSONDecodeError:
                    return []
        else:
            return []

