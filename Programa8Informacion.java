import java.util.Scanner;

public class Programa8Informacion {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;

        System.out.println("==============================");
        System.out.println("       INFORMACION GENERAL");
        System.out.println("==============================");

        System.out.println("Selecciona un tema:");
        System.out.println("1. Artista");
        System.out.println("2. Pelicula");
        System.out.println("3. Serie");
        System.out.println("4. Videojuego");
        System.out.println("5. Deporte");

        System.out.print("Opcion: ");
        opcion = entrada.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Artista: Michael Jackson");
                System.out.println("Fue un cantante, compositor y bailarín estadounidense.");
                System.out.println("Es conocido como el Rey del Pop.");
                break;

            case 2:
                System.out.println("Pelicula: Avengers: Endgame");
                System.out.println("Es una pelicula del Universo Cinematografico de Marvel.");
                System.out.println("Fue estrenada en 2019.");
                break;

            case 3:
                System.out.println("Serie: Stranger Things");
                System.out.println("Es una serie de ciencia ficcion y suspenso.");
                System.out.println("La historia se desarrolla principalmente en Hawkins.");
                break;

            case 4:
                System.out.println("Videojuego: Minecraft");
                System.out.println("Es un videojuego de construccion y exploracion.");
                System.out.println("Permite crear estructuras utilizando bloques.");
                break;

            case 5:
                System.out.println("Deporte: Futbol");
                System.out.println("Es uno de los deportes mas populares del mundo.");
                System.out.println("Se juega entre dos equipos de once jugadores.");
                break;

            default:
                System.out.println("Opcion no valida.");
        }

        entrada.close();
    }
}
