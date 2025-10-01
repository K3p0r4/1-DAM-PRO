import java.util.*;

/**
 * Programa realizado para sumar numeros que son solicitados al usuario
 * mediante el uso del objeto Scanner. 
 * 
 * @author Emilio Perez Garcia
 * @version 1.0
 */
 
 
public class Main {
    public static void main(String[] args) {
      // Establecemos las variables y su metodo de entrada.
      Scanner lector = new Scanner(System.in);
      int num1, num2, suma;
      // Realizamos la adquisicion de los valores y operamos con ellos como se solicita.
      num1 = lector.nextInt();
      num2 = lector.nextInt();
      suma = num1 + num2;
      // Producimos la salida deseada del programa.
      System.out.println("La suma de " + num1 + " y " + num2 + " es igual a : "+ suma);
      // Cerramos el Scanner.
      lector.close();
  }
}