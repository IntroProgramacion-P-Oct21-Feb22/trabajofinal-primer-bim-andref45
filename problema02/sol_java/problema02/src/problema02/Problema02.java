/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andreflores
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    entrada.useLocale(Locale.US);
    
    int trajes;
    double precio;
    double descuento = 0;
    double porcentaje1 = 20;
    double porcentaje2 = 25;
    double porcentaje3 = 40;
    double porcentaje4 = 50;
    double subtotal;
    double total_pagar = 0;
    
    System.out.println("Ingrese a cantidad de trajes a comprar");
    trajes = entrada.nextInt();
    
    System.out.println("Ingrese el precio unitario de el traje");
    precio = entrada.nextDouble();
    
    subtotal = trajes * precio;
    
    if (trajes == 1){
        descuento = (subtotal * porcentaje1)/100;
        total_pagar = subtotal - descuento;
    }else {
        if (trajes == 2){
        descuento = (subtotal * porcentaje2)/100;
        total_pagar = subtotal - descuento;
        }else{
            if (trajes == 3){
                descuento = (subtotal * porcentaje3)/100;
                total_pagar = subtotal - descuento;
            }else{
                if (trajes >3){
                    descuento = (subtotal * porcentaje4)/100;
                    total_pagar = subtotal - descuento;
                }
            }
        }
    }
    System.out.printf("Subtotal:$ %s\nDescuento:$ %s\nTotal a pagar:$ %s\n",
            subtotal, descuento, total_pagar);
    }
    
}
