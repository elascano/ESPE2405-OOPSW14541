import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_espe_songplaylist_model.playlist import Playlist
from ec_edu_espe_songplaylist_model.song import Song

class Song_Playlist:
       
    def main():
        while True:
            print("\n" + "*"*40)
            print("SONG PLAYLIST GENERATOR")
            print("*"*40)
            print("1. Create Song")
            print("2. Create Playlist ")
            print("3. Show Playlist")
            print("4. Search Song in Playlists")
            print("5. Exit")
            print("*"*40)

            try:
                choice = int(input("Enter your choice: "))
            except ValueError:
                print("Invalid Value. Try again\n") 
                os.system('pause')
                os.system('cls')
                continue
                
            
            os.system('cls')
            if choice == 1:
                Song.add_song()
            elif choice == 2:
                Playlist.create_playlist()
            elif choice == 3:
                Playlist.show_playlist()
            elif choice == 4:
                Playlist.search_in_playlists()
            elif choice == 5:
                print("See you later :)\n")
                os.system('pause')
                break
            else:
                print("Invalid choice. Please try again.")
                os.system('pause')

            os.system('cls')

if __name__ == "__main__":
    Song_Playlist.main()
