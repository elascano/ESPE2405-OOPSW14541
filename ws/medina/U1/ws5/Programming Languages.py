def tabla_del_5():
    # Recorremos los números del 1 al 10
    for i in range(1, 11):
        # Calculamos el resultado de multiplicar 5 por el número actual
        resultado = 5 * i
        # Imprimimos el resultado en formato "5 x i = resultado"
        print(f"5 x {i} = {resultado}")

# Llamamos a la función para mostrar la tabla del 5
tabla_del_5()