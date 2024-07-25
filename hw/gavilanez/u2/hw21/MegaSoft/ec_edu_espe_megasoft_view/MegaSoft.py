from tkinter import *
from tkinter.ttk import Progressbar
import sys
import Menu
import os

root=Tk()

image=PhotoImage(file ='ec_edu_espe_megasoft_view\\dev-dynasty.png')

height= 653
width = 736
x = (root.winfo_screenwidth()//2)-(width//2)
y = (root.winfo_screenheight()//2)-(height//2)
root.geometry('{}x{}+{}+{}'.format(width, height, x, y))
root.overrideredirect(1)

root.wm_attributes('-topmost', True)
root.lift()
root.wm_attributes("-topmost", True)
root.wm_attributes("-disabled", True)
root.wm_attributes("-transparentcolor", "while")

bg_label=Label(root, image=image ,bg='while')
bg_label.place(x=0,y=0)

progress_label= Label(root, text="Cargando...", font=('Comic Sans MS',13,'bold'),fg='#14183e',bg='#71b3ef')
progress_label.place(x=200,y=450)
progress=Progressbar(root, orient=HORIZONTAL, length=360, mode='determinate')
progress.place(x=200,y=480)

def top():
    root.withdraw()
    os.system("python Menu.py")
    root.destroy()

i = 0

def load():
    global i
    if i<=10:
        texto='Cargando...'+ (str(10*i)+'%')
        progress_label.config(text=texto)
        progress_label.after(1000, load)
        progress['value']=10*i
        i+=1
    else:
        top()

load()

root.mainloop()