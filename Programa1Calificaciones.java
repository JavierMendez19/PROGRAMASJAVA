import java.util.Scanner;

public class Programa1Calificaciones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double parciales, proyecto, examen, promedio;

        System.out.println("=================================");
        System.out.println(" CALCULADORA DE CALIFICACION FINAL");
        System.out.println("=================================");

        System.out.print("Ingresa la calificacion de parciales: ");
        parciales = entrada.nextDouble();

        System.out.print("Ingresa la calificacion del proyecto: ");
        proyecto = entrada.nextDouble();

        System.out.print("Ingresa la calificacion del examen final: ");
        examen = entrada.nextDouble();

        if (parciales < 0 || parciales > 100 ||
            proyecto < 0 || proyecto > 100 ||
            examen < 0 || examen > 100) {

            System.out.println("Error: las calificaciones deben estar entre 0 y 100.");

        } else {

            promedio = (parciales * 0.40) +
                       (proyecto * 0.30) +
                       (examen * 0.30);

            System.out.println("---------------------------------");
            System.out.printf("Promedio final: %.2f%n", promedio);
            System.out.println("---------------------------------");
        }

        entrada.close();
    }
}