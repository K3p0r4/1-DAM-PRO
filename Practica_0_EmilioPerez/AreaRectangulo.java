import java.util.*;

/**
 * Programa realizado para calcular el area de un rectangulo usando
 *valores introducidos por el usuario. 
 * 
 * @author Emilio Perez Garcia
 * @version 1.0
 */
 
 
public class Main {
    public static void main(String[] args) {
      // Establecemos las variables y su metodo de entrada.
      Scanner lector = new Scanner(System.in);
      int base, altura, area;
      // Realizamos la adquisicion de los valores y operamos con ellos como se solicita.
      base = lector.nextInt();
      altura = lector.nextInt();
      area = base * altura;
      // Producimos la salida deseada del programa.
      System.out.println("El area del rectangulo es: " + area);
      // Cerramos el Scanner.
      lector.close();
  }
}