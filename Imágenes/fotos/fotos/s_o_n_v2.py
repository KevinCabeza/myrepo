'''Este programita valida una respuesta'''
respuesta_valida = False
while not respuesta_valida:
    respuesta = input("Desea continuar (s/n)")
    respuesta = respuesta.lower()
    respuesta_valida = respuesta == "s" or respuesta == "n"
    if not respuesta_valida:
        print("Error: Teclea una s o una n")
print("Fin de Programa")