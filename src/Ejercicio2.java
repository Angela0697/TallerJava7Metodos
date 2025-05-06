public class Ejercicio2 {
    public static double calificaciones(double a, double b, double c) {
        return (a+b+c)/3;
    }
    public static String apruebaOno(double promedio){
        if (promedio >= 60.0) {
            return "Aprobó";
        } else {
            return "No aprobó";
        }
    }
    public static void resultados(double promedio) {
        System.out.println("Su promedio es: " + promedio);
        String resultado = apruebaOno(promedio);
        System.out.println("Usted: " + resultado);

    }
}
