import tkinter as tk
from tkinter import ttk
from tkcalendar import DateEntry

# Saray Canarte, Code Creators 

root = tk.Tk()
root.title("ANIMALS")
root.geometry("500x500")

ttk.Label(root, text="ID:", anchor="e", width=20).grid(row=0, column=0, padx=10, pady=5, sticky="E")
id_entry = ttk.Entry(root)
id_entry.grid(row=0, column=1, padx=10, pady=5, sticky="W")

ttk.Label(root, text="Description:", anchor="e", width=20).grid(row=1, column=0, padx=10, pady=5, sticky="E")
description_entry = tk.Text(root, height=5, width=30)
description_entry.grid(row=1, column=1, padx=10, pady=5, sticky="W")


ttk.Label(root, text="Food:", anchor="e", width=20).grid(row=0, column=2, padx=10, pady=5, sticky="E")
food_listbox = tk.Listbox(root, selectmode=tk.MULTIPLE, height=6)
foods = ["Mouse", "Rabbit", "Fruits", "Meat", "Grains", "Fish"]
for food in foods:
    food_listbox.insert(tk.END, food)
food_listbox.grid(row=0, column=3, rowspan=3, padx=10, pady=5, sticky="W")


ttk.Label(root, text="Born on Date:", anchor="e", width=20).grid(row=2, column=0, padx=10, pady=5, sticky="E")
date_entry = DateEntry(root)
date_entry.grid(row=2, column=1, padx=10, pady=5, sticky="W")


ttk.Label(root, text="Gender:", anchor="e", width=20).grid(row=3, column=0, padx=10, pady=5, sticky="E")
gender_combobox = ttk.Combobox(root, values=["Male", "Female"])
gender_combobox.current(0)
gender_combobox.grid(row=3, column=1, padx=10, pady=5, sticky="W")


ttk.Label(root, text="Cage:", anchor="e", width=20).grid(row=4, column=0, padx=10, pady=5, sticky="E")
cage_combobox = ttk.Combobox(root, values=["Felines Cage", "Monkeys Cage", "Shark Pool", "Bird Cage"])
cage_combobox.current(0)
cage_combobox.grid(row=4, column=1, padx=10, pady=5, sticky="W")


ttk.Label(root, text="Number of Bones:", anchor="e", width=20).grid(row=5, column=0, padx=10, pady=5, sticky="E")
bones_scale = ttk.Scale(root, from_=0, to=500, orient=tk.HORIZONTAL)
bones_scale.grid(row=5, column=1, padx=10, pady=5, sticky="W")


vertebrate_var = tk.BooleanVar()
ttk.Label(root, text="Vertebrate:", anchor="e", width=20).grid(row=6, column=0, padx=10, pady=5, sticky="E")
ttk.Checkbutton(root, text="Is vertebrate", variable=vertebrate_var).grid(row=6, column=1, padx=10, pady=5, sticky="W")


register_button = ttk.Button(root, text="Register")
register_button.grid(row=7, column=0, padx=10, pady=20, sticky="E")


feed_button = ttk.Button(root, text="Feed")
feed_button.grid(row=7, column=3, padx=10, pady=20, sticky="W")


root.mainloop()