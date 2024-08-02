import tkinter as tk
from tkcalendar import DateEntry
from tkinter import messagebox
from tkinter import ttk

class Interface:
    def __init__(self, root):
        self.root = root
        self.root.configure(bg="gray")
        self.root.title("Animal Registration")
        
        # Set the initial size of the window
        self.root.geometry("450x600")  # Width x Height

        # Title
        tk.Label(root, text="ZOO", font=("Arial", 16), bg="gray").grid(row=0, column=1, pady=20)

        # ID
        tk.Label(root, text="ID:", bg="lightblue", borderwidth=1, relief="solid").grid(row=1, column=0, sticky='e', padx=10, pady=5)
        self.id_entry = tk.Entry(root, borderwidth=1, relief="solid")
        self.id_entry.grid(row=1, column=1, padx=10, pady=5)

        # Description
        tk.Label(root, text="Description:", bg="lightblue", borderwidth=1, relief="solid").grid(row=2, column=0, sticky='ne', padx=10, pady=5)
        self.description_entry = tk.Text(root, height=4, width=30, borderwidth=1, relief="solid")
        self.description_entry.grid(row=2, column=1, padx=10, pady=5, sticky='w')

        # Born On Date
        tk.Label(root, text="Born On Date:", bg="lightblue", borderwidth=1, relief="solid").grid(row=3, column=0, sticky='e', padx=10, pady=5)
        self.born_on_date_entry = DateEntry(root, width=17, background='darkblue', foreground='white', borderwidth=1)
        self.born_on_date_entry.grid(row=3, column=1, padx=10, pady=5, sticky='w')

        # Gender
        tk.Label(root, text="Gender:", bg="lightblue", borderwidth=1, relief="solid").grid(row=4, column=0, sticky='e', padx=10, pady=5)
        self.gender_var = tk.StringVar(value='m')
        tk.Radiobutton(root, text="Male", variable=self.gender_var, value='m', bg="lightblue").grid(row=4, column=1, padx=5, pady=5, sticky='w')
        tk.Radiobutton(root, text="Female", variable=self.gender_var, value='f', bg="lightblue").grid(row=4, column=1, padx=5, pady=5, sticky='e')

        # Cage Type
        tk.Label(root, text="Cage Type:", bg="lightblue", borderwidth=1, relief="solid").grid(row=5, column=0, sticky='e', padx=10, pady=5)
        self.cage_type_var = tk.StringVar(value="")
        cage_types = ["Felines Cage", "Loop", "Monkey Cage"]
        self.cage_type_combobox = ttk.Combobox(root, textvariable=self.cage_type_var, values=cage_types)
        self.cage_type_combobox.grid(row=5, column=1, padx=10, pady=5)

        # Food
        tk.Label(root, text="Food:", bg="lightblue", borderwidth=1, relief="solid").grid(row=6, column=0, sticky='e', padx=10, pady=5)
        self.food_var = tk.StringVar(value="")
        food_options = ["Deer", "Meat", "Grains", "Fish"]
        self.food_combobox = ttk.Combobox(root, textvariable=self.food_var, values=food_options)
        self.food_combobox.grid(row=6, column=1, padx=10, pady=5)

        # Number of Bones
        tk.Label(root, text="Number of Bones:", bg="lightblue", borderwidth=1, relief="solid").grid(row=7, column=0, sticky='e', padx=10, pady=5)
        self.number_of_bones_entry = tk.Entry(root, borderwidth=1, relief="solid")
        self.number_of_bones_entry.grid(row=7, column=1, padx=10, pady=5)

        # Is Vertebrate
        tk.Label(root, text="Is Vertebrate:", bg="lightblue", borderwidth=1, relief="solid").grid(row=8, column=0, sticky='e', padx=10, pady=5)
        self.vertebrate_var = tk.BooleanVar()
        tk.Checkbutton(root, variable=self.vertebrate_var, bg="lightblue").grid(row=8, column=1, padx=10, pady=5)

        # Register and Feed Buttons
        self.register_button = tk.Button(root, text="Register", bg="lightgreen", borderwidth=2, relief="solid", command=self.submit_data)
        self.register_button.grid(row=9, column=1, padx=10, pady=20, sticky='e')
        
        self.feed_button = tk.Button(root, text="Feed", bg="lightgreen", borderwidth=2, relief="solid", command=self.feed_animal)
        self.feed_button.grid(row=9, column=1, padx=10, pady=20, sticky='w')

    def submit_data(self):
        # Retrieve and display the data entered by the user
        try:
            animal_id = self.id_entry.get()
            description = self.description_entry.get("1.0", tk.END).strip()  # Get the text from the Text widget
            born_on_date = self.born_on_date_entry.get_date()  # Get the selected date
            gender = self.gender_var.get()
            cage_type = self.cage_type_var.get()
            food = self.food_var.get()
            number_of_bones = self.number_of_bones_entry.get()
            vertebrate = self.vertebrate_var.get()

            # Display the collected data
            data_message = (
                f"ID: {animal_id}\n"
                f"Description: {description}\n"
                f"Born On Date: {born_on_date}\n"
                f"Gender: {gender}\n"
                f"Cage Type: {cage_type}\n"
                f"Food: {food}\n"
                f"Number of Bones: {number_of_bones}\n"
                f"Is Vertebrate: {'Yes' if vertebrate else 'No'}"
            )

            messagebox.showinfo("Entered Data", data_message)

        except Exception as e:
            messagebox.showerror("Error", f"An error occurred: {e}")

    def feed_animal(self):
        # Functionality for the Feed button
        messagebox.showinfo("Feed", "The animal has been fed!")

def main():
    root = tk.Tk()
    app = Interface(root)
    root.mainloop()

if __name__ == "__main__":
    main()
