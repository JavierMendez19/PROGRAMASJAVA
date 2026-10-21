public class Programa4Divisibles {

    public static void main(String[] args) {

        System.out.println("==============================");
        System.out.println(" NUMEROS DIVISIBLES ENTRE 3 Y 5");
        System.out.println("==============================");

        System.out.println("Numeros entre 1 y 100:");

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println(i);
            }
        }
    }
}
