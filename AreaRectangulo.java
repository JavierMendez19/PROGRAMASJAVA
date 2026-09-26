import java.util.Scanner;

public class AreaRectangulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa la longitud del rectangulo: ");
        double longitud = entrada.nextDouble();

        System.out.print("Ingresa el ancho del rectangulo: ");
        double ancho = entrada.nextDouble();

        double area = longitud * ancho;

        System.out.println("Area del rectangulo: " + area);

        entrada.close();
    }
}