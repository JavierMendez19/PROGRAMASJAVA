import java.util.Scanner;

public class Programa7VocalesConsonantes {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char letra;

        System.out.println("==============================");
        System.out.println("    VOCALES O CONSONANTES");
        System.out.println("==============================");
        System.out.println("Ingresa una letra.");
        System.out.println("Para terminar, ingresa un espacio.");

        do {

            System.out.print("Ingresa una letra: ");
            String texto = entrada.nextLine();

            if (texto.isEmpty()) {
                break;
            }

            letra = Character.toLowerCase(texto.charAt(0));

            if (letra == 'a' || letra == 'e' || letra == 'i'
                    || letra == 'o' || letra == 'u') {

                System.out.println("La letra es una vocal.");

            } else if (Character.isLetter(letra)) {

                System.out.println("La letra es una consonante.");

            } else {

                System.out.println("Ingresa una letra valida.");
            }

        } while (true);

        System.out.println("Programa terminado.");

        entrada.close();
    }
}
