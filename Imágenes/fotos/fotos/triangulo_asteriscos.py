""" Pide por teclado la altura o base de un triángulo como éste:

*
**
***

"""

caracter = input("Introduce el caracter que quieres en tu triangulo: ")
altura =int (input("Introduce la altura: "))

for i in range (altura):
    for j in range (i + 1):
        print(caracter, end= " ")
    print()