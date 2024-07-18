import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_songplaylist_model.song import Song
from utils.json_manager import json_manager

class Playlist:
    def __init__(self, id, playlist_name):
        self.__id = id
        self.__playlist_name = playlist_name
        self.__songs = [] 

    def to_dict(self):
        return {
            'id': self.__id,
            'playlist_name': self.__playlist_name,
            'songs': [song.to_dict() for song in self.__songs]
        }

    @staticmethod
    def create_playlist():
        while True:
            
           
            print("\n" + "*"*40)
            try:
                playlist_id = int(input("Enter playlist id: "))
                
            except ValueError:
                print("Invalid input. Please enter a number.\n")
                os.system('pause')
                os.system('cls')
                continue

            existing_playlists = json_manager.load_from_file('Playlists.json')
            if any(playlist['id'] == playlist_id for playlist in existing_playlists):
                print("ID already exists. Please enter a unique ID.")
                continue

            playlist_name = input("Enter playlist name: ")
            break

        playlist = Playlist(playlist_id, playlist_name)

        while True:
            songs = json_manager.load_from_file('Songs.json')
            
            if not songs:
                print("No songs available.")
                break
            print()
            print("-" * 78)
            print("{:<5} {:<30} {:<30} {:<20}".format("ID", "Name", "Artist", "Genre"))
            print("-" * 78)
            for song in songs:
                print("{:<5} {:<30} {:<30} {:<20}".format(song['id'], song['name_song'], song['artist'], song['gender']))

            try:
                print("-" * 78)
                song_id = int(input("Enter the song ID to add to the playlist: "))
                print("-" * 78)
            except ValueError:
                print("Invalid input. Please enter a number.\n")
                os.system('pause')
                os.system('cls')
                continue

            selected_song = next((s for s in songs if s['id'] == song_id), None)

            if selected_song:
                song_obj = Song(selected_song['id'], selected_song['name_song'], selected_song['artist'], (song_id, selected_song['gender']))
                playlist.__songs.append(song_obj)
                print("\nSong added to the playlist successfully!\n")
            else:
                print("Invalid song ID.\n")
                os.system('pause')
                os.system('cls')
                continue
            
            while(True):
                another = input("Do you want to add another song? (yes/no): ")
                if(another=='yes'or another=='no'):
                    break
                else:
                    print("Invalid option. Try again.\n")
                    os.system('pause')
                    os.system('cls')

            if another.lower() != 'yes':
                break

        json_manager.save_to_file('Playlists.json', playlist)
        print("Playlist created successfully!")

    @staticmethod
    def show_playlist():
        while(True):
            print("\n" + "*"*40)
            try:
                playlist_id = int(input("Enter the playlist ID to show: "))
                break
            except ValueError:
                print("Invalid input. Please enter a number.\n")
                os.system('pause')
                os.system('cls')

        playlists = json_manager.load_from_file('Playlists.json')

        selected_playlist = next((p for p in playlists if p['id'] == playlist_id), None)

        if selected_playlist:
            print("-"*78)
            print(f"Playlist Name: {selected_playlist['playlist_name']}")
            print("-"*78)
            print("{:<5} {:<30} {:<30} {:<20}".format("ID", "Name", "Artist", "Genre"))
            print("-" * 78)
            for song in selected_playlist['songs']:
                print("{:<5} {:<30} {:<30} {:<20}".format(song['id'], song['name_song'], song['artist'], song['gender']))
            print("-"*78)
        else:
            print("Playlist not found.")
        os.system('pause')

    @staticmethod
    def search_in_playlists():
        while(True):
            print("\n" + "*"*40)
            try:
                song_id = int(input("Enter the song ID to search for: "))
                break
            except:
                print("Invalid input. Please enter a number.\n")
                os.system('pause')
                os.system('cls')

        playlists = json_manager.load_from_file('Playlists.json')

        found_playlists = [
            {'id': p['id'], 'playlist_name': p['playlist_name']}
            for p in playlists if any(song['id'] == song_id for song in p['songs'])
        ]

        if found_playlists:
            song_info = next(
                (song for p in playlists for song in p['songs'] if song['id'] == song_id), None
            )
            if song_info:
                print("-"*25)
                print(f"Song with ID {song_info['id']} and name '{song_info['name_song']}' was found in:")
                print("-"*25)
                print("{:<5} {:<20}".format("ID", "Playlist Name"))
                print("-"*25)
                for playlist in found_playlists:
                    print("{:<5} {:<20}".format(playlist['id'], playlist['playlist_name']))
                print("-"*25)
        else:
            print("Song not found in any playlists.")
        os.system('pause')

