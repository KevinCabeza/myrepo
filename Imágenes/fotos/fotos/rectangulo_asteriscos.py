"""Imprime un rectangulo de asteriscos"""
#introducimos la base y la altura
base=int(input("Introduce una base: "))
altura=int(input("Introduce una altura"))
for i in range(altura):
    for j in range(base):
        print("*", end="")
    print("\n")


