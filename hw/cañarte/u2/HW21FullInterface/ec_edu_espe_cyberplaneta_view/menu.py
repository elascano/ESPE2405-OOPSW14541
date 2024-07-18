import tkinter as tk
from tkinter import ttk
from pymongo import MongoClient

class LoginInterface(tk.Tk):
    def __init__(self):
        super().__init__()
        self.title("Sistema de Contribuyentes - Inicio de Sesión")
        self.geometry("300x200")
        self.resizable(False, False)
        self.username_label = ttk.Label(self, text="Usuario:")
        self.username_entry = ttk.Entry(self)
        self.password_label = ttk.Label(self, text="Contraseña:")
        self.password_entry = ttk.Entry(self, show="*")
        self.login_button = ttk.Button(self, text="Iniciar Sesión", command=self.login)

        self.username_label.pack(pady=10)
        self.username_entry.pack(pady=5)
        self.password_label.pack(pady=10)
        self.password_entry.pack(pady=5)
        self.login_button.pack(pady=20)

    def login(self):
        username = self.username_entry.get()
        password = self.password_entry.get()

        if username == "scurpin" and password == "1214":
            print("Inicio de sesión exitoso")
            self.destroy()
            self.open_main_menu()
        else:
            print("Credenciales inválidas")

    def open_main_menu(self):
        main_menu_root = tk.Tk()
        MainMenu(main_menu_root)
        main_menu_root.mainloop()

class SplashScreen:
    def __init__(self, root):
        self.root = root
        self.root.overrideredirect(True)
        self.window_width = 500
        self.window_height = 300

        screen_width = self.root.winfo_screenwidth()
        screen_height = self.root.winfo_screenheight()
        position_top = int(screen_height / 2 - self.window_height / 2)
        position_right = int(screen_width / 2 - self.window_width / 2)
        
        self.root.geometry(f"{self.window_width}x{self.window_height}+{position_right}+{position_top}")

        canvas = tk.Canvas(self.root, height=self.window_height, width=self.window_width, bg="lightgreen")
        canvas.pack()

        canvas.create_text(self.window_width / 2, self.window_height / 2, text="Cyber Planeta System", fill="darkblue", font=("Arial", 30, "bold"))
        self.root.after(3000, self.open_login_screen)

    def open_login_screen(self):
        self.root.destroy()
        login_root = LoginInterface()
        login_root.mainloop()

class MainMenu:
    def __init__(self, root):
        self.root = root
        self.root.title("Cyber Planeta System")
        self.root.geometry("450x400")
        self.root.configure(bg="white")

        top_frame = tk.Frame(self.root, bg="lightgreen", height=50)
        top_frame.pack(fill=tk.X, side=tk.TOP)
        bottom_frame = tk.Frame(self.root, bg="lightgreen", height=50)
        bottom_frame.pack(fill=tk.X, side=tk.BOTTOM)

        frame = tk.Frame(self.root, bg="white")
        frame.pack(pady=20, padx=20, fill=tk.BOTH, expand=True)

        title = tk.Label(frame, text="CYBER PLANETA SYSTEM", font=("Arial", 20, "bold"), fg="darkblue", bg="white")
        title.grid(row=0, column=0, columnspan=2, pady=10, sticky='n')

        contribuyente_label = tk.Label(frame, text="Contribuyente", font=("Arial", 14), bg="white", fg="darkblue", anchor='e')
        contribuyente_label.grid(row=1, column=0, sticky='e', padx=10, pady=10)
        contribuyente_combo = ttk.Combobox(frame, values=["Seleccione", "Agregar nuevo contribuyente", "Eliminar contribuyente", "Agregar proceso al contribuyente"])
        contribuyente_combo.grid(row=1, column=1, padx=10, pady=10)
        contribuyente_combo.current(0)

        agenda_label = tk.Label(frame, text="Agenda de Clasificación:", font=("Arial", 14), bg="white", fg="darkblue", anchor='e')
        agenda_label.grid(row=2, column=0, sticky='e', padx=10, pady=10)
        agenda_combo = ttk.Combobox(frame, values=["Seleccione", "Mostrar contribuyentes por el noveno dígito", "Mostrar notificaciones pendientes", "Comparar impuestos de dos meses", "Calcular promedio de impuestos mensuales"])
        agenda_combo.grid(row=2, column=1, padx=10, pady=10)
        agenda_combo.current(0)

        precios_label = tk.Label(frame, text="Sistema de precios:", font=("Arial", 14), bg="white", fg="darkblue", anchor='e')
        precios_label.grid(row=3, column=0, sticky='e', padx=10, pady=10)
        precios_combo = ttk.Combobox(frame, values=["Seleccione", "Calcular costo de un proceso", "Revisar ingresos totales", "Calculo de tasa de crecimiento anual (CAGR)"])
        precios_combo.grid(row=3, column=1, padx=10, pady=10)
        precios_combo.current(0)

if __name__ == "__main__":
    splash_root = tk.Tk()
    splash = SplashScreen(splash_root)
    splash_root.mainloop()
