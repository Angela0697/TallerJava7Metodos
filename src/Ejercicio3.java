import java.util.Scanner;

public class Ejercicio3 {
    public static int suma(int a, int b){
        return a + b;
    }
    public static int resta(int a, int b){
        return a - b;
    }
    public static int multi(int a, int b){
        return a * b;
    }
    public static double dividir(int a, int b){
        return (double) a / b;
    }
    public static double potencia(int a, int b) {
        return Math.pow(a, b);
    }

    public static void resultados() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double resultado = 0;

        do {
            System.out.println("Menú: ");
            System.out.println("1. Sumar ");
            System.out.println("2. Restar ");
            System.out.println("2. Multiplicar ");
            System.out.println("4. Dividir ");
            System.out.println("5. Potencia ");
            System.out.println("6. Salir ");
            System.out.println("Elija una opción: ");
            opcion = scanner.nextInt();
            int a, b;

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un número: ");
                    a = scanner.nextInt();
                    System.out.println("Ingrese otro número: ");
                    b = scanner.nextInt();
                    resultado = suma(a, b);
                    System.out.println("Suma: " + resultado);
                    break;
                case 2:
                    System.out.println("Ingrese un número: ");
                    a = scanner.nextInt();
                    System.out.println("Ingrese otro número: ");
                    b = scanner.nextInt();
                    resultado = resta(a, b);
                    System.out.println("Resta: " + resultado);
                    break;
                case 3:
                    System.out.println("Ingrese un número: ");
                    a = scanner.nextInt();
                    System.out.println("Ingrese otro número: ");
                    b = scanner.nextInt();
                    resultado = multi(a, b);
                    System.out.println("Multiplicación: " + resultado);
                    break;
                case 4:
                    System.out.println("Ingrese un número: ");
                    a = scanner.nextInt();
                    System.out.println("Ingrese otro número: ");
                    b = scanner.nextInt();
                    if (b == 0) {
                        System.out.println("Error: no puedes dividir entre 0");
                    } else {
                        resultado = dividir(a, b);
                        System.out.println("División: " + resultado);
                    }
                    break;
                case 5:
                    System.out.println("Ingrese un número: ");
                    a = scanner.nextInt();
                    System.out.println("Ingrese otro número: ");
                    b = scanner.nextInt();
                    resultado = potencia(a, b);
                    System.out.println("Potencia: " + resultado);
                    break;
                case 6:
                    System.out.println("Gracias por su visita");
                    break;
                default:
                    System.out.println("Opción invalida");

            }
        }while (opcion != 6);
    }
}
