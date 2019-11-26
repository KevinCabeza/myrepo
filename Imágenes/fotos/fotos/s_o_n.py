'''Este programita valida una respuesta'''
respuestaValida = False
while not respuestaValida:
    respuesta = input("Desea continuar (s/n)")
    if respuesta == "s" or respuesta == "n":
        print("Respuesta valida")
        respuestaValida = True
    else:
        print("Error: Teclea una s o una n")
print("Fin de Programa")