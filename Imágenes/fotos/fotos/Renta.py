#programa que pregunte al usuario su renta anual
# y muestre por pantalla el tipo impositivo que le corresponde

rent1 = int(input("Introduce la renta: "))

if rent1 < 10000:
    imp1 = 5
elif rent1 < 20000:
    imp1 = 15
elif rent1 < 35000:
    imp = 20
elif rent1 < 60000:
    imp1 = 30
else:
    imp1 = 45
print("El tipo impositivo es", imp1, "%")
