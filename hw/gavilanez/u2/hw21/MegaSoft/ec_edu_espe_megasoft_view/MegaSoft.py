from tkinter import *
from tkinter import ttk
from progressbar import *
# crear Ventana principa
root=Tk()

root.overrideredirect(True)

width=int(root.winfo_screenwidth()//1.5)
height = int(root.winfo_screenheight()//1.5)
#posicionar ventana al centro

pwidht = round(root.winfo_screenwidth()//2-width//2)
pheigth = round(root.winfo_screenheight()//2-height//2)
#dar tamaño a la ventana

root.geometry('{}x{}+{}+{}'.format(width,height,pwidht,pheigth))
# crear un frame para el titulo
fr_titulo=Frame(root)
fr_titulo.config(background='white')
fr_titulo.config(border='40')
fr_titulo.config(relief='sunken')
fr_titulo.pack(fill='x')
lb_titulo=Label(fr_titulo,text="Bienvenidos a Mega Soft",font="verdana 30 bold")
lb_titulo.config(background='white',foreground='black')
lb_titulo.pack(anchor=CENTER)
#frame para imagen

#frame pie de ventana
fr_piepagina=Frame(root)
fr_piepagina.config(background="grey",relief='sunken')
fr_piepagina.pack()

#progressbar
prgbar_loading = ttk.Progressbar(fr_piepagina)
prgbar_loading.config(length=width)
prgbar_loading.start(interval=100)
prgbar_loading.pack(anchor=CENTER)

lb_cargando=Label(fr_piepagina, text="Cargnado el sistema...",anchor='sw')
lb_cargando.config(foreground='white', font='Verdana 12 bold',width=width)
lb_cargando.pack()

def main():
    prgbar_loading.stop()
    root.destroy()
    
    ventana_principal=Tk()

    ancho=ventana_principal.winfo_screenwidth()
    alto=ventana_principal.winfo_screenheight()
    ventana_principal.geometry('{}x{}'.format(ancho,alto))
    lb_mensaje=Label(ventana_principal,text=' Mega Soft',font='Verdana 20 bold')
    lb_mensaje.config(foreground='grey',background='black')
    lb_mensaje.pack()

    lb_ingreso=Label(ventana_principal,text=' Desea ingresar como Administrador o como Usuario',font='Verdana 20 bold')
    lb_ingreso.config(foreground='grey',background='black')
    lb_ingreso.pack()

    texto = Entry(width=20, font=('Arial',14))
root.after(6000,main)
mainloop()