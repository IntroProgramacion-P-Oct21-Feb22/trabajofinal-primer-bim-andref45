porcentaje1 = 20
porcentaje2 = 25
porcentaje3 = 40
porcentaje4 = 50
descuento = 0
total_pagar = 0
trajes = int(input("Ingrese a cantidad de trajes a comprar: "))
precio = int(input("Ingrese el precio unitario de el traje: "))
subtotal = trajes * precio
if trajes == 1:
    descuento = (subtotal * porcentaje1) / 100
    total_pagar = subtotal - descuento
else:
    if trajes == 1 :
        descuento = (subtotal * porcentaje2) / 100
        total_pagar = subtotal - descuento
    else:
        if trajes == 3:
            descuento = (subtotal * porcentaje3) / 100
            total_pagar = subtotal - descuento
        else:
            if trajes > 3:
                descuento = (subtotal * porcentaje4) / 100
                total_pagar = subtotal - descuento
print("Subtotal: $ %s "% subtotal)
print("Descuento:$ %s" % descuento)
print("Total a pagar: $ %s"% total_pagar)