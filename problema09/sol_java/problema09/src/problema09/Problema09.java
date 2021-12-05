/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema09;
//S1 = 12−11+24−22+36−33+48−44

import java.util.Scanner;

/**
 *
 * @author andreflores
 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    
    String valores;
    String serie= "";
    int contador = 1;
    int k;
    
    System.out.println("Ingrese un valor correspondiente a k");
    k = entrada.nextInt();
    
    entrada.nextLine();
    
    do {
        System.out.println("Agregue un valor a la serie");
        valores = entrada.nextLine();
        serie = serie + valores;
        contador = contador + 1; 

    }
    while (contador <= k);
    System.out.printf("S1 = %s", serie);
    
    }
    
    
}
