import java.util.Scanner;

public class Programa11Cuadrados {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int contador = 1;

        System.out.println("==============================");
        System.out.println("     SECUENCIA DE CUADRADOS");
        System.out.println("==============================");

        System.out.print("Ingresa un numero entero positivo: ");
        numero = entrada.nextInt();

        if (numero <= 0) {

            System.out.println("El numero debe ser positivo.");

        } else {

            System.out.println("Cuadrados del 1 al " + numero + ":");

            do {

                System.out.println(contador + " ^ 2 = "
                        + (contador * contador));

                contador++;

            } while (contador <= numero);
        }

        entrada.close();
    }
}
