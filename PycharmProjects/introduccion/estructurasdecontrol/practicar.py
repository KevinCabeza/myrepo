base = input("escribe caracter para base")
altura = int(input("escribe la altura: "))
for i in range(altura, -1, -1):
    for j in range(i):
     print(base, end=",")
    print()