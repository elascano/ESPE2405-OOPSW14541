import tkinter as tk
from tkinter import ttk

# Crear la ventana principal
root = tk.Tk()
root.title("ANIMALS")
root.geometry("700x450")

# Función para registrar
def register():
    print("Registered")

# Función para alimentar
def feed():
    print("Fed")

# ID
tk.Label(root, text="id").grid(row=0, column=0, padx=10, pady=10, sticky=tk.E)
id_entry = tk.Entry(root)
id_entry.grid(row=0, column=1, padx=10, pady=10, sticky=tk.W)

# Description
tk.Label(root, text="Description").grid(row=1, column=0, padx=10, pady=10, sticky=tk.E)
description_text = tk.Text(root, height=5, width=40)
description_text.grid(row=1, column=1, padx=10, pady=10, sticky=tk.W)

# Born on Day
tk.Label(root, text="Born on Day").grid(row=2, column=0, padx=10, pady=10, sticky=tk.E)
born_on_day_entry = tk.Entry(root)
born_on_day_entry.grid(row=2, column=1, padx=10, pady=10, sticky=tk.W)

# Gender
tk.Label(root, text="Gender").grid(row=3, column=0, padx=10, pady=10, sticky=tk.E)
gender_combobox = ttk.Combobox(root, values=["Male", "Female"])
gender_combobox.set("Male")
gender_combobox.grid(row=3, column=1, padx=10, pady=10, sticky=tk.W)

# Number of bones
tk.Label(root, text="Number of bones").grid(row=4, column=0, padx=10, pady=10, sticky=tk.E)
bones_slider = tk.Scale(root, from_=0, to=100, orient=tk.HORIZONTAL)
bones_slider.grid(row=4, column=1, padx=10, pady=10, sticky=tk.W)

# Cage
tk.Label(root, text="Cage").grid(row=5, column=0, padx=10, pady=10, sticky=tk.E)
cage_combobox = ttk.Combobox(root, values=["Monkey Cage", "Lion Cage", "Bird Cage","Feline Cage"])
cage_combobox.set("Monkey Cage")
cage_combobox.grid(row=5, column=1, padx=10, pady=10, sticky=tk.W)

# Vertebrate
tk.Label(root, text="Vertebrate").grid(row=6, column=0, padx=10, pady=10, sticky=tk.E)
vertebrate_var = tk.IntVar()
tk.Checkbutton(root, text="yes", variable=vertebrate_var).grid(row=6, column=1, padx=10, pady=10, sticky=tk.W)

# Food list
tk.Label(root, text="Food").grid(row=1, column=2, padx=10, pady=10, sticky=tk.E)
food_listbox = tk.Listbox(root, selectmode=tk.MULTIPLE)
food_items = ["Mouse", "Rabbit", "Meat", "Grains", "Fish"]
for item in food_items:
    food_listbox.insert(tk.END, item)
food_listbox.grid(row=0, column=3, rowspan=6, padx=10, pady=10, sticky=tk.W)

# Buttons
register_button = tk.Button(root, text="Register", command=register)
register_button.grid(row=7, column=0, padx=10, pady=10)
feed_button = tk.Button(root, text="Feed", command=feed)
feed_button.grid(row=7, column=1, padx=10, pady=10)

# Iniciar el bucle de eventos
root.mainloop()
