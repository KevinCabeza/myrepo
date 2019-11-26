#vamos a introducir dos numeros por teclado y nos va ha imprimir el menor

num1 = int(input("numero 1:"))
num2 = int(input("numero 2:"))
if num1 < num2:
    print("el numero menor es:", num1)
elif num2 < num1:
    print("el numero menor seria ",num2)
else:
    print("son iguales")
