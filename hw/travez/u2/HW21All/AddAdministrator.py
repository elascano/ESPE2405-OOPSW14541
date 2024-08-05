import json
import tkinter as tk
from tkinter import ttk

from pymongo import MongoClient

class App:
    def __init__(self, root):
        self.root = root
        self.root.title("Select new administrator")
        
        self.user_data = {
            "1753597796": {"email": "ismael@gmail.com", "name": "Ismael Travez", "grade": "Public servant"},
            "1751080803": {"email": "Cristian@gmail.com", "name": "Cristian Jimenes", "grade": "Public servant"},
            "1516141917": {"email": "maria@gmail.com", "name": "Maria Diaz", "grade": "Public servant"},
            "1635290428": {"email": "marco@hotmail.com", "name": "Marco Paredes", "grade": "Lieutenant"}
        }
        
        self.label = tk.Label(root, text="Select id:")
        self.label.grid(row=0, column=0, padx=10, pady=10)
        
        self.selected_id = tk.StringVar()
        self.combobox = ttk.Combobox(root, textvariable=self.selected_id, state='readonly')
        self.combobox['values'] = list(self.user_data.keys())
        self.combobox.grid(row=0, column=1, padx=10, pady=10)
        self.combobox.bind("<<ComboboxSelected>>", self.update_user_info)
        
        self.info_label = tk.Label(root, text="Selected User information:")
        self.info_label.grid(row=1, column=0, columnspan=2, padx=10, pady=10)
        
        self.email_label = tk.Label(root, text="Email:")
        self.email_label.grid(row=2, column=0, padx=10, pady=5, sticky='E')
        self.email_value = tk.Label(root, text="")
        self.email_value.grid(row=2, column=1, padx=10, pady=5, sticky='W')
        
        self.name_label = tk.Label(root, text="Name:")
        self.name_label.grid(row=3, column=0, padx=10, pady=5, sticky='E')
        self.name_value = tk.Label(root, text="")
        self.name_value.grid(row=3, column=1, padx=10, pady=5, sticky='W')
        
        self.grade_label = tk.Label(root, text="Grade:")
        self.grade_label.grid(row=4, column=0, padx=10, pady=5, sticky='E')
        self.grade_value = tk.Label(root, text="")
        self.grade_value.grid(row=4, column=1, padx=10, pady=5, sticky='W')
        
        self.cancel_button = tk.Button(root, text="Cancel", command=root.quit)
        self.cancel_button.grid(row=5, column=0, padx=10, pady=10)
        
        self.apply_button = tk.Button(root, text="Apply", command=self.apply_changes)
        self.apply_button.grid(row=5, column=1, padx=10, pady=10)
    
    def update_user_info(self, event):
        user_id = self.selected_id.get()
        user_info = self.user_data.get(user_id, {})
        
        self.email_value.config(text=user_info.get("email", ""))
        self.name_value.config(text=user_info.get("name", ""))
        self.grade_value.config(text=user_info.get("grade", ""))
    
    def apply_changes(self):
        user_id = self.selected_id.get()
        user_json = self.user_data.get(user_id, {})
        print(f"Changes applied for user ID: {user_id}")
        print(json.dumps(user_json, indent=4))

        # MongoDB
        client = MongoClient("mongodb+srv://ismael:ismael@cluster0.tayl6re.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")
        database = client["oop"]
        collection = database["administrators"]

        collection.insert_one(user_json)
        client.close()

        


if __name__ == "__main__":

    root = tk.Tk()
    app = App(root)
    root.mainloop()
