# Pedir un numero entero y que muestre todos los numeros impares hasta ese desde 1


num = int(input("Introduzca un número entero: "))
for num in range (1,num, 2):
    print(num ,end=",")

