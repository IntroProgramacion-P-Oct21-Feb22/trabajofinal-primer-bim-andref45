nombre = input("Ingrese su nombre: ")
t_empleado = int(input("Ingrese el tipo de empleado: "))
horas = float(input("Ingrese el número de horas trabajadas: "))
cuota = float(input("Ingrese la cuota que se le paga por hora: "))
sueldo = 0
sueldobase = 400

if t_empleado == 1 and horas >40:
    cuota = 1.5
    sueldo = sueldobase + (horas * cuota)
else:
    if t_empleado == 2 and horas > 40:
        cuota = 2
        sueldo = sueldobase + (horas * cuota)
    else:
        if t_empleado == 3 and horas > 40:
            cuota = 2.5
            sueldo = sueldobase + (horas * cuota)
        else:
            if t_empleado == 4 and horas > 40:
                cuota = 3
                sueldo = sueldobase + (horas * cuota)

print("El sueldo es:$ %s\n" % sueldo)