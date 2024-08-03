import tkinter as tk
from tkinter import ttk
from tkinter import messagebox

class MilitaryDiningHallApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Military Dining Hall Management System")
        self.root.geometry("400x300")

        # Create the main label
        self.title_label = tk.Label(self.root, text="Military Dining Hall", font=("Arial", 16))
        self.title_label.pack(pady=20)

        # Create the login and create new account buttons on the left
        self.left_frame = tk.Frame(self.root)
        self.left_frame.pack(side=tk.LEFT, padx=20)

        self.login_button = tk.Button(self.left_frame, text="Login", command=self.show_login_screen)
        self.login_button.pack(pady=10)

        self.create_account_button = tk.Button(self.left_frame, text="Create New Account", command=self.show_create_account_screen)
        self.create_account_button.pack(pady=10)

        # Create the exit button on the right
        self.exit_button = tk.Button(self.root, text="Exit", command=self.root.quit)
        self.exit_button.pack(side=tk.BOTTOM, pady=20, anchor=tk.SE)

    def show_login_screen(self):
        login_window = tk.Toplevel(self.root)
        login_window.title("Login")
        login_window.geometry("300x200")

        tk.Label(login_window, text="Email:").pack(pady=5)
        email_entry = tk.Entry(login_window)
        email_entry.pack(pady=5)

        tk.Label(login_window, text="Password:").pack(pady=5)
        password_entry = tk.Entry(login_window, show="*")
        password_entry.pack(pady=5)

        tk.Button(login_window, text="Login", command=lambda: self.login(email_entry.get(), password_entry.get())).pack(pady=10)

    def login(self, email, password):
        # Implement login logic here
        messagebox.showinfo("Login", f"Email: {email}\nPassword: {password}")

    def show_create_account_screen(self):
        create_account_window = tk.Toplevel(self.root)
        create_account_window.title("Create New Account")
        create_account_window.geometry("300x350")

        tk.Label(create_account_window, text="ID:").pack(pady=5)
        id_entry = tk.Entry(create_account_window)
        id_entry.pack(pady=5)

        tk.Label(create_account_window, text="Name:").pack(pady=5)
        name_entry = tk.Entry(create_account_window)
        name_entry.pack(pady=5)

        tk.Label(create_account_window, text="Grade:").pack(pady=5)
        grade_entry = tk.Entry(create_account_window)
        grade_entry.pack(pady=5)

        tk.Label(create_account_window, text="Type:").pack(pady=5)
        type_combobox = ttk.Combobox(create_account_window, values=["Chef", "Admin", "Commensal", "General Admin"])
        type_combobox.pack(pady=5)

        tk.Label(create_account_window, text="Balance:").pack(pady=5)
        balance_entry = tk.Entry(create_account_window)
        balance_entry.pack(pady=5)

        tk.Button(create_account_window, text="Create Account", command=lambda: self.create_account(id_entry.get(), name_entry.get(), grade_entry.get(), type_combobox.get(), balance_entry.get())).pack(pady=10)

    def create_account(self, user_id, name, grade, user_type, balance):
        # Implement create account logic here
        messagebox.showinfo("Create Account", f"ID: {user_id}\nName: {name}\nGrade: {grade}\nType: {user_type}\nBalance: {balance}")

if __name__ == "__main__":
    root = tk.Tk()
    app = MilitaryDiningHallApp(root)
    root.mainloop()
