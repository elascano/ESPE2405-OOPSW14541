from tkinter import *

class MenuPage:
    def __init__(self, System_window):
        self.System_window =System_window

        System_window.rowconfigure(0, weight=1)
        System_window.columnconfigure(0, weight=1)
        height = 650
        width =700
        x = (System_window.winfo_screenwidth()//2)-(width//2)
        y = (System_window.winfo_screenheight()//4)-(height//4)
        System_window.geometry('{}x{}+{}+{}'.format(width, height, x, y))
        System_window.resizable(0, 0)

        icon = PhotoImage(files='MegaSoft\\dev-dynasty.png')
        System_window.iconphoto(True, icon)
        
        System_window.title('Mega Soft')

        Label(System_window, text='Usuario').place(x = 40,y = 60)
        Label(System_window, text='Contraseña').place(x = 40,y = 100)
        
        Button(System_window, text='Enviar').place(x = 40,y = 130)

        Entry(System_window, width=30).place(x= 110,y=60)
        Entry(System_window, width=30).place(x= 110,y=100)

def page():
    window= Tk()
    MenuPage(window)
    window.mainloop()

if __name__=='__main__':
    page()    