# Función para generar la tabla de multiplicar
def generar_tabla_multiplicar(tamano):
    # Iterar sobre las filas
    for i in range(1, tamano + 1):
        # Iterar sobre las columnas
        for j in range(1, tamano + 1):
            # Imprimir el producto, con un formato que alinee las columnas
            print(f"{i * j:4}", end=" ")
        # Nueva línea después de cada fila
        print()

# Definir el tamaño de la tabla
tamano_tabla = 10

# Llamar a la función para generar la tabla de multiplicar
generar_tabla_multiplicar(tamano_tabla)
