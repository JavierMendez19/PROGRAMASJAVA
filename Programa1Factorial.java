import java.util.Scanner;

public class Programa1Factorial {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        long factorial = 1;

        System.out.println("==============================");
        System.out.println("     CALCULO DE FACTORIAL");
        System.out.println("==============================");

        System.out.print("Ingresa un numero entero positivo: ");
        numero = entrada.nextInt();

        if (numero < 0) {

            System.out.println("El numero no puede ser negativo.");

        } else {

            for (int i = 1; i <= numero; i++) {

                factorial = factorial * i;
            }

            System.out.println("El factorial de " + numero
                    + " es: " + factorial);
        }

        entrada.close();
    }
}