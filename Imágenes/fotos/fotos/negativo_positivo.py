# Introduce por teclado un número e imprime en pantalla si es negativo, 0 o positivo
numero = int(input("Introduce el número: "))
if numero < 0:
    print(numero, " es negativo")
elif numero > 0:
    print(numero, " es positivo")
else:
    print("Error, el número no puede ser 0")