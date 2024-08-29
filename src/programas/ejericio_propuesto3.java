package programas;

import java.util.Scanner;
import java.lang.Math;
public class ejericio_propuesto3 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Solicitar coordenadas al usuario
        System.out.print("Introduce la coordenada x1: ");
        double x1 = scanner.nextDouble();
        
        System.out.print("Introduce la coordenada y1: ");
        double y1 = scanner.nextDouble();
        
        System.out.print("Introduce la coordenada x2: ");
        double x2 = scanner.nextDouble();
        
        System.out.print("Introduce la coordenada y2: ");
        double y2 = scanner.nextDouble();

        // Calcular la distancia utilizando la fórmula de distancia euclidiana
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Mostrar la distancia con dos decimales
        System.out.printf("La distancia entre los puntos (%.2f, %.2f) y (%.2f, %.2f) es: %.2f%n", x1, y1, x2, y2, distancia);
        
        
    }
    
}
