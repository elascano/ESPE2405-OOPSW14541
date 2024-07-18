from sys import path
path.append("../Q03PairProgramming")

from ec_edu_espe_pcquote_model.pc import PC
from ec_edu_espe_pcquote_model.ram import Ram
from ec_edu_espe_pcquote_model.processor import Processor
from ec_edu_espe_pcquote_model.video_card import VideoCard
from ec_edu_espe_pcquote_controller.quoter import Quoter
from utils.file_manager import FileManager

processors_data = FileManager.load('processors.json')
video_cards_data = FileManager.load('videocards.json')
rams_data = FileManager.load('rams.json')

list_processors = [Processor(**data) for data in processors_data]
list_videocards = [VideoCard(**data) for data in video_cards_data]
list_rams = [Ram(**data) for data in rams_data]

pc = PC()

def main_menu():

    while True:
        print("\nWelcome to PC Quoter:")
        print("[MAIN MENU]")
        print("1.- Add Processor")
        print("2.- Add Video Card")
        print("3.- Add RAM Modules")
        print("4.- Review PC")
        print("5.- Exit")
        choice = int(input("Select an option: "))

        if choice == 1:
            view_processor_menu()
        elif choice == 2:
            view_video_card_menu()
        elif choice == 3:
            view_ram_menu()
        elif choice == 4:
            review_pc()
        elif choice == 5:
            break
        else:
            print("Invalid option, please try again.")

def view_processor_menu():
    print("[PROCESSOR MENU]")
    for i, view_list_processors in enumerate(list_processors):
        print(f"{i + 1}.- {view_list_processors.name} - Cores:{view_list_processors.core}  Price: ${view_list_processors.price}")
    choice = int(input("Select the processor you want to add: ")) - 1
    if 0 <= choice < len(list_processors):
        Quoter.add_processor(pc, list_processors[choice])
        print(f"Added processor {list_processors[choice].name}")
    else:
        print("Invalid option.")

def view_video_card_menu():
    print("[VIDEO CARD MENU]")
    for i, vc in enumerate(list_videocards):
        print(f"{i + 1}.- {vc.name} - ${vc.price}")
    choice = int(input("Select the video card you want to add: ")) - 1
    if 0 <= choice < len(list_videocards):
        Quoter.add_video_card(pc, list_videocards[choice])
        print(f"Added video card {list_videocards[choice].name}")
    else:
        print("Invalid option.")

def view_ram_menu():
    while len(pc.ram) < 4:
        print(f"[RAM MENU] (remaining slots: {4 - len(pc.ram)})")
        for i, ram in enumerate(list_rams):
            print(f"{i + 1}.- {ram.name} - ${ram.price}")
        choice = int(input("Select the RAM module you want to add: ")) - 1
        if 0 <= choice < len(list_rams):
            Quoter.add_ram(pc, list_rams[choice])
            print(f"Added RAM module {list_rams[choice].name}")
        else:
            print("Invalid option.")

        if len(pc.ram) >= 4:
            print("RAM limit reached.")
            break

        more_ram = int(input("Add more RAM? \n1.- Yes \n2.- No \n"))
        if more_ram != 1:
            break

def review_pc():
    if pc.is_complete():
        print(pc.summary())
        FileManager.save_obj(pc, 'pc.obj')
    else:
        print(pc.summary())

if __name__ == "__main__":
    main_menu()

