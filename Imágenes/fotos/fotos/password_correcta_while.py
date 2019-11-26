"""
ejemplo de while. Mientras que las pasword no sea correcta
volvemos a introducirla
"""
contraseña = 'python'
contraseña_input = input("Introduce la contraseña")
while contraseña_input != contraseña:
    print("Contraseña iuncorrecta, vuelve a intentarlo")
    contraseña_input = input("Introduce la contraseña")
print("Contraseña correcta")
