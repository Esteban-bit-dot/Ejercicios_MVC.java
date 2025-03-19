public class vista {
   public class calculadora {
while (continuar) {
            System.out.println("Ingrese el primer número: ");
            double num1 = Tomardatos.nextDouble();
            System.out.println("Ingrese el segundo número: ");
            double num2 = Tomardatos.nextDouble();
            System.out.println("Seleccione una operación (+, -, *, /): ");
            char operacion = Tomardatos.next().charAt(0);
            double resultado = 0;
            boolean operacionValida = true;
}
  public class Calcular_Oparaciones {
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }
    
    public double restar(double num1, double num2) {
        return num1 - num2;
    }
    
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    
    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return num1 / num2;
    }
}
  }
}
 
