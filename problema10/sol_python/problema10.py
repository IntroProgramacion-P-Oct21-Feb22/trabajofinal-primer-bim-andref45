contador = 2
suma = 0
numero = 1
suma2= 0
while numero != 0:
    numero = int(input("Ingrese un numero (0 para terminar): "))
    suma += numero
    contador+1
    if contador == 0:
        print("No digitó ningún número")
    else:
        media = suma/contador
        suma2 += suma * ((numero - media)*(numero - media))
        varianza = suma2/contador

print("El valor de la media es: {} y el de la varianza es {}".
      format(media, varianza))

