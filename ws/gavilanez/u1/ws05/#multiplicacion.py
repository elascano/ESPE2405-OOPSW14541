#multiplicacion
factor = 5 #factor deseado, en este caso, haremos la tabla del 5
desde = 1 #límite inferior (incluido)
hasta = 15 #límite superior (incluido también)

for f in range(desde, hasta + 1):
	print(f'{factor} x {f} =  {factor * f}')