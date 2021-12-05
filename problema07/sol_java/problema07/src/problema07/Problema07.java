/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema07;

import java.util.Scanner;

/**
 *
 * @author andreflores
 */
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);

    
    int num;
    int suma = 0;
    
    System.out.println("Ingrese un número");
    num = entrada.nextInt();
    
    for (int nu = 2; nu <= num; nu+=2){
        if (num%2 == 0 && num > 2){
            suma = suma + nu;
            System.out.print("La suma es igual a:");
            System.out.printf(" %s\n", suma);
        }else{
            if (num<2){
                System.out.println("Ha ocurrido un error\n");
            }
           
            }
        }
    
    }
    
    }
    

