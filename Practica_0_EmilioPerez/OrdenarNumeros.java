import java.util.*;

/**
 * Programa realizado para ordenar de mayor a menor
 * tres numeros sin usar arrays ni listas.
 * 
 * @author Emilio Perez Garcia
 * @version 1.0
 */
 
 
public class Main {
    public static void main(String[] args) {
      // Establecemos las variables y su metodo de entrada.
      
      Scanner lector = new Scanner(System.in);
      
      int num1, num2, num3, mayor, medio, menor;
      
      // Realizamos la adquisicion de los valores y operamos con ellos como se solicita.
      
      num1 = lector.nextInt();
      num2 = lector.nextInt();
      num3 = lector.nextInt();
      
      // Cerramos el Scanner.
      lector.close();
      
      // Realizamos las comparaciones para ordenar los numeros utitlizando las variables auxiliare "mayor", "medio" y "menor".
      if ( num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
              }
      } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
          if (num1 >= num3) {
                medio = num1;
                menor = num3;
          } else {
                medio = num3;
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                medio = num1;
                menor = num2;
            } else {
                medio = num2;
                menor = num1;
              }
          }
          
      // Producimos la salida deseada del programa.
      System.out.println("Números ordenados de mayor a menor: " + mayor + " " + medio + " " + menor);
  }
}