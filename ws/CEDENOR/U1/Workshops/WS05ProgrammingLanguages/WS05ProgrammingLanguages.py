contador = 0;
y = int(input("numero de la tabla: "))
x = int(input("Ingresa hasta que numero quieres multiplicar : "));
while contador < x:
    contador+= 1;
    resultado = y * contador;
    print(f"{y} X {contador} =  {resultado}")