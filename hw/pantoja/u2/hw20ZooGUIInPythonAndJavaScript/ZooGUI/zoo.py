import tkinter as tk
from tkinter import ttk

# David Pantoja, Java Squad, DCCO-ESPE

class FrmAnimal:
    def __init__(self, root):
        self.root = root
        self.root.title("Animals")

        # Crear widgets
        self.label_title = ttk.Label(self.root, text="ANIMALS", font=("Arial", 18))
        self.label_title.pack(pady=10)

        self.frame_info = ttk.Frame(self.root)
        self.frame_info.pack(padx=20, pady=10)

        self.label_id = ttk.Label(self.frame_info, text="ID:")
        self.label_id.grid(row=0, column=0, padx=5, pady=5, sticky="e")
        self.entry_id = ttk.Entry(self.frame_info)
        self.entry_id.grid(row=0, column=1, padx=5, pady=5)

        self.label_description = ttk.Label(self.frame_info, text="Description:")
        self.label_description.grid(row=1, column=0, padx=5, pady=5, sticky="e")
        self.text_description = tk.Text(self.frame_info, width=30, height=4)
        self.text_description.grid(row=1, column=1, padx=5, pady=5)

        self.label_born_date = ttk.Label(self.frame_info, text="Born on Date:")
        self.label_born_date.grid(row=2, column=0, padx=5, pady=5, sticky="e")
        self.entry_born_date = ttk.Entry(self.frame_info)
        self.entry_born_date.grid(row=2, column=1, padx=5, pady=5)

        self.label_gender = ttk.Label(self.frame_info, text="Gender:")
        self.label_gender.grid(row=3, column=0, padx=5, pady=5, sticky="e")
        self.combo_gender = ttk.Combobox(self.frame_info, values=["Male", "Female"])
        self.combo_gender.grid(row=3, column=1, padx=5, pady=5)

        self.label_cage = ttk.Label(self.frame_info, text="Cage:")
        self.label_cage.grid(row=4, column=0, padx=5, pady=5, sticky="e")
        self.combo_cage = ttk.Combobox(self.frame_info, values=["Felines cage", "Monkey cage", "Bird cage", "Shark cage"])
        self.combo_cage.grid(row=4, column=1, padx=5, pady=5)

        self.label_bones = ttk.Label(self.frame_info, text="Number of Bones:")
        self.label_bones.grid(row=5, column=0, padx=5, pady=5, sticky="e")
        self.scale_bones = ttk.Scale(self.frame_info, from_=0, to=100, orient=tk.HORIZONTAL)
        self.scale_bones.grid(row=5, column=1, padx=5, pady=5)

        self.label_vertebrate = ttk.Label(self.frame_info, text="Vertebrate:")
        self.label_vertebrate.grid(row=6, column=0, padx=5, pady=5, sticky="e")
        self.check_vertebrate = ttk.Checkbutton(self.frame_info, text="Vertebrate")
        self.check_vertebrate.grid(row=6, column=1, padx=5, pady=5)

        self.label_food = ttk.Label(self.frame_info, text="Food:")
        self.label_food.grid(row=7, column=0, padx=5, pady=5, sticky="e")
        self.list_food = tk.Listbox(self.frame_info, selectmode=tk.MULTIPLE, height=4)
        food_options = ["Mouse", "Rabbit", "Deer", "Meat", "Grains", "Fish"]
        for food in food_options:
            self.list_food.insert(tk.END, food)
        self.list_food.grid(row=7, column=1, padx=5, pady=5)

        self.frame_buttons = ttk.Frame(self.root)
        self.frame_buttons.pack(pady=10)

        self.button_register = ttk.Button(self.frame_buttons, text="Register", command=self.register)
        self.button_register.pack(side=tk.LEFT, padx=10)

        self.button_feed = ttk.Button(self.frame_buttons, text="Feed", command=self.feed)
        self.button_feed.pack(side=tk.LEFT, padx=10)

    def register(self):
        pass

    def feed(self):
        pass

if __name__ == "__main__":
    root = tk.Tk()
    app = FrmAnimal(root)
    root.mainloop()
