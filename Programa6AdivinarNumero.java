import java.util.Scanner;
import java.util.Random;

public class Programa6AdivinarNumero {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroSecreto = aleatorio.nextInt(100) + 1;
        int intento = 0;

        System.out.println("==============================");
        System.out.println("       ADIVINA EL NUMERO");
        System.out.println("==============================");
        System.out.println("He generado un numero entre 1 y 100.");
        System.out.println("Intenta adivinarlo.");

        while (intento != numeroSecreto) {

            System.out.print("Ingresa tu intento: ");
            intento = entrada.nextInt();

            if (intento < numeroSecreto) {

                System.out.println("Demasiado bajo.");

            } else if (intento > numeroSecreto) {

                System.out.println("Demasiado alto.");

            } else {

                System.out.println("¡Correcto! Adivinaste el numero.");
            }
        }

        entrada.close();
    }
}
