import java.util.Scanner;

public class Programa9Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
        double numero1, numero2, resultado;
        char continuar;

        do {

            System.out.println("==============================");
            System.out.println("     CALCULADORA BASICA");
            System.out.println("==============================");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");

            System.out.print("Selecciona una opcion: ");
            opcion = entrada.nextInt();

            if (opcion >= 1 && opcion <= 4) {

                System.out.print("Ingresa el primer numero: ");
                numero1 = entrada.nextDouble();

                System.out.print("Ingresa el segundo numero: ");
                numero2 = entrada.nextDouble();

                switch (opcion) {

                    case 1:
                        resultado = numero1 + numero2;
                        System.out.printf("Resultado: %.2f%n", resultado);
                        break;

                    case 2:
                        resultado = numero1 - numero2;
                        System.out.printf("Resultado: %.2f%n", resultado);
                        break;

                    case 3:
                        resultado = numero1 * numero2;
                        System.out.printf("Resultado: %.2f%n", resultado);
                        break;

                    case 4:

                        if (numero2 != 0) {

                            resultado = numero1 / numero2;
                            System.out.printf("Resultado: %.2f%n", resultado);

                        } else {

                            System.out.println("Error: no se puede dividir entre cero.");
                        }

                        break;
                }

            } else if (opcion == 5) {

                System.out.println("Calculadora finalizada.");
                break;

            } else {

                System.out.println("Opcion no valida.");
            }

            if (opcion != 5) {

                System.out.print("¿Deseas realizar otra operacion? (s/n): ");
                continuar = entrada.next().charAt(0);

            } else {

                continuar = 'n';
            }

        } while (continuar == 's' || continuar == 'S');

        entrada.close();

        System.out.println("Programa terminado.");
    }
}
