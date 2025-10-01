import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la altura de la pirámide: ");
        int altura = scanner.nextInt();
        scanner.close();
        
        // Validar que la altura sea positiva
        if (altura <= 0) {
            System.out.println("La altura debe ser un número positivo.");
        } else {
            System.out.println("\nPiramide de altura " + altura + ":\n");
        }
        for (int nivel = 1; nivel <= altura; nivel++) {
            // Calcular espacios en blanco para centrar
            int espacios = altura - nivel;
            
            // Dibujar espacios
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            
            // Calcular número de asteriscos para este nivel
            int asteriscos = 2 * nivel - 1;
            
            // Dibujar asteriscos
            for (int i = 0; i < asteriscos; i++) {
                System.out.print("*");
            }
            
            // Salto de línea después de cada nivel
            System.out.println();
        }
    }
}