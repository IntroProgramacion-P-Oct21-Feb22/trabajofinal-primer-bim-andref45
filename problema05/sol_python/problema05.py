x = int (input("Ingrese el valor para x: "))
y = int (input("Ingrese el valor para y: "))

if x>0 and y>0:
    print("La coordenada se encuentra en el primer cuadrante")
else:
    if x< 0 and y > 0:
        print("La coordenada se encuentra en el segundo cuadrante")
    else:
        if x<0 and y<0:
            print("La coordenada se encuentra en el tercer cuadrante")
        else:
            if x>0 and y<0:
                print("La coordenada se encuentra en el cuarto cuadrante")

