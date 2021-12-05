/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andreflores
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    
    String nombre; 
    int t_empleado;
    double horas;
    double cuota;
    double sueldo = 0; 
    double sueldobase = 400;
    
    System.out.println("Ingrese su nombre");
    nombre = entrada.nextLine();
    
    System.out.println("Ingrese el tipo de empleado");
    t_empleado = entrada.nextInt();
    
    System.out.println("Ingrese el número de horas trabajadas");
    horas = entrada.nextDouble();
    
    System.out.println("Ingrese la cuota que se le paga por hora");
    cuota = entrada.nextDouble();
    
    
    if (t_empleado == 1 && horas > 40 ) {
        cuota = 1.5;
        sueldo = sueldobase + (horas * cuota);
    }else {
        if(t_empleado == 2 && horas > 40){
            cuota = 2;
            sueldo = sueldobase + (horas * cuota);
        }else {
            if (t_empleado == 3 && horas > 40){
                cuota = 2.5;
                sueldo = sueldobase + (horas * cuota);
            }else{
                if (t_empleado == 4 && horas > 40){
                    cuota = 3;
                    sueldo = sueldobase + (horas * cuota);
                }
            }
        }
        }
    System.out.printf("El sueldo es: %s\n", sueldo);       
    
    }
    
}
