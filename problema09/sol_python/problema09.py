k = int(input("Ingrese un valor correspondiente a k: "))
serie = ""
contador = 1
while contador<=k:
    valores = str(input ("Agregue un valor a la serie: "))  # type: str
    serie = "%s %s" % (serie, valores)
    contador = contador + 1

print("S1 = %s" % serie)