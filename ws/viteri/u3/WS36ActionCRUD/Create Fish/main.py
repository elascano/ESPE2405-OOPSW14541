# main.py

from controller.fish_controller import add_fish
from view.fish_view import get_fish_details, show_fish_added

def main():
    name, species, age = get_fish_details()
    fish_id = add_fish(name, species, age)
    show_fish_added(fish_id)

if __name__ == "__main__":
    main()
