
package boletin3.pkg1;

import java.util.Scanner;

public class Boletin31 {

    public static void main(String[] args) {
       Coche coche1 = new Coche();
       Scanner entrada = new Scanner (System.in);
       
       System.out.println("Velocidade actual " + coche1.getVelocidade() + "Km/h" );
        
        System.out.println("Aumento de velocidad"  + "Km/h");
        coche1.acelerar(entrada.nextInt());
        
        System.out.println("Velocidade actual " + coche1.getVelocidade()  + "Km/h");
        
        System.out.println("Disminucion de velocidad"  + "Km/h");
        coche1.frenar(entrada.nextInt());
        
        System.out.println("Velocidade actual " + coche1.getVelocidade()  + "Km/h");
    }
    
}
