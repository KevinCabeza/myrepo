num_introducido = int(input("Introduce un numero: "))
num_impares = 1
print("Los numeros impares previos a", num_introducido, "son:")
for num_impares in range (num_impares, num_introducido):
    if num_impares % 2 != 0:
        print(num_impares, end=", ")



