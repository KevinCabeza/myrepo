""" Este programa muestra con un bucle while los
multiplos de dos comprendidos entre 1 y 10 """

#Contador que controla el bucle
contador = 2

while contador <= 10:
    if contador % 2 == 0:
       print (contador, end=", ")
    contador = contador + 1