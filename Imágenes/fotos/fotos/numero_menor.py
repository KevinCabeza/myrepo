num1 = int(input("Introduce el primer número: "))
num2 = int(input("Introduce el segundo número: "))
if num1 < num2:
    print("El número menor es el:", num1)
elif num2 < num1:
    print("El número menor es el: ", num2)
else:
    print(num1, " y ", num2, " son iguales")
