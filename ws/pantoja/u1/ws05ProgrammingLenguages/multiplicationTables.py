def tablas_multiplicar():
    for i in range(1, 11):
        print(f"Tabla de multiplicar del {i}:")
        for j in range(1, 11):
            print(f"{i} x {j} = {i * j}")
        print()  # línea en blanco para separar las tablas

# Llamamos a la función para mostrar las tablas de multiplicar
tablas_multiplicar()
