import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_songplaylist_model.gender import Gender
from utils.json_manager import json_manager

class Song:
    def __init__(self, id, name_song, artist, gender):
        self.__id = id
        self.__name_song = name_song
        self.__artist = artist
        self.__gender = gender

    @property
    def id(self):
        return self.__id

    @property
    def name_song(self):
        return self.__name_song

    @property
    def artist(self):
        return self.__artist

    @property
    def gender(self):
        return self.__gender

    def __str__(self):
        return f"ID: {self.__id}, Name: {self.__name_song}, Artist: {self.__artist}, Genre: {self.__gender[1]}"

    def to_dict(self):
        return {
            'id': self.id,
            'name_song': self.name_song,
            'artist': self.artist,
            'gender': self.gender[1]  
        }

    @staticmethod
    def add_song():
        while True:
            print("\n" + "*"*40)
            try:
                id = int(input("Enter id: "))
            except ValueError:
                print("Invalid input. Please enter a number.\n")
                os.system('pause')
                os.system('cls')
                continue
                    

            existing_songs = json_manager.load_from_file('Songs.json')
            if any(song['id'] == id for song in existing_songs):
                print("ID already exists. Please enter a unique ID.")
                os.system('pause')
                os.system('cls')
                continue

            name_song = input("Enter song name: ")
            artist = input("Enter artist: ")
            

            while(True):
                print('\n'+"*"*40)
                print("Available genres:")
                print("*"*40)
                Gender.print_genders()
                print("*"*40)
                try:
                    gender_id = int(input("Enter the genre ID: "))
                    break
                except ValueError:
                    print("Invalid input. Please enter a number.\n")
                    os.system('pause')
                    os.system('cls')
                    
            chosen_gender = next((g for g in Gender.genders if g[0] == gender_id), None)

            if chosen_gender:
                new_song = Song(id, name_song, artist, chosen_gender)
                json_manager.save_to_file('Songs.json', new_song)
                print("Song added successfully!")
            else:
                print("Invalid genre ID.\n")
                os.system('pause')
                os.system('cls')
                
            print("\n" + "*"*40)
            another = input("Do you want to add another song? (yes/no): ")
            if another.lower() != 'yes':
                break
