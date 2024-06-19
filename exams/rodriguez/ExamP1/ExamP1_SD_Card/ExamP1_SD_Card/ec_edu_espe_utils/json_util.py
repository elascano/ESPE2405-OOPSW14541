import json

def write_json(file_path, data):
    with open(file_path, 'w') as json_file:
        json.dump(data, json_file, indent=4)

def read_json(file_path):
    with open(file_path, 'r') as json_file:
        return json.load(json_file)