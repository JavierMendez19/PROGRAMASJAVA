import java.util.Scanner;

public class Programa3ContarA {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String palabra;
        int contador = 0;

        System.out.println("==============================");
        System.out.println("     CONTAR LETRAS 'A'");
        System.out.println("==============================");

        System.out.print("Ingresa una palabra: ");
        palabra = entrada.nextLine();

        for (int i = 0; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }

        System.out.println("La letra 'a' aparece "
                + contador + " veces.");

        entrada.close();
    }
}
