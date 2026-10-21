import java.util.Scanner;

public class Programa2ConteoNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidad;
        int numero;
        int mayores = 0;
        int menores = 0;
        int iguales = 0;

        System.out.println("==============================");
        System.out.println("       CONTEO DE NUMEROS");
        System.out.println("==============================");

        System.out.print("¿Cuantos numeros deseas ingresar?: ");
        cantidad = entrada.nextInt();

        for (int i = 1; i <= cantidad; i++) {

            System.out.print("Ingresa el numero " + i + ": ");
            numero = entrada.nextInt();

            if (numero > 0) {

                mayores++;

            } else if (numero < 0) {

                menores++;

            } else {

                iguales++;
            }
        }

        System.out.println();
        System.out.println("RESULTADOS");
        System.out.println("Numeros mayores que 0: " + mayores);
        System.out.println("Numeros menores que 0: " + menores);
        System.out.println("Numeros iguales a 0: " + iguales);

        entrada.close();
    }
}
