import java.util.Scanner;

public class Programa4Descuento {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double precio, descuento, precioFinal;

        System.out.println("==============================");
        System.out.println(" CALCULO DE PRECIO CON DESCUENTO");
        System.out.println("==============================");

        System.out.print("Ingresa el precio original: $");
        precio = entrada.nextDouble();

        if (precio < 0) {

            System.out.println("El precio no puede ser negativo.");

        } else {

            if (precio <= 100) {

                descuento = 0;

            } else if (precio <= 200) {

                descuento = 0.10;

            } else if (precio <= 500) {

                descuento = 0.20;

            } else {

                descuento = 0.25;
            }

            precioFinal = precio - (precio * descuento);

            System.out.printf("Descuento aplicado: %.0f%%%n",
                    descuento * 100);

            System.out.printf("Precio final: $%.2f%n", precioFinal);
        }

        entrada.close();
    }
}
