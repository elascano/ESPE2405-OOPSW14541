import sys
sys.path.append(r'C:\KennyPOO\ESPE2405-OOPSW14541\ws\gavilanez\u3\ws36ActionCRUD')

from ec_edu_espe_create_model.connect_base import insert_data
from ec_edu_espe_create_view.park import MainWindow
import tkinter as tk

def register(data):
    insert_data(data)

if __name__ == "__main__":
    root = tk.Tk()
    app = MainWindow(root, register)
    root.mainloop()