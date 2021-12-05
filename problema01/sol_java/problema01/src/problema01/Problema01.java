/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;

/**
 *
 * @author andreflores
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in); 

    int a1;
    int a2;
    int a3;
    String tipo_t = "";
    
    System.out.println("Asigne el valor de un ángulo");
    a1 = entrada.nextInt();
    
    System.out.println("Asigne el valor de un ángulo");
    a2 = entrada.nextInt();
    
    System.out.println("Asigne el valor de un ángulo");
    a3 = entrada.nextInt();
    
    if (a1 == 90 || a2 == 90 || a3 == 90 ){
        tipo_t = "triángulo rectángulo";
    }else{
            if (a1 > 90 && a1 <180 || a2 > 90 && a2 <180 || a3 > 90 && a3 <180){
                tipo_t = "triángulo obtusángulo";
            }else{
                if (a1 < 90 || a2 < 90 || a3 < 90){
                    tipo_t = "triángulo acutángulo";
                }
            }
            }
    System.out.printf("Es un %s\n", tipo_t);
    }
    
}
