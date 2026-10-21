import java.util.Scanner;

public class Programa2Votar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int edad;

        System.out.println("==============================");
        System.out.println("     VERIFICAR EDAD PARA VOTAR");
        System.out.println("==============================");

        System.out.print("Ingresa tu edad: ");
        edad = entrada.nextInt();

        if (edad < 0) {

            System.out.println("Edad no valida.");

        } else if (edad >= 18) {

            System.out.println("La persona es elegible para votar.");

        } else {

            System.out.println("La persona no es elegible para votar.");
        }

        entrada.close();
    }
}
