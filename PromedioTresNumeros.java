import java.util.Scanner;

public class PromedioTresNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Ingresa el segundo numero: ");
        double numero2 = entrada.nextDouble();

        System.out.print("Ingresa el tercer numero: ");
        double numero3 = entrada.nextDouble();

        double promedio = (numero1 + numero2 + numero3) / 3;

        System.out.println("Promedio: " + promedio);

        entrada.close();
    }
}