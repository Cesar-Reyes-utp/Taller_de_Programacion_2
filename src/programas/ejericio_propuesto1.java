package programas;

import java.util.Scanner;
import java.lang.Math;
public class ejericio_propuesto1 {

    public static void main(String[] args) {
        
        double r,pi,Area;
        Scanner lectura= new Scanner(System.in);
        System.out.print("Ingreso el largo de la cuerda: ");
        r=lectura.nextDouble();
        pi=(Math.PI) ;
        
        Area= (Math.pow(r,2))* pi ;
        
        System.out.println("El area limitada sera de : " + Area);
    }
    
}
