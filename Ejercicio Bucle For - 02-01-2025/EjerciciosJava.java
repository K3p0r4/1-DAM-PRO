import java.util.*;

public class EjerciciosJava {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        
        while (!salir) {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Verificar número (mayor que 5, negativo)");
            System.out.println("2. Verificar par/impar (3 números)");
            System.out.println("3. Ordenar 3 números (mayor a menor)");
            System.out.println("4. Pirámide de asteriscos");
            System.out.println("5. Pirámide invertida de asteriscos");
            System.out.println("6. Ejemplo con Switch-Case (Calculadora)");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");

            try {
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        ejercicio1();
                        break;
                    case 2:
                        ejercicio2();
                        break;
                    case 3:
                        ejercicio3();
                        break;
                    case 4:
                        ejercicio4();
                        break;
                    case 5:
                        ejercicio5();
                        break;
                    case 6:
                        ejercicio6();
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero");
                scanner.nextLine(); // Limpiar buffer
            }
        }
        System.out.println("¡Hasta luego!");
        scanner.close();
    }

    // Ejercicio 1: Verificar número
    private static void ejercicio1() {
        System.out.print("Ingrese un número: ");
        try {
            double numero = scanner.nextDouble();
            
            if (numero > 5) {
                System.out.println("El número es mayor que 5");
            } else if (numero < 0) {
                System.out.println("El número es negativo");
            } else {
                System.out.println("El número no es mayor que 5 ni negativo");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número válido");
            scanner.nextLine();
        }
    }

    // Ejercicio 2: Verificar par/impar
    private static void ejercicio2() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                int numero = scanner.nextInt();
                
                if (numero % 2 == 0) {
                    System.out.println("El número " + numero + " es PAR");
                } else {
                    System.out.println("El número " + numero + " es IMPAR");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número válido");
            scanner.nextLine();
        }
    }

    // Ejercicio 3: Ordenar 3 números
    private static void ejercicio3() {
        try {
            System.out.print("Ingrese el primer número: ");
            int a = scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int b = scanner.nextInt();
            System.out.print("Ingrese el tercer número: ");
            int c = scanner.nextInt();

            // Ordenamiento usando comparaciones
            int mayor, medio, menor;

            if (a >= b && a >= c) {
                mayor = a;
                if (b >= c) {
                    medio = b;
                    menor = c;
                } else {
                    medio = c;
                    menor = b;
                }
            } else if (b >= a && b >= c) {
                mayor = b;
                if (a >= c) {
                    medio = a;
                    menor = c;
                } else {
                    medio = c;
                    menor = a;
                }
            } else {
                mayor = c;
                if (a >= b) {
                    medio = a;
                    menor = b;
                } else {
                    medio = b;
                    menor = a;
                }
            }

            System.out.println("Números ordenados: " + mayor + " > " + medio + " > " + menor);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar números enteros válidos");
            scanner.nextLine();
        }
    }

    // Ejercicio 4: Pirámide de asteriscos
    private static void ejercicio4() {
        try {
            System.out.print("Ingrese la altura de la pirámide: ");
            int altura = scanner.nextInt();
            
            if (altura <= 0) {
                System.out.println("La altura debe ser mayor que 0");
                return;
            }

            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número válido");
            scanner.nextLine();
        }
    }

    // Ejercicio 5: Pirámide invertida
    private static void ejercicio5() {
        try {
            System.out.print("Ingrese la altura de la pirámide: ");
            int altura = scanner.nextInt();
            
            if (altura <= 0) {
                System.out.println("La altura debe ser mayor que 0");
                return;
            }

            for (int i = altura; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero válido");
            scanner.nextLine();
        }
    }

    // Ejercicio 6: Ejemplo con Switch-Case (Calculadora)
    private static void ejercicio6() {
        try {
            System.out.println("\n=== CALCULADORA SIMPLE ===");
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.println("Operaciones disponibles:");
            System.out.println("+ : Suma");
            System.out.println("- : Resta");
            System.out.println("* : Multiplicación");
            System.out.println("/ : División");
            System.out.print("Elija una operación: ");
            char operacion = scanner.next().charAt(0);

            switch (operacion) {
                case '+':
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: No se puede dividir por cero");
                    }
                    break;
                default:
                    System.out.println("Operación no válida");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no válida");
            scanner.nextLine();
        }
    }
}