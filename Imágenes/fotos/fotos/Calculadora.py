"""
Este programa imita una calculadora
"""
salir = False
while not salir:
    #Imprimimos en pantalla el menú
    print("Elige la opción del siguiente menú")
    print("1.Suma")
    print("2.Resta")
    print("3.Multiplicación")
    print("4.División")
    print("5.Salir")
    #Guardamos la opción
    opcion_valida = False
    while not opcion_valida:
        opcion = int(input("Teclea la opción: "))
        opcion_valida = opcion >=1 and opcion <=5
        if not opcion_valida:
            print("Error, la opción no es válida.")

    #Si no desea salir
    salir = opcion == 5
    if not salir:
        #Introducimos los operandos
        operando1 = float(input("Introduce el operando1: "))
        operando2 = float(input("Introduce el operando2: "))
        if opcion == 1:
            print("La suma es " , (operando1 + operando2))
        elif opcion == 2:
            print("La resta es ", (operando1 - operando2))
        elif opcion == 3:
            print("La multiplicación es ", (operando1 * operando2))
        elif opcion == 4:
            if operando2 == 0:
                print("No se puede dividir por 0")
            else:
                print("La división es ",(operando1 / operando2))

print("HEMOS SALIDO DEL PROGRAMA")