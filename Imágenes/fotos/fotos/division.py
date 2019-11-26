dividendo = float(input("Introduzca el dividendo: "))
divisor = float(input("Introduzca el divisor: "))
if divisor == 0:
	print("Error, el divisor no puede ser igual a 0")
else:
	resultado = dividendo / divisor
	print(str(dividendo) + " / " + str(divisor) + " = " +str(resultado))