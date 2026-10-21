import java.util.Scanner;

public class Programa5Estacion {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int mes;

        System.out.println("==============================");
        System.out.println("       ESTACION DEL ANO");
        System.out.println("==============================");

        System.out.print("Ingresa un numero de mes (1-12): ");
        mes = entrada.nextInt();

        switch (mes) {

            case 1:
            case 2:
            case 12:
                System.out.println("Estacion: Invierno");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Estacion: Primavera");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Estacion: Verano");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Estacion: Otono");
                break;

            default:
                System.out.println("Mes no valido.");
        }

        entrada.close();
    }
}
