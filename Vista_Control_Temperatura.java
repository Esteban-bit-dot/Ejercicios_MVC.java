import java.util.Scanner;
import java.util.ArrayList;
public class vista {
  private list<temperatura> temperaturas;
  
 public controlador(){
   controlador datocontrolador = new controlador();
   Scanner scanner = new Scanner(System.in);
   System.out.println("Bienvenido al sistema de control de temperatura.");
    boolean ejecutando = true;
    temperatura = new Arraylist<>[];
   while (ejecutando) {
            System.out.println("\nOpciones:");
            System.out.println("1. Mostrar temperatura");
            System.out.println("2.  registrar temperatura(c°)");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
      switch (opcion) {
                case 1:
                    Controller.mostrarTemperatura();
                    break;
                case 2:
                    System.out.print("Introduce la temperatura(c°): ");
                    String temperatura= scanner.next();
                    temperatura datotemperatura = new temperatura();

                    break;
                case 3:
                    ejecutando = false;
                    System.out.println("Gracias por usar el sistema de control. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        scanner.close();
       }
     }
