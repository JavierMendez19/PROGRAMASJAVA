import java.util.Scanner;

public class Programa6Temperatura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double celsius, resultado;
        int opcion;

        System.out.println("==============================");
        System.out.println("    CONVERTIDOR DE GRADOS");
        System.out.println("==============================");

        System.out.print("Ingresa la temperatura en Celsius: ");
        celsius = entrada.nextDouble();

        System.out.println();
        System.out.println("Selecciona una opcion:");
        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");

        System.out.print("Opcion: ");
        opcion = entrada.nextInt();

        switch (opcion) {

            case 1:
                resultado = (celsius * 9 / 5) + 32;
                System.out.printf("Temperatura en Fahrenheit: %.2f F%n",
                        resultado);
                break;

            case 2:
                resultado = celsius + 273.15;
                System.out.printf("Temperatura en Kelvin: %.2f K%n",
                        resultado);
                break;

            default:
                System.out.println("Opcion no valida.");
        }

        entrada.close();
    }
}
