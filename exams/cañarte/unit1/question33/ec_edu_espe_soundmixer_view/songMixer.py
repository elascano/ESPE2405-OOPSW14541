import json

class SongMixer:
    def __init__(self, id, name, color, number_of_levels):
        self.id = id
        self.name = name
        self.color = color
        self.number_of_levels = number_of_levels

    def __str__(self):
        return f"Song Mixer(id={self.id}, name={self.name}, color={self.color}, number of levels={self.number_of_levels})"

class SoundMixer:
    @staticmethod
    def main():
        try:
            print("Saray's Canarte Sound Mixer")
            id = input("Enter id: ")
            name = input("Enter name: ")
            color = input("Enter color: ")
            number_of_levels = input("Enter number of levels: ")

            song_mixer_1 = SongMixer(id, name, color, number_of_levels)
            print("Song Mixer ---> \n", song_mixer_1)

            # Save to JSON
            SoundMixer.save_songmixer(song_mixer_1)

        except Exception as e:
            print(f"Error: {e}")

    @staticmethod
    def save_songmixer(songmixer):
        filename = "soundmixer.json"
        try:
            with open(filename, "a") as file:
                json.dump(songmixer.__dict__, file, indent=4)
                file.write("\n")
            print(f"Song Mixer data has been saved to {filename}")
        except FileNotFoundError:
            print(f"Error: Could not find file {filename}.")
        except Exception as e:
            print(f"Error saving song mixer information: {e}")

if __name__ == "__main__":
    SoundMixer.main()
