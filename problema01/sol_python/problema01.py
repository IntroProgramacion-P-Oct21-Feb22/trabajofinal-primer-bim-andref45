a1 = int(input("Asigne el valor de un ángulo: "))
a2 = int(input("Asigne el valor de un ángulo: "))
a3 = int (input("Asigne el valor de un ángulo: "))

if a1 == 90 or a2 == 90 or a3 == 90:
    tipo_t = "triángulo rectángulo"
else:
    if a1 > 90 and a1 <180 or a2 > 90 and a2 <180 or a3 > 90 and a3 <180:
        tipo_t = "triángulo obtusángulo"
    else:
        if a1 < 90 or a2 < 90 or a3 < 90:
            tipo_t = "triángulo acutángulo"
print (("Es un %s\n") % tipo_t)
