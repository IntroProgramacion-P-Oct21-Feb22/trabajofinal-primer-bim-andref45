/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Scanner;

/**
 *
 * @author andreflores
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    
    int x;
    int y;
    
    System.out.println("Ingrese el valor para x");
    x = entrada.nextInt();
    
    System.out.println("Ingrese el valor para y");
    y = entrada.nextInt();
    
    if (x>0 && y>0) {
        System.out.println("La coordenada se encuentra en el primer cuadrante");
    }else{
        if (x< 0 && y > 0){
            System.out.println("La coordenada se encuentra en el segundo "
                    + "cuadrante");
        }else {
            if (x<0 && y<0){
                System.out.println("La coordenada se encuentra en el "
                        + "tercer cuadrante");
            }else {
                if(x>0 && y<0){
                    System.out.println("La coordenada se encuentra en el "
                            + "cuarto cuadrante");

                }
            }
        }
    }
    }
    
}
