print("escribe la renta anual")
renta = int(input("renta anual: "))

if renta == 0:
    print("ERROR")


elif renta<1000 :
    tipo1 = 5
    print("el tipo impositivo es del:", tipo1)
elif renta<20000 :
    tipo2 = 15
    print("el tipo impositivo es:", tipo2)
elif renta<35000 :
    tipo3 = 20
    print("el tipo impositivo es :", tipo3)
elif renta<60000 :
    tipo4 = 30
    print("el tipo impositivo es :",tipo4)
else:
    tipo5 = 45
    print("el tipo impositivo es :", tipo5)
