package programas;

import java.util.Scanner;
import java.lang.Math;
public class ejericio_propuesto2 {

    public static void main(String[] args) {
    
    String j1,j2,j3,j4,j5;
        double d1,d2,d3,d4,d5;
        //creamos el objeto de lectura
        Scanner lectura= new Scanner(System.in);
         System.out.print("Nombre de jugador1: ");
        j1=lectura.next();
         System.out.print("Nombre de jugador2: ");
        j2=lectura.next();
        System.out.print("Nombre de jugador3: ");
        j3=lectura.next();
        System.out.print("Nombre de jugador4: ");
        j4=lectura.next();
        System.out.print("Nombre de jugador5: ");
        j5=lectura.next();
        
        d1=(int) (Math.random() * 21) + 1;
        d2=(int) (Math.random() * 21) + 1;
        d3=(int) (Math.random() * 21) + 1;
        d4=(int) (Math.random() * 21) + 1;
        d5=(int) (Math.random() * 21) + 1;
        
        System.out.println("El jugador " + j1 );
        System.out.println("saco " + d1 );
        System.out.println("El jugador " + j2 );
        System.out.println("saco " + d2 );
        System.out.println("El jugador " + j3 );
        System.out.println("saco " + d3 );
        System.out.println("El jugador " + j4 );
        System.out.println("saco " + d4 );
        System.out.println("El jugador " + j5 );
        System.out.println("saco " + d5 );
    }
    
}
