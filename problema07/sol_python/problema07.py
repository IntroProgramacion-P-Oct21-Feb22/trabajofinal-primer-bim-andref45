
numero = int(input("Ingrese un numero: "))
suma = numero
nu = 2
while (nu < numero):  # type: int
   if numero%2 == 0 and numero > 2:
    suma = suma + nu
    nu = nu + 2
    print("La suma es igual a: %s\n" % suma)
   else:
    if numero < 2:
        print("Ha ocurrido un error\n")
