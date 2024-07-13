import tkinter as tk
from tkinter import ttk

# Create the main window
root = tk.Tk()
root.title("ANIMALS")

# Define and place the ID field
tk.Label(root, text="id:").grid(row=0, column=0, padx=10, pady=5, sticky="e")
id_entry = tk.Entry(root)
id_entry.grid(row=0, column=1, padx=10, pady=5)

# Define and place the Food listbox
tk.Label(root, text="Food:").grid(row=0, column=2, padx=10, pady=5, sticky="e")
food_listbox = tk.Listbox(root, height=4, selectmode=tk.MULTIPLE)
foods = ["Mouse", "Rabbit", "Fish", "Deer", "Meat", "Grains"]
for food in foods:
    food_listbox.insert(tk.END, food)
food_listbox.grid(row=0, column=3, padx=10, pady=5)

# Define and place the Description field
tk.Label(root, text="Description:").grid(row=1, column=0, padx=10, pady=5, sticky="ne")
description_text = tk.Text(root, height=5, width=40)
description_text.grid(row=1, column=1, columnspan=3, padx=10, pady=5)

# Define and place the Born On Date field
tk.Label(root, text="Born On Date:").grid(row=2, column=0, padx=10, pady=5, sticky="e")
born_date_entry = tk.Entry(root)
born_date_entry.grid(row=2, column=1, padx=10, pady=5)

# Define and place the Gender dropdown
tk.Label(root, text="Gender").grid(row=3, column=0, padx=10, pady=5, sticky="e")
gender_combobox = ttk.Combobox(root, values=["Male", "Female"], state="readonly")
gender_combobox.current(0)
gender_combobox.grid(row=3, column=1, padx=10, pady=5)

# Define and place the Cage dropdown
tk.Label(root, text="Cage").grid(row=4, column=0, padx=10, pady=5, sticky="e")
cage_combobox = ttk.Combobox(root, values=["Feline Cage", "Canine Cage", "Avian Cage"], state="readonly")
cage_combobox.current(0)
cage_combobox.grid(row=4, column=1, padx=10, pady=5)

# Define and place the Number of bones slider
tk.Label(root, text="Number of bones:").grid(row=5, column=0, padx=10, pady=5, sticky="e")
bones_scale = tk.Scale(root, from_=0, to=100, orient=tk.HORIZONTAL)
bones_scale.grid(row=5, column=1, padx=10, pady=5)

# Define and place the Vertebrate checkbox
vertebrate_var = tk.IntVar()
vertebrate_checkbox = tk.Checkbutton(root, text="Vertebrate", variable=vertebrate_var)
vertebrate_checkbox.grid(row=6, column=1, padx=10, pady=5, sticky="w")

# Define and place the Register and Feed buttons
register_button = tk.Button(root, text="Register")
register_button.grid(row=7, column=1, padx=10, pady=5, sticky="e")

feed_button = tk.Button(root, text="Feed")
feed_button.grid(row=7, column=2, padx=10, pady=5, sticky="w")

# Run the main event loop
root.mainloop()
