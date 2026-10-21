import java.util.Scanner;

public class Programa10Impares {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int contador = 1;

        System.out.println("==============================");
        System.out.println("      NUMEROS IMPARES");
        System.out.println("==============================");

        System.out.print("Ingresa un numero entero positivo: ");
        numero = entrada.nextInt();

        if (numero <= 0) {

            System.out.println("El numero debe ser positivo.");

        } else {

            System.out.println("Numeros impares del 1 al " + numero + ":");

            do {

                if (contador % 2 != 0) {
                    System.out.println(contador);
                }

                contador++;

            } while (contador <= numero);
        }

        entrada.close();
    }
}
