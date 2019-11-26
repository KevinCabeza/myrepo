"""
Pograma para hacer media de notas
"""
salir = False
contador = 0
totalNotas = 0

while not salir:
    print("")
    nota = float(input("Pulsa 0 para salir.\nIntroduce Nota: "))

    if nota == 0:
        salir = True

    else:
        contador = contador + 1
        totalNotas = totalNotas + nota

if totalNotas != 0:
    media = totalNotas / contador
    print("La media de notas es ", totalNotas, "/", contador, "=", media )

print("Fin")