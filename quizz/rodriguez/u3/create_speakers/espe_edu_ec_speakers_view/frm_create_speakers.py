import tkinter as tk
from tkinter import messagebox
from pymongo import MongoClient

class SpeakerApp:
    class Speaker:
        def __init__(self, id, name, price):
            self.id = id
            self.name = name
            self.price = price

        @property
        def id(self):
            return self._id

        @id.setter
        def id(self, value):
            self._id = value

        @property
        def name(self):
            return self._name

        @name.setter
        def name(self, value):
            self._name = value

        @property
        def price(self):
            return self._price

        @price.setter
        def price(self, value):
            self._price = value

    def __init__(self, master):
        self.master = master
        self.master.title("Create Speaker")

        self.label_id = tk.Label(master, text="Id:")
        self.label_name = tk.Label(master, text="Name:")
        self.label_price = tk.Label(master, text="Price:")

        self.entry_id = tk.Entry(master)
        self.entry_name = tk.Entry(master)
        self.entry_price = tk.Entry(master)

        self.button_save = tk.Button(master, text="Save", command=self.save_speaker)

        self.label_id.grid(row=0, column=0, padx=10, pady=10)
        self.entry_id.grid(row=0, column=1, padx=10, pady=10)
        self.label_name.grid(row=1, column=0, padx=10, pady=10)
        self.entry_name.grid(row=1, column=1, padx=10, pady=10)
        self.label_price.grid(row=2, column=0, padx=10, pady=10)
        self.entry_price.grid(row=2, column=1, padx=10, pady=10)
        self.button_save.grid(row=3, columnspan=2, pady=10)

    def save_speaker(self):
        id = self.entry_id.get()
        name = self.entry_name.get()
        price = self.entry_price.get()

        try:
            price = float(price)
            new_speaker = self.Speaker(id, name, price)
            self.create_speaker(new_speaker)
            messagebox.showinfo("Success", "Speaker saved successfully")
        except ValueError:
            messagebox.showerror("Error", "Please enter a valid price.")

    def create_speaker(self, speaker):
        client = MongoClient("mongodb+srv://ismael:ismael@cluster0.tayl6re.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")
        database = client["oop"]
        collection = database["speakers"]

        document = {
            "id": speaker.id,
            "name": speaker.name,
            "price": speaker.price,
            "iva": self.calculate_iva(speaker.price)
        }
        collection.insert_one(document)
        client.close()

    def calculate_iva(self, price):
        return price * 0.12

if __name__ == "__main__":
    root = tk.Tk()
    app = SpeakerApp(root)
    root.mainloop()
