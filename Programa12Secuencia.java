import java.util.Scanner;

public class Programa12Secuencia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int primerNumero;
        int diferencia;
        int maximo;
        int actual;

        System.out.println("==============================");
        System.out.println("   SECUENCIA ARITMETICA");
        System.out.println("==============================");

        System.out.print("Ingresa el primer numero: ");
        primerNumero = entrada.nextInt();

        System.out.print("Ingresa la diferencia: ");
        diferencia = entrada.nextInt();

        System.out.print("Ingresa el numero maximo: ");
        maximo = entrada.nextInt();

        actual = primerNumero;

        System.out.println();
        System.out.println("Secuencia aritmetica:");

        do {

            System.out.println(actual);

            actual = actual + diferencia;

        } while (actual <= maximo);

        entrada.close();
    }
}
