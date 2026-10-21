import java.util.Scanner;

public class Programa7Monedas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double pesos, resultado;
        int opcion;

        System.out.println("==============================");
        System.out.println("       CONVERSOR DE MONEDAS");
        System.out.println("==============================");

        System.out.print("Ingresa la cantidad en pesos mexicanos: $");
        pesos = entrada.nextDouble();

        System.out.println();
        System.out.println("Selecciona la moneda:");
        System.out.println("1. Dolar USD");
        System.out.println("2. Euro EUR");
        System.out.println("3. Bath THB");
        System.out.println("4. Yen JPY");
        System.out.println("5. Won KRW");
        System.out.println("6. Dolar Australiano AUD");
        System.out.println("7. Sol PEN");
        System.out.println("8. Dolar Canadiense CAD");
        System.out.println("9. Bolivar VES");
        System.out.println("10. Peso Argentino ARS");

        System.out.print("Opcion: ");
        opcion = entrada.nextInt();

        switch (opcion) {

            case 1:
                resultado = pesos / 18.50;
                System.out.printf("Resultado: %.2f USD%n", resultado);
                break;

            case 2:
                resultado = pesos / 21.50;
                System.out.printf("Resultado: %.2f EUR%n", resultado);
                break;

            case 3:
                resultado = pesos * 1.70;
                System.out.printf("Resultado: %.2f THB%n", resultado);
                break;

            case 4:
                resultado = pesos * 8.10;
                System.out.printf("Resultado: %.2f JPY%n", resultado);
                break;

            case 5:
                resultado = pesos * 79.00;
                System.out.printf("Resultado: %.2f KRW%n", resultado);
                break;

            case 6:
                resultado = pesos / 12.50;
                System.out.printf("Resultado: %.2f AUD%n", resultado);
                break;

            case 7:
                resultado = pesos / 5.20;
                System.out.printf("Resultado: %.2f PEN%n", resultado);
                break;

            case 8:
                resultado = pesos / 13.40;
                System.out.printf("Resultado: %.2f CAD%n", resultado);
                break;

            case 9:
                resultado = pesos * 20.00;
                System.out.printf("Resultado: %.2f VES%n", resultado);
                break;

            case 10:
                resultado = pesos * 75.00;
                System.out.printf("Resultado: %.2f ARS%n", resultado);
                break;

            default:
                System.out.println("Opcion no valida.");
        }

        entrada.close();
    }
}