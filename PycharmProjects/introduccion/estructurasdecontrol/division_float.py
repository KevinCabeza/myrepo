print("escribe dos numeros decimales")
num1 = float(input("primer numero:"))
num2 = float(input("segundo numero:"))

if num2 == 0:
    print("ERROR el divisor no puede ser 0")
else:
    solucion = num1 / num2
    print("el resultado es:", solucion)
