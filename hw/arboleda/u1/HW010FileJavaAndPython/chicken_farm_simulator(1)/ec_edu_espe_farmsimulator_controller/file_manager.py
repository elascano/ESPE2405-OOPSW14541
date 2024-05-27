import os

def save_to_file(chicken, filename='chicken_data.txt'):
    try:
        with open(filename, 'a') as file:
            file.write(str(chicken) + '\n')
        print("Data saved to file.")
    except Exception as e:
        print("An error occurred while saving to file.")
        print(e)

def delete_file(filename='chicken_data.txt'):
    if os.path.exists(filename):
        try:
            os.remove(filename)
            print("File deleted successfully.")
        except Exception as e:
            print("Failed to delete the file.")
            print(e)
    else:
        print("File does not exist.")
