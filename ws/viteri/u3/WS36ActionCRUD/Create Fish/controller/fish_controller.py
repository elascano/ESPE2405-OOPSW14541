# controller/fish_controller.py

from model.fish import Fish
from util.database import insert_fish

def add_fish(name, species, age):
    fish = Fish(name, species, age)
    fish_id = insert_fish(fish.to_dict())
    return fish_id