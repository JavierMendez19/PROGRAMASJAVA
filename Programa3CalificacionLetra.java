import java.util.Scanner;

public class Programa3CalificacionLetra {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int calificacion;

        System.out.println("==============================");
        System.out.println(" EVALUACION DE CALIFICACION");
        System.out.println("==============================");

        System.out.print("Ingresa una calificacion de 0 a 100: ");
        calificacion = entrada.nextInt();

        if (calificacion < 0 || calificacion > 100) {

            System.out.println("Calificacion no valida.");

        } else if (calificacion >= 90) {

            System.out.println("Calificacion: A");

        } else if (calificacion >= 80) {

            System.out.println("Calificacion: B");

        } else if (calificacion >= 70) {

            System.out.println("Calificacion: C");

        } else if (calificacion >= 60) {

            System.out.println("Calificacion: D");

        } else {

            System.out.println("Calificacion: F");
        }

        entrada.close();
    }
}
