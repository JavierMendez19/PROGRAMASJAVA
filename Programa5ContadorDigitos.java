import java.util.Scanner;

public class Programa5ContadorDigitos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int contador = 0;

        System.out.println("==============================");
        System.out.println("      CONTADOR DE DIGITOS");
        System.out.println("==============================");

        System.out.print("Ingresa un numero entero: ");
        numero = entrada.nextInt();

        int temporal = Math.abs(numero);

        if (temporal == 0) {

            contador = 1;

        } else {

            while (temporal > 0) {

                temporal = temporal / 10;
                contador++;
            }
        }

        System.out.println("El numero tiene "
                + contador + " digitos.");

        entrada.close();
    }
}
