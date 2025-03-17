import java.util.Arraylist;
 public class controlador {
      private Calculadora objCalculadora;
   private List<Numeros> numeros;
    private Vista objVista;
    
    public Controlador(){
      this.objCalculadora = new  Calculadora();
     numeros = new ArrayList<>();
      this.objVista = new Vista();    
    }
 switch (operacion) {
                case '+':
                    resultado = objcalculadora.sumar(num1, num2);
                    break;
                case '-':
                    resultado = objcalculadora.restar(num1, num2);
                    break;
                case '*':
                    resultado = objcalculadora.multiplicar(num1, num2);
                    break;
                case '/':
                    try {
                        resultado = objcalculadora.dividir(num1, num2);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                        operacionValida = false;
                    }
                    break;
                default:
                    System.out.println("Operación no válida. Por favor, seleccione una operación válida.");
                    operacionValida = false;
            }
            
            if (operacionValida) {
                System.out.println("El resultado es: " + resultado);
            }
            
            System.out.println("¿Desea realizar otro cálculo? (s/n): ");
            char respuesta = Tomardatos.next().charAt(0);
            if (respuesta != 's' && respuesta != 'S') {
                continuar = false;
            }
        }
        
        System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
        Tomardatos.close();
    }
}
