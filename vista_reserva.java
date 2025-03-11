import java.util.Scanner;

public class CineView {
    public static void main(String[] args) {
        CineController cineController = new CineController(10);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de reserva de asientos de cine.");
        boolean ejecutando = true;

        while (ejecutando) {
            System.out.println("\nOpciones:");
            System.out.println("1. Mostrar asientos");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cineController.mostrarAsientos();
                    break;
                case 2:
                    System.out.print("Introduce tu nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Introduce tu email: ");
                    String email = scanner.next();
                    Usuario usuario = new Usuario(nombre, email);

                    System.out.print("Introduce el número del asiento que deseas reservar: ");
                    int numeroAsiento = scanner.nextInt();

                    cineController.reservarAsiento(numeroAsiento, usuario);
                    break;
                case 3:
                    ejecutando = false;
                    System.out.println("Gracias por usar el sistema de reserva. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        scanner.close();
    }
}
