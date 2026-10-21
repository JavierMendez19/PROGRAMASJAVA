import java.util.Scanner;

public class Programa8MediaPositivos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numero;
        double suma = 0;
        int cantidad = 0;

        System.out.println("==============================");
        System.out.println("   MEDIA DE NUMEROS POSITIVOS");
        System.out.println("==============================");
        System.out.println("Ingresa numeros positivos.");
        System.out.println("Para terminar, ingresa un numero negativo.");

        do {

            System.out.print("Ingresa un numero: ");
            numero = entrada.nextDouble();

            if (numero >= 0) {

                suma = suma + numero;
                cantidad++;
            }

        } while (numero >= 0);

        if (cantidad > 0) {

            double media = suma / cantidad;

            System.out.printf("La media de los numeros positivos es: %.2f%n",
                    media);

        } else {

            System.out.println("No se ingresaron numeros positivos.");
        }

        entrada.close();
    }
}
