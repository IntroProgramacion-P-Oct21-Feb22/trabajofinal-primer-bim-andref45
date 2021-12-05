n1 = int(input("Ingrese el valor del número 1: "))
n2 = int(input("Ingrese el valor del número 2: "))
n3 = int(input("Ingrese el valor del número 3: "))

if n1 == n2 or n1 == n3 or n2 == n3:
    print("Se ha producido un error")
if n1 > n2 and n1 > n3:
    print("El mayor es: %s" % n1)
else:
    if n2 > n1 and n2 > n3:
        print("El mayor es: %s" % n2)
    else:
        if n3 > n1 and n3 > n2:
            print("El mayor es: %s" % n3)
