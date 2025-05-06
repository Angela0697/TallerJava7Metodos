import java.util.Scanner;

public class Ejercicio1 {
    public static double metrosAcentimetros(double metros) {
        return metros * 100;
    }

    public static double kgAlb(double kg) {
        return kg * 2.20462;
    }

    public static int cAf(int celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void resultados(double cm, double lb, int f) {
        System.out.println("Metros a centímetros: " + cm);
        System.out.println("Kilogramos a libras: " + lb);
        System.out.println("Celsius a Fahrenheit: " + f);

    }



}
